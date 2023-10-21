# syntax=docker/dockerfile:1

FROM ubuntu:20.04
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get install -y golang-go
WORKDIR /server
COPY /server/ .
CMD [ "go", "run", "Main.go"] 
