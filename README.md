# LambdaTestSelenium101

A Java-based Selenium automation testing framework using TestNG for web application testing.

## Prerequisites

- **JDK 17+**
- **Maven 3.6.0+**
- **Google Chrome** (latest version)

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/tanika1/LambdaTestSelenium101.git
   cd LambdaTestSelenium101/lambdaTestSelenium101
   ```

2. Install dependencies:
   ```bash
   mvn clean install
   ```

## Running Tests

Run all tests:
```bash
mvn test
```

Run specific test class:
```bash
mvn test -Dtest=SimpleFormPageTest
```

## Project Structure

```
src/
├── main/java/          # Main source code
└── test/java/          # Test cases
    └── com/lambdaTest/testcases/
```

## Tech Stack

| Component | Version |
|-----------|---------|
| Selenium | 4.8.3 |
| TestNG | 7.7.1 |
| WebDriverManager | 5.9.2 |
| Java | 17 |

## Troubleshooting

**ChromeDriver version mismatch?**
- Update WebDriverManager in `pom.xml` to match your Chrome version
- Run: `mvn clean install`

**Chrome not found?**
- Ensure Google Chrome is installed on your system

## Author

[@tanika1](https://github.com/tanika1)
