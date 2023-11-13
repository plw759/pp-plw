# Programming Paradigms Project

## Table of Contents

- [About](#about)
- [Instructions](#instructions)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Setups] (#setups)
  - [Docker](#docker)
  - [Pharo] (#pharo)
  - [Notes](#notes)

## About

In this project, you will provide database as a service.
* HASH % N = 0

## Instructions
We will split the project in three parts.
### Part 1
* ANTLR - build lexer and parser and test that it works as expected with random
cypher queries
* Neo4j config - Configure graph database and run Cypher shell and use it to write
some queries
* Client (part 1) that accepts a query, runs it through lexer and parser and prints
it on the screen (or similar)
Due October 2.
#### Expected to deliver:
* A script (bash, Python, or something else that can run easily on Linux) that sets
up Neo4j locally and demostrates successul run of the database. The script should
be end-to-end without any manual step required on the user end.
* Code that implements a client (as described earlier in this document) that gets
input(s), checks queries, prints proper message.
* Code that is needed for checking if queries are valid. (You can commit/push code
for checking even if files are auto generated.)
#### Do NOT include the following:
* Source code for Neo4j
* Neo4j in any form
* Any other library
Whatever you need, should be downloaded by the scripts you are
using/writing. Basically, do not include necessary binaries into your
repository.
### Part 2
* Visualization in Smalltalk by reading a json file from a file system and
visualizing
* Server (part 1) in Go that runs a few preselected queries to Neo4j (configured
earlier)
* Client (part 2) language dependent send a request with the query
* Server (part 2) in Go that accepts the query and run with Neo4j
Due October 23.
### Part 3
* Server (part 3) accept the response and send it to client as the response
* Client (part 3) accept the response from the server and save into json file
* Visualization in OCaml by reading from a json file
* Caching the response in a database for each response
Due November 13.

### Prerequisites

Your implementation should work under the following configuration:
* Linux (any recent distribution)
* 0 - Oracle Java 17 (https://www.oracle.com/java/technologies/downloads)
* 0 - Neo4j v5.x (cloud Graph Database Self-Managed community edition https://
neo4j.com/deployment-center)
* Smalltalk Pharo 11 (https://pharo.org/download)
* Go 1.18+
* Python 3.8+
* gcc 9.4.0+
* h2 2.2.222+
* OCaml 4.08.1+

### Installation

Clone the repo and go to project directory

```bash
# Clone the repository
git clone https://github.com/plw759/pp-plw.git

# Navigate to the project directory
cd project
```

### Setups

Run ./setupNeo4j in server to ensure the database runs, and run ./setupDocker in client to run docker installation script, and run ./setup-graph.sh to download pharo launcher

### Docker

In total there will be 1 network, 2 detached containers, 1 server container, and 2 iterative containers. They will all have --rm so that all containers are automatically removed once stopped.
To setup docker containers after ./setupDocker:

```bash
# Create a docker network that the containers will communicate on
docker network create myNetwork
# Build docker image for server at Dockerfile level
docker build -t server .
# Run docker container with network and container name, and expose port 8080
docker run --rm --name server --network myNetwork -p 8080:8080 server 
# Run docker image of neo4j, note that the docker instance does NOT persist data
docker run --rm --name neo --network myNetwork -p 7474:7474 -p 7687:7687 -d --env NEO4J_AUTH=neo4j/asdfg123 neo4j:5.12.0
# Run docker image of h2
docker run --rm --name h2 --network myNetwork -p 9092:9092 -d --env H2_OPTIONS="-tcp -tcpAllowOthers" thomseno/h2
# Build docker image for client at Dockerfile level
docker build -t client .
# Run docker container with shell to interact with client
docker run -it --rm --name client --network myNetwork -v $(pwd)/client/responses/:/responses client bash
# Build docker image for visualizer at Dockerfile level
docker build -t visualizer .
# Run docker container with network and container name
docker run -it --rm --name visualizer -v $(pwd)/../clientside/client/responses/:/opt/pharo/responses visualizer 
# Cleanup old servers when done by stopping all containers
docker stop neo server client h2 visualizer
```
### Pharo

# The Smalltalk visualizer was initially supposed to run on a docker container, but due to the headless nature of docker, had to be configured with a bash script instead. The instructions for configuring the pharo launcher are as follows:

After running ./setup-graph.sh in graph, pharo launcher will be installed and opened. Then if no pharo11 images are available, you must create a new one and launch it. To grab necessary packges (3), you must select git repositories browser and import from an existing clone by selecting the directory that this repo is located in (pp-plw). Afterwards, load in the project by clicking into each missing package and adding them. Finally, to run the visualizer, open the playground and type `MyMain show.`. This will display the visualization every time it is run.

### Notes

The main script to start a client is called ./s and is executed upon running of client container

Use ` ocamlfind ocamlopt -o myvisual -linkpkg -package yojson myvisual.ml ` to compile visualizer in ocaml