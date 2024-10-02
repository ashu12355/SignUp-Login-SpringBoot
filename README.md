# SignUp-Login-SpringBoot
This is a simple Spring Boot application that implements user Sign Up and Login functionality.
It stores user information in a MySQL database and allows users to log in with the credentials they used during sign-up.

# Features
User sign-up with username and password.
User login functionality.
Input validation for the login credentials.
Passwords are stored in the database .
Redirects users to a success page after login.
Error message for invalid login credentials.
Built with Spring Boot and MySQL.

# Technologies Used
Spring Boot for the backend framework.
MySQL as the relational database.
Spring Data JPA for database interactions.
Thymeleaf for server-side rendering of views.
Maven for project build management.
Java 23 as the programming language.

# Prerequisites
Before you begin, ensure you have met the following requirements:

You have installed Java 23 or later.
You have installed MySQL.
You have installed Maven.
You have installed Git.
# Installation
Clone the repository: Download the project files to your local machine using Git.

Configure the database: Create a new database in MySQL and update the application properties file with your database credentials (username, password, and URL).

Build and run the application: Use Maven to build and run the Spring Boot application, and then access it via http://localhost:1200.

# Usage
Navigate to the SignUp page to create a new user account.
After signing up, go to the Login page to log in with your credentials.
Upon successful login, you will be redirected to a success page. If the login fails, an error message will be displayed.

If you want to contribute to this project, feel free to fork the repository, make your changes, and submit a pull request.
