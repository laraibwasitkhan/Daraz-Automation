# Daraz Automation Project

**Author:** Laraib Khan  

This project automates functional testing of **Daraz.pk** using **Selenium WebDriver** and **TestNG** with the **Page Object Model (POM)** design pattern.

## Features

- Search for products (e.g., "electronics")  
- Apply brand and price filters  
- Count products in search results and validate that results are greater than 0  
- Open product details page  
- Verify if free shipping is available  

## Tools & Technologies

- Java  
- Selenium WebDriver  
- TestNG  
- Maven  

## Project Structure

DarazAutomation/
│
├── pom.xml                     # Maven dependencies and project config
│
├── src/
│   └── test/
│       └── java/
│           ├── pages/          # Page Object Model classes
│           │   ├── BasePage.java
│           │   ├── HomePage.java
│           │   ├── SearchPage.java
│           │   └── ProductPage.java
│           │
│           └── tests/          # Test classes
│               └── DarazTest.java
│
└── README.md                   # Project description

## How to Run

1. Clone or download the repository  
2. Open in **IntelliJ IDEA**  
3. Ensure **ChromeDriver** matches your Chrome version  
4. Run the test class `DarazTest.java`  

## Notes

- The project uses **POM** for better maintainability  
- Dynamic elements on Daraz may require updating locators  
- Assertions check that product results exist and free shipping is available
