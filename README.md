# BDD Cucumber Framework

This is a Behavior-Driven Development (BDD) automation framework designed for web application testing. It utilizes:

- **Selenium WebDriver**: For browser automation.
- **Cucumber (BDD)**: To write human-readable test scenarios.
- **TestNG**: As the test execution framework.
- **Extent Reports**: For detailed test reporting.
- **Maven**: For project dependency management.

## 🔧 Technologies Used

- **Programming Language**: Java
- **Build Tool**: Maven
- **Test Framework**: TestNG
- **BDD Framework**: Cucumber
- **Automation Tool**: Selenium WebDriver
- **Reporting**: Extent Reports

## 📁 Project Structure

src/
├── main/
│ └── java/
│ ├── com/
│ └── automation/
│ ├── pages/ # Page Object Model classes
│ ├── utils/ # Utility classes
│ └── runners/ # TestNG runners
└── test/
└── java/
└── com/
└── automation/
└── stepdefinitions/ # Cucumber step definitions
features/ # Gherkin feature files
reports/ # Generated test reports
pom.xml # Maven project configuration

