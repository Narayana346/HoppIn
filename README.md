# HoppIn - Vacation Rental Platform

HoppIn is a full-featured vacation rental platform backend built with Spring Boot. It provides robust APIs for property listings, bookings, user management, and more.

## 🚀 Features

- **Dual API Support**
  - RESTful APIs for web and mobile clients
  - High-performance gRPC APIs for service-to-service communication

- **Reactive Programming**
  - Built with Spring WebFlux for non-blocking I/O
  - Reactive data access with R2DBC and reactive MongoDB
  - Asynchronous HTTP calls with WebClient

- **Data Management**
  - Hybrid database support (Relational + NoSQL)
  - Efficient data access with Spring Data
  - Database migrations with Flyway

- **Core Services**
  - Secure authentication and authorization with JWT
  - Property listing management
  - Booking and reservation system
  - User profile and review system

## 🛠 Tech Stack

- **Backend**: Spring Boot 3.x, WebFlux, gRPC
- **Databases**: PostgreSQL, MongoDB
- **Authentication**: JWT, Spring Security
- **Build Tool**: Gradle with Kotlin DSL
- **Containerization**: Docker, Docker Compose
- **API Documentation**: SpringDoc OpenAPI

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Docker and Docker Compose
- Gradle 8.0 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/hoppin.git
   cd hoppin
   ```

2. Start the required services using Docker Compose:
   ```bash
   docker-compose up -d
   ```

3. Build and run the application:
   ```bash
   ./gradlew bootRun
   ```

The application will be available at `http://localhost:8080`

## 📚 API Documentation

Once the application is running, you can access:
- REST API Documentation: `http://localhost:8080/swagger-ui.html`
- gRPC services are available on port 9090

## 🧪 Testing

Run the test suite with:
```bash
./gradlew test
```

## 🤝 Contributing

Contributions are welcome! Please read our [Contributing Guidelines](CONTRIBUTING.md) for details.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Built with ❤️ by the HoppIn Team
