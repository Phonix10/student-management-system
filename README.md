# student-management-system
A Spring Boot-based RESTful API that allows you to manage students — including creating, reading, updating, and deleting student records — using MySQL as the database.

---

## 🚀 Features

- ✅ Create, Read, Update, Delete (CRUD) operations on students
- ✅ Follows MVC architecture
- ✅ RESTful API using Spring Boot
- ✅ MySQL database integration using Spring Data JPA
- ✅ Unit testing with JUnit & Mockito

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3.5.3
- Spring Data JPA
- Spring Web
- Spring Security (configurable)
- MySQL
- Lombok
- Gradle (build tool)
- Postman for API testing

## 📦 API Endpoints

| Method | Endpoint                | Description             |
|--------|-------------------------|-------------------------|
| POST   | `/api/students`         | Add new student         |
| GET    | `/api/students`         | Get all students        |
| GET    | `/api/students/{id}`    | Get student by ID       |
| PUT    | `/api/students/{id}`    | Update student          |
| DELETE | `/api/students/{id}`    | Delete student          |

## 🔧 Setup Instructions

### 1. Clone the repo
```bash
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```
### 2. Configure MySQL
Make sure MySQL is running and a database exists:

```sql
SQL
CREATE DATABASE student_db;
```
Update your application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the App
```bash
./gradlew bootRun
```
### 4. Test with Postman
Send requests to:

```bash
http://localhost:8080/api/students
```
Use JSON body like:

```
json
{
  "name": "Udit Ranjan",
  "age": 21,
  "phoneNumber": "9876543210",
  "studentClass": "B.Tech IT",
  "email": "udit@example.com"
}
```


