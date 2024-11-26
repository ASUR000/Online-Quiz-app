# Online-Quiz-app


# Online GK Quiz Application
This is an interactive online General Knowledge (GK) quiz application built using Java, MySQL, JDBC, HTML, CSS, and JavaScript. The application allows users to register, log in, participate in a quiz, and view their results.

**Features**
User Registration: Users can register with a username, password, and email.
Login System: Users can log in to participate in the quiz.
Quiz Interface: Multiple-choice questions with four options. Users can select their answer and submit the quiz.
Result Page: After submission, users can see their results, including correct and incorrect answers.
Database: MySQL database stores user details and quiz questions.
Technologies Used
Backend: Java, JDBC, MySQL
Frontend: HTML, CSS, JavaScript
Database: MySQL
Server: Apache Tomcat
Build Tool: Maven
Project Structure
arduino

OnlineGKQuiz/
├── src/
│├── dao/
││├── DBConnection.java
││├── QuestionDAO.java
││├── UserDAO.java
│   ├── model/
│   │   ├── Question.java
│   │   ├── User.java
│   ├── servlet/
│   │   ├── LoginServlet.java
│   │   ├── RegisterServlet.java
│   │   ├── QuizServlet.java
│   │   ├── ResultServlet.java
├── web/
│   ├── css/
│   │   ├── styles.css
│   ├── js/
│   │   ├── script.js
│   ├── index.html
│   ├── login.html
│   ├── register.html
│   ├── quiz.html
│   ├── result.html
├── sql/
│   ├── schema.sql
└── pom.xml

**Database Schema**
Users Table
Stores user data.

sql

CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);
Questions Table
Stores quiz questions and answers.

sql
CREATE TABLE Questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question_text VARCHAR(255) NOT NULL,
    option_a VARCHAR(100),
    option_b VARCHAR(100),
    option_c VARCHAR(100),
    option_d VARCHAR(100),
    correct_option CHAR(1) NOT NULL
);
Installation
Prerequisites
Java 8 or higher
Apache Tomcat or any Java web server
MySQL database server
Maven (for dependency management)
Steps to Run
Clone the repository:

# bash
git clone https://github.com/yourusername/online-gk-quiz-app.git
cd online-gk-quiz-app
Set up MySQL Database:

Create a database named OnlineGKQuiz.
Run the sql/schema.sql file to create the tables.
Configure the database connection:

Modify the DBConnection.java file in the dao package to match your MySQL database configuration (username, password, URL).
Deploy on Apache Tomcat:

**Compile the Java files using Maven:** 
bash
mvn clean install
Deploy the .war file to your Tomcat server or place the application in the webapps directory.
Access the application in your web browser:

Open your browser and go to http://localhost:8080/online-gk-quiz-app/.
**Usage**
Register: Users can create a new account by entering their username, password, and email.
Login: After registration, users can log in to the app.
Take Quiz: Once logged in, users can start the quiz by answering multiple-choice questions.
Submit Quiz: After completing the quiz, users can submit their answers and view the result.
Result Page: The results will display the user's score and the correct answers for each question.

