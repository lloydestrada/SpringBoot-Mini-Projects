# Mini Library System (Spring Boot)

A simple RESTful API to manage books and authors using Java, Spring Boot, and MySQL.

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- RESTful APIs
- Postman (for testing)


---

##  Database Structure

### `author` Table
| Column     | Type     | Description             |
|------------|----------|-------------------------|
| id         | BIGINT   | Primary Key (auto-gen)  |
| first_name | VARCHAR  | Author's first name     |
| last_name  | VARCHAR  | Author's last name      |
| birthyear  | INT      | Year of birth           |

### `book` Table
| Column         | Type     | Description                        |
|----------------|----------|------------------------------------|
| id             | BIGINT   | Primary Key (auto-gen)             |
| title          | VARCHAR  | Book title                         |
| isbn           | VARCHAR  | ISBN code                          |
| published_year | INT      | Year published                     |
| author_id      | BIGINT   | Foreign key to `author(id)`        |

---

## REST Endpoints

###  Book Controller (`/api/books`)

| Method | Endpoint            | Description         |
|--------|---------------------|---------------------|
| GET    | `/books`            | Get all books       |
| GET    | `/books/{id}`       | Get book by ID      |
| POST   | `/books`            | Add a new book      |
| PUT    | `/books`            | Update a book       |
| DELETE | `/books/{id}`       | Delete book by ID   |

### Author Controller (`/api/authors`)

| Method | Endpoint            | Description           |
|--------|---------------------|-----------------------|
| GET    | `/authors`          | Get all authors       |
| GET    | `/authors/{id}`     | Get author by ID      |
| POST   | `/authors`          | Add a new author      |
| PUT    | `/authors`          | Update an author      |
| DELETE | `/authors/{id}`     | Delete author by ID   |

---

## Sample POST JSON

### Create an Author
```json
{
  "firstName": "George",
  "lastName": "Orwell",
  "birthYear": 1903
}
