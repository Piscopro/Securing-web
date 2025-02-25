# Securing a Web Application

Name: Trần Vỹ Anh
StudentID: 22024508

## Overview
This project demonstrates how to secure a web application using Spring Boot and Spring Security. It provides basic authentication and authorization features, utilizing a simple in-memory user store.

## Key Features
- User authentication and authorization
- Custom login page
- In-memory user store
- Thymeleaf templates for the user interface

## Installation Guide
1. Create a database name `securitydb`

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Usage Guide
- Access the application at `http://localhost:8080`
- Log in with the following credentials:
  - User:
      - Username: `user`
      - Password: `password`
  - Admin:
      - Username: `admin`
      - Password: `admin`

## Extend Version
### Store data in DataBase and BCryptPasswordEncoder
![Database](initial/src/main/resources/pictures/erd.png)
![Database](initial/src/main/resources/pictures/user_table.png)
![Database](initial/src/main/resources/pictures/user_roles_table.png)
![Database](initial/src/main/resources/pictures/role_table.png)

### User
![Database](initial/src/main/resources/pictures/user_1.png)
![Database](initial/src/main/resources/pictures/user_2.png)
### Admin 
![Database](initial/src/main/resources/pictures/admin_1.png)
![Database](initial/src/main/resources/pictures/admin_2.png)
### Register new user
![Database](initial/src/main/resources/pictures/register.png)
![Database](initial/src/main/resources/pictures/user_3.png)
![Database](initial/src/main/resources/pictures/user_4.png)
