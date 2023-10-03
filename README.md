# Programming Paradigms Project

## Table of Contents

- [About](#about)
- [Instructions](#instructions)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Docker](#docker)
  - [Script](#script)

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

### Docker

Then run ./setupNeo4j to ensure the database runs, and run ./setupDocker to run docker installation script

To use docker image ... TBD

```bash
# Build docker container
docker build -t myproject .
# Run docker container with shell
docker container run -it myproject /bin/bash
```

### Script

The main script to start a client is called s and must be run in client directory

```bash
cd client
./s
```