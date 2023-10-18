# syntax=docker/dockerfile:1

FROM ubuntu:20.04
RUN apt-get update && apt-get install -y golang-go && apt-get install -y curl
WORKDIR /server
COPY /server/ .
#CMD ["curl", "-O", "https://www.antlr.org/download/antlr-4.9.2-complete.jar"]