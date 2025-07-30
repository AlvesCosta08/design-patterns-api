# 🧩 Spring Design Patterns REST API

Este projeto demonstra a aplicação de **padrões de projeto (Design Patterns)** no contexto de uma **API RESTful** usando **Spring Boot**. Ele foi criado com foco em organização de código, boas práticas de arquitetura, e facilidade de manutenção.

---

## 🎯 Objetivo

Aplicar na prática os seguintes padrões de projeto no backend com Java + Spring:

- **Builder Pattern**: Criação de objetos imutáveis e legíveis.
- **Strategy Pattern**: Encapsulamento de regras de negócio que podem variar.
- **Singleton (via Spring Beans)**: Controle de instância única por contexto.
- **Repository Pattern**: Abstração da persistência com Spring Data.
- **Service Layer Pattern**: Separação da lógica de negócios.
- **DTO Pattern**: Separação da entidade e da camada de transporte.

---

## ⚙️ Tecnologias

| Ferramenta         | Versão        |
|--------------------|---------------|
| Java               | 17+           |
| Spring Boot        | 3.5.4         |
| Spring Data JPA    | 3.2.4         |
| H2 Database        | 2.3.232       |
| Lombok             | 1.18+         |
| Maven              | 3.9+          |

---

## 🧪 Como executar o projeto localmente

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/spring-design-patterns-api.git
cd spring-design-patterns-api

./mvnw spring-boot:run


Acesse o H2 Console (opcional):

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

| Verbo  | Rota        | Descrição               |
| ------ | ----------- | ----------------------- |
| GET    | /users      | Lista todos os usuários |
| GET    | /users/{id} | Busca por ID            |
| POST   | /users      | Cria novo usuário       |
| PUT    | /users/{id} | Atualiza usuário        |
| DELETE | /users/{id} | Remove usuário          |


src
└── main
    └── java
        └── com.alves.designpatterns
            ├── DesignPatternsApplication.java
            ├── controller      --> Camada REST
            ├── service         --> Camada de negócios
            ├── strategy        --> Padrões Strategy aplicados
            ├── domain          --> Entidades JPA (models)
            ├── repository      --> Interfaces Spring Data
            └── dto             --> Transferência de dados (DTOs)

✅ Builder Pattern com Lombok
java
Copiar
Editar
UserDTO dto = UserDTO.builder()
    .name("Alves")
    .email("alves@email.com")
    .build();

✅ Strategy Pattern
Criado para aplicar diferentes comportamentos na lógica de cadastro de usuários, usando uma interface UserRegistrationStrategy.

🧼 Convenções
Lombok para reduzir boilerplate.

DTOs para desacoplar API da base de dados.

Tratamento de erros centralizado.

Padronização de logs e mensagens.

📈 Melhorias futuras
Cobertura com Testes Unitários (JUnit 5 + Mockito).

Inclusão de Swagger/OpenAPI.

Integração com bancos como PostgreSQL ou MySQL.

Aplicar padrões como Chain of Responsibility e Adapter.

🧑‍💻 Autor
Desenvolvido por Alves