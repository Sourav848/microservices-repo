# Microservices Project: Validation and Partner Validation

This project consists of two microservices: Validation and Partner Validation. These microservices handle validation tasks and partner-specific validation, respectively.

## Features

- **Validation Service**: Responsible for general validation tasks such as input validation, data format validation, etc.
- **Partner Validation Service**: Handles partner-specific validation tasks, tailored to the requirements of individual partners.
- **Global Exception Handling**: Exception handling is implemented at the global level to ensure consistent error responses across both services.

## Technologies Used

- **Spring Boot**: Used for building and running the microservices.
- **Java**: The primary programming language for both microservices.
- **RESTful APIs**: Communication between microservices and clients is done via RESTful APIs.
- **Swagger**: API documentation is provided using Swagger UI.

## Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven (for building the project)
- Docker (optional, for containerization)

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/microservices-validation.git
