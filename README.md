# Desafio-api-dio-santander-bootcamp
RESTful API para desafio de projeto da Digital Innovation One criada em Java 17 com Spring Boot 3.1.4

# Principais tecnologias utilizadas
+ Java 17
+ Spring Boot 3.1.4
+ Spring Web
+ Spring JPA Data
+ Open API (Swagger)
+ Railway


## Diagrama de Classes

```mermaid

classDiagram
  class User {
    - Long id
    - String name
    - Account account
    - MustWatch[] mustwatch
    - Favorite[] favorites
  }

  class Account {
    - Long id
    - String username
    - String icon
    - String bio
  }

  class MustWatch {
    - Long id
    - String name
    - Number season
    - String genre
    - String broadcaster
  }

  class Favorite {
    - Long id
    - String name
    - String genre
    - String broadcaster
  }

  User "1" *-- "1" Account
  User "1" *-- "N" MustWatch
  User "1" *-- "1" Favorite
```

# Documentação da API (Swagger)

Disponível em [http://sb-dio-desafio-api-production.up.railway.app](https://sb-dio-desafio-api-production.up.railway.app/swagger-ui/index.html)

# URL de produção

https://sb-dio-desafio-api-production.up.railway.app/users/1
