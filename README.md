# Quarkus :wrench: Basic setup

## About Quarkus and this example

[Quarkus](https://quarkus.io/) is a Kubernetes Native Java stack tailored for OpenJDK HotSpot and GraalVM.

It provides a fast boot time, low RSS memory and offers near instant scale up and high density memory utilization in container orchestration platforms like Kubernetes.

In this example you can check how to simply build and run a Quarkus application with a very simple API endpoint.

## Technical requirements

- [Maven](https://maven.apache.org/), for project management
- A [JDK](https://www.oracle.com/java/technologies/downloads). This is example is built on version 19

## How to set up the project

First we need to create a new project and add the [pom.xml](pom.xml) with the required dependencies and plugins
  - quarkus-resteasy - _to import Rest Easy API implementation_
  - quarkus-maven-plugin - _The Maven's plugin for Quarkus compilation_
  - quarkus-junit5 - _The Quarkus Junit library for testing_
  - rest-assured - _For API testing_
  - maven-surefire-plugin - _a Maven's plugin to run the tests upon packaging_

Add also the [application.properties](src/main/resources/application.properties) to specify a context path such as _/app_

Then it is just a matter of creating a simple API with a GET endpoint by adding a  [GreetingsResource](src/main/java/com/codewithhades/quarkus/basicsetup/GreetingsResource.java).

We will also add a [GreetingsResourceTest](src/test/java/com/codewithhades/quarkus/basicsetup/GreetingsResourceTest.java) in order to check that the REST API behaves as expected.

## How to run the Quarkus application

Use Maven to package the JAR (and run the test), and then run the JAR with Java from a console
````bash
mvn clean package  
java -jar target/quarkus-app/quarkus-run.jar
````
Once your Quarkus application is running you can browse [localhost:8080/app/api](http://localhost:8080/app) and check the greeting message!

## And before you go...

:pray: I hope you find this example useful and if you want to support me in my mission to help our fellow Java developers please consider starring and sponsoring this space!

:coffee: May Java be with you!
