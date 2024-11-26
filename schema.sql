CREATE DATABASE OnlineGKQuiz;

USE OnlineGKQuiz;

CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE Questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question_text VARCHAR(255) NOT NULL,
    option_a VARCHAR(100),
    option_b VARCHAR(100),
    option_c VARCHAR(100),
    option_d VARCHAR(100),
    correct_option CHAR(1) NOT NULL
);
