

# Family Authentication System

This is a Spring Boot application that provides basic authentication and family management functionality. The application uses MongoDB as its data store and Thymeleaf as its template engine for the front-end.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Family Authentication System allows users to register and log in. Once logged in, users can view a list of families and details about each family, including its members.

## Features

- User Registration
- User Login
- Viewing a list of families
- Viewing details of a specific family

## Prerequisites

- Java 8 or higher
- Maven
- MongoDB

## Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/your-username/family-authentication-system.git
    cd family-authentication-system
    ```

2. **Configure MongoDB:**

    Ensure MongoDB is running on your local machine or adjust the MongoDB connection settings in `application.properties` to point to your MongoDB instance.

3. **Build the project:**

    ```sh
    mvn clean install
    ```

## Running the Application

1. **Run the application:**

    ```sh
    mvn spring-boot:run
    ```

2. **Access the application:**

    Open your web browser and go to `http://localhost:8080`.

## Endpoints

- **GET /login** - Displays the login form.
- **POST /login** - Authenticates the user.
- **GET /register** - Displays the registration form.
- **POST /register** - Registers a new user.
- **GET /families** - Lists all families (accessible after login).
- **GET /families/{familyId}** - Displays details of a specific family (accessible after login).

## Usage

1. **Register a new user:**

    Navigate to `http://localhost:8080/register` and fill out the registration form.

2. **Log in with an existing user:**

    Navigate to `http://localhost:8080/login` and fill out the login form.

3. **View families:**

    Once logged in, navigate to `http://localhost:8080/families` to see a list of families. Click on a family name to view its details.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License.