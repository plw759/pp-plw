# syntax=docker/dockerfile:1

FROM golang:1.18
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get install -y openjdk-17-jdk 
WORKDIR /server
COPY /server/ .
#RUN ./setupNeo4j
RUN go get github.com/neo4j/neo4j-go-driver/v5
CMD [ "go", "run", "Main.go"] 
