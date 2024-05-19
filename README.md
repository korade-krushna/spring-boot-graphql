# GraphQL with Spring Boot and MySQL

This project demonstrates how to use GraphQL with Spring Boot, using a MySQL database and Java 17.

## Prerequisites

- Java 17
- MySQL
- Maven

## Configure the database
  ```yml
    spring:
      graphql:
        graphiql:
          enabled: true
          path: /graphiql
      datasource:
        url: jdbc:mysql://localhost:3306/world?createDatabaseIfNotExist=true
        username: root
        password: root
      jpa:
        hibernate:
          ddl-auto: update
   ```
  add your database credientials here in yml
## Populate the data in database
1. Set the following properties in application.yml and run the application once
  ``` yml
  sql:
      init:
        mode: always
  ```
2. Shut down the application and set below properties and run again
   ``` yml
  sql:
      init:
        mode: never
  ```
## Test GraphQL
  Open `http://http://localhost:8080/graphiql` and test the graphql
