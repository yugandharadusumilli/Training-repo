# DevOps Training Application

A simple Java application for practicing DevOps workflows and Git operations.

## Project Structure

```
devops-training-app/
├── src/
│   ├── main/java/com/devops/training/
│   │   ├── App.java           # Main application
│   │   └── Calculator.java    # Calculator utility
│   └── test/java/com/devops/training/
│       ├── AppTest.java        # App tests
│       └── CalculatorTest.java # Calculator tests
├── build.gradle               # Gradle build configuration
└── settings.gradle            # Gradle settings
```

## Prerequisites

- Java 11 or higher
- Gradle 6.0 or higher (or use the Gradle wrapper)

## Build Commands

### Build the project
```bash
gradle build
```

### Run the application
```bash
gradle run
```

### Run tests
```bash
gradle test
```

### Create distribution files
```bash
gradle assembleDist
```

Distribution files will be created in `build/distributions/`

### Clean build artifacts
```bash
gradle clean
```

## Git Workflow Practice

1. **Initialize repository**
   ```bash
   git init
   git add .
   git commit -m "Initial commit: Add sample Java application"
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/new-feature
   ```

3. **Make changes and commit**
   ```bash
   git add .
   git commit -m "Add new feature"
   ```

4. **Merge back to main**
   ```bash
   git checkout main
   git merge feature/new-feature
   ```

## DevOps Practice Ideas

- Set up CI/CD pipeline with GitHub Actions or Jenkins
- Create Docker container for the application
- Implement automated testing
- Set up code quality tools (SonarQube, Checkstyle)
- Practice branching strategies (GitFlow, trunk-based)
- Implement semantic versioning

## License

This is a training project for educational purposes.
