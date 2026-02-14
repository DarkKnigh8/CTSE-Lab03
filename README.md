# CTSE-Lab03: Product Service Microservice

A Spring Boot microservice for managing products with REST API endpoints for CRUD operations.

## Project Overview

This project implements a **Product Service** - a RESTful microservice built with Spring Boot that manages product data using a relational database. The service provides endpoints to create, read, and delete products.

## Technology Stack

- **Framework**: Spring Boot 4.0.2
- **Language**: Java 17
- **Build Tool**: Maven
- **Database**: H2 (In-memory relational database)
- **ORM**: Spring Data JPA (Jakarta Persistence)
- **API Type**: REST

## Project Structure

```
product-service/
├── pom.xml                    # Maven configuration
├── src/
│   ├── main/
│   │   ├── java/com/sliit/product_service/
│   │   │   ├── ProductServiceApplication.java    # Spring Boot application entry point
│   │   │   ├── controller/
│   │   │   │   └── ProductController.java        # REST controller for product endpoints
│   │   │   ├── model/
│   │   │   │   └── Product.java                  # Product entity model
│   │   │   └── repository/
│   │   │       └── ProductRepository.java        # JPA repository for database operations
│   │   └── resources/
│   │       └── application.properties            # Application configuration
│   └── test/
│       └── ProductServiceApplicationTests.java   # Unit tests
```

## Product Model

The `Product` entity has the following attributes:

- **id** (Long): Unique identifier (Auto-generated)
- **name** (String): Product name
- **price** (double): Product price

## API Endpoints

All endpoints are prefixed with `/products`

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/products` | Create a new product |
| GET | `/products` | Get all products |
| GET | `/products/{id}` | Get product by ID |
| DELETE | `/products/{id}` | Delete product by ID |

### Request/Response Examples

**Create Product (POST /products)**
```json
{
  "name": "Laptop",
  "price": 1200.00
}
```

**Get All Products (GET /products)**
```json
[
  {
    "id": 1,
    "name": "Laptop",
    "price": 1200.00
  }
]
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+

### Build and Run

1. Navigate to the project directory:
```bash
cd product-service
```

2. Build the project:
```bash
mvn clean package
```

3. Run the application:
```bash
mvn spring-boot:run
```

The service will start on `http://localhost:8080`

### H2 Database Console

Access the H2 database console at:
```
http://localhost:8080/h2-console
```

## API Documentation (Swagger UI)

Interactive API documentation is available at:
```
http://localhost:8080/swagger-ui/index.html
```

This provides an interactive interface to explore and test all available endpoints. Swagger UI automatically generates documentation from Spring annotations on the REST controllers.

## Testing

The project includes unit tests for validating the application functionality.

### Running Tests

Execute the tests using Maven:
```bash
mvn test
```

### Test Dependencies

- **spring-boot-starter-data-jpa-test**: Testing utilities for JPA
- **spring-boot-starter-webmvc-test**: Testing utilities for Spring MVC controllers

### Key Test Files

- `ProductServiceApplicationTests.java`: Main test class for the application

## Dependencies

- **spring-boot-starter-webmvc**: Web MVC framework for REST endpoints
- **spring-boot-starter-data-jpa**: JPA abstraction for database operations
- **h2**: In-memory relational database
- **spring-boot-h2console**: H2 database web console
- **springdoc-openapi-starter-webmvc-ui** (v2.5.0): Automatic OpenAPI 3.0 documentation and Swagger UI integration
