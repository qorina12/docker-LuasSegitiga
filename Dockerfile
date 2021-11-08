FROM openjdk:8-jdk-alpine
MAINTAINER qorina12 <1941720049@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY Segitiga.java /java

#compile file java
RUN javac Segitiga.java

#running java
ENTRYPOINT java Segitiga