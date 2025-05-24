# 📚 DSList API - Projeto Spring Boot

Este projeto consiste em uma API RESTful construída com Java e Spring Boot, simulando uma lista de jogos, suas posições e associações entre listas e jogos. O projeto segue boas práticas de arquitetura em camadas, uso de DTOs, e integração com banco de dados relacional.



## 🚀 Tecnologias Utilizadas

### 👨‍💻 Backend
- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **Bean Validation (JSR 380)**

### 🗃️ Banco de Dados
- **PostgreSQL**
- **Flyway** *(opcional para versionamento do schema)*
- **Database Seeding** via `CommandLineRunner`

### 🌐 Comunicação
- **HTTP / REST API**
- **JSON** como formato de dados
- **DTOs (Data Transfer Objects)**
- **Projections** para otimização de queries

### ⚙️ Arquitetura
- **Padrão em camadas**: Controller, Service, Repository
- **ORM com JPA**
- **Relacionamentos Many-to-Many com classe de associação (`@EmbeddedId`)**

### 🛠️ DevOps / Infraestrutura
- **Docker & Docker Compose**
- **Perfis de projeto**: `dev`, `test`, `prod`
- **CORS Config**: para integração com frontends externos
- **CI/CD** *(ex: GitHub Actions, GitLab CI)*

