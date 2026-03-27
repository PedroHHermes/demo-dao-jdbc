# Demo DAO JDBC

Projeto Java demonstrando o padrão DAO (Data Access Object) com JDBC para acesso a banco de dados MySQL.

> Projeto desenvolvido como parte do curso "Java COMPLETO Programação Orientada a Objetos + Projetos" da Udemy.

## Tecnologias

- Java
- JDBC
- MySQL
- Maven

## Estrutura do Projeto

```
src/main/java/
├── application/          # Classes principais de execução
├── db/                   # Classes de conexão e exceções do banco
├── model/
│   ├── entities/         # Entidades: Seller, Department
│   └── dao/              # Interfaces e implementações DAO
│       └── impl/         # SellerDaoJDBC, DepartmentDaoJDBC
```

## Configuração

1. Clone o repositório
2. Crie um arquivo `db.properties` na raiz do projeto baseado no `db.properties.example`:

```properties
user=seu_usuario
password=sua_senha
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false
```

3. Crie o banco de dados MySQL com o script SQL apropriado
4. Execute o projeto

## Funcionalidades

- CRUD completo de Seller (Vendedor)
- CRUD completo de Department (Departamento)
- Padrão DAO com Factory
- Tratamento de exceções customizado
- Gerenciamento de conexões JDBC

## Como Executar

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="application.Program"
```

## Padrão DAO

O projeto implementa o padrão DAO para abstrair o acesso aos dados, separando a lógica de negócio da lógica de persistência.
