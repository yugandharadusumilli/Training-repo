# Contributing to DevOps Training Application

Thank you for your interest in contributing! This guide will help you get started.

## Getting Started

1. Fork the repository
2. Clone your fork locally
3. Create a new branch for your feature or fix

## Development Workflow

### 1. Create a Feature Branch
```bash
git checkout -b feature/your-feature-name
```

### 2. Make Your Changes
- Write clean, readable code
- Follow Java coding conventions
- Add tests for new features
- Update documentation as needed

### 3. Test Your Changes
```bash
gradle clean build
gradle test
```

### 4. Commit Your Changes
Use meaningful commit messages:
```bash
git add .
git commit -m "feat: add new calculator operation"
```

#### Commit Message Format
- `feat:` - New feature
- `fix:` - Bug fix
- `docs:` - Documentation changes
- `test:` - Adding or updating tests
- `refactor:` - Code refactoring
- `chore:` - Maintenance tasks

### 5. Push to Your Fork
```bash
git push origin feature/your-feature-name
```

### 6. Create a Pull Request
- Provide a clear description of your changes
- Reference any related issues
- Ensure all tests pass

## Code Style Guidelines

- Use meaningful variable and method names
- Add JavaDoc comments for public methods
- Keep methods small and focused
- Follow single responsibility principle
- Maintain test coverage above 80%

## Testing

- Write unit tests for all new code
- Ensure existing tests still pass
- Test edge cases and error conditions

## Questions?

Feel free to open an issue for any questions or concerns.

Happy coding! 🚀
