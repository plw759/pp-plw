# syntax=docker/dockerfile:1

FROM ubuntu:20.04
RUN apt-get update && apt-get install -y openjdk-17-jdk && apt-get install -y wget && apt-get install -y curl
WORKDIR /client
COPY /client/ .
RUN wget https://www.antlr.org/download/antlr-4.9.2-complete.jar
RUN wget -O h2.jar https://search.maven.org/remotecontent?filepath=com/h2database/h2/2.2.224/h2-2.2.224.jar
ENTRYPOINT ["./s"]