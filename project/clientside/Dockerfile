# syntax=docker/dockerfile:1

FROM ubuntu:20.04
RUN apt-get update && apt-get install -y openjdk-17-jdk && apt-get install -y curl && apt-get install -y iputils-ping
WORKDIR /client
COPY /client/ .
RUN curl -O https://www.antlr.org/download/antlr-4.9.2-complete.jar
ENTRYPOINT ["./s"]