# syntax=docker/dockerfile:1

FROM ubuntu:20.04
RUN apt-get update && apt-get install -y openjdk-17-jdk
WORKDIR /client
COPY /client/ .
CMD ["curl", "-O", "https://www.antlr.org/download/antlr-4.9.2-complete.jar"]

