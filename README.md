# 📘 Book Management System (Spring Boot + JWT)

A secure RESTful API built using **Spring Boot** that allows authenticated users to manage a collection of books. It supports **JWT-based authentication**, basic **CRUD operations**, and is documented using **Swagger**.

---

## 🚀 Features

- 📌 User registration and login using **JWT authentication**
- 🔐 Secure access to all endpoints (requires valid JWT token)
- 📚 Book management operations:
  - Add a new book
  - View all books
  - View a book by ISBN
  - Update a book by ISBN
  - Delete a book by ISBN
- 🛡️ Input validation and global exception handling
- 🧪 Unit tests for service layer
- 🧾 API documentation via Swagger UI

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot 3**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Spring Data JPA**
- **Hibernate**
- **H2 / MySQL Database**
- **Swagger - Springdoc OpenAPI**

---

## 📂 Project Structure

```
com.example.demo
├── config                  # Security & JWT config
├── controller             # REST endpoints
├── model                  # Book entity
├── repository             # JPA repositories
├── service                # Business logic
├── exception              # Custom/global exceptions
└── dto                    # Request/Response payloads
```

---

## 🔐 Authentication Flow

1. **Register/Login** using `/auth/register` or `/auth/login`
2. Receive a **JWT token**
3. Use the token in the `Authorization` header:
   ```
   Authorization: Bearer <your-token>
   ```

---

## 🧪 Example API Usage

### 🔐 Login
```
POST /auth/login
{
  "email": "user@example.com",
  "password": "password123"
}
```

### 📚 Add Book
```
POST /addbook
Authorization: Bearer <your-jwt-token>
{
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "isbn": 123456,
  "publicationYear": 2008
}
```

---

## 📖 Swagger UI

Access all endpoints easily via Swagger at:  
```
http://localhost:8080/swagger-ui/index.html
```

---

## ✅ How to Run

1. Clone the repo:
   ```
   git clone https://github.com/your-username/book-management-system.git
   cd book-management-system
   ```

2. Build and run the app:
   ```
   mvn spring-boot:run
   ```

3. Access Swagger UI and test the endpoints.

---

## 👨‍💻 Author

- **Udhaya Moorthy**
- 💼 Spring Boot | Java | REST APIs | JWT Security



PPT Link

https://docs.google.com/presentation/d/1VN3f1qFk0-0HZxgx_cwZ3Tvcz-QOLvEa/edit?usp=sharing&ouid=101941230146649101203&rtpof=true&sd=true
