# **API Clientes e Carros**

Este projeto é uma API REST desenvolvida com **Spring Boot** para gerenciar as entidades **Cliente** e **Carro**. A API permite realizar operações CRUD (Create, Read, Update, Delete) e utiliza o banco de dados **PostgreSQL**.


---

## **Tecnologias Utilizadas**
- **Java 21** 
- **Spring Boot 3.x**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Maven**

---

## **Pré-requisitos**
1. Ter o **Java 21** ou superior instalado.
2. Ter o **PostgreSQL** instalado e configurado.
3. Ferramentas opcionais para testar a API:
    - **Insomnia** ou **Postman**.
4. Editor de código (recomendado: **IntelliJ IDEA** ou **Eclipse**).

---

## **Configuração do Projeto**

### **1. Configurar o Banco de Dados**
Crie um banco de dados no PostgreSQL com o nome desejado. Por exemplo:

```sql
CREATE DATABASE api_clientes_carros;
```

### **2. Configurar o application.properties**
Edite o arquivo src/main/resources/application.properties com as configurações do seu banco:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/api_clientes_carros
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### **3. Instalar Dependências**
Execute o comando abaixo no terminal, dentro do diretório do projeto:
```
mvn clean install
```

### **4. Rodar a Aplicação**
Execute o projeto com o comando:
```
mvn spring-boot:run
```

A aplicação estará disponível em: http://localhost:8080.

## **Endpoints**
#### Base URL
##### http://localhost:8080


### **Endpoints para Clientes**

| Método HTTP | Endpoint         | Descrição                      |
|-------------|------------------|--------------------------------|
| POST        | `/clientes`      | Cria um novo cliente           |
| GET         | `/clientes`      | Lista todos os clientes        |
| GET         | `/clientes/{id}` | Busca um cliente por ID        |
| PUT         | `/clientes/{id}` | Atualiza um cliente por ID     |
| DELETE      | `/clientes/{id}` | Remove um cliente por ID       |

### **Endpoints para Carros**

| Método HTTP | Endpoint       | Descrição                      |
|-------------|----------------|--------------------------------|
| POST        | `/carros`      | Cria um novo carro             |
| GET         | `/carros`      | Lista todos os carros          |
| GET         | `/carros/{id}` | Busca um carro por ID          |
| PUT         | `/carros/{id}` | Atualiza um carro por ID       |
| DELETE      | `/carros/{id}` | Remove um carro por ID         |


## **Testando a API**
### **Utilize ferramentas como Insomnia ou Postman para enviar requisições.**
### Para cada requisição, utilize o cabeçalho:
### **Clientes**
- **POST** `/clientes`  
  Cria um novo cliente.  
  **Exemplo de Body**:
  ```
  {
    "nome": "João Silva",
    "email": "joao.silva@example.com",
    "telefone": "123456789"
  }
- **GET**  `/clientes`
  Lista todos os clientes.
  **Resposta (exemplo)**:
  ```
  [
    {
      "id": 1,
      "nome": "João Silva",
      "email": "joao.silva@example.com",
      "telefone": "123456789"
    }
  ]

- **GET**  `/clientes/2`
  Busca o cliente pelo id.
  **Resposta (exemplo)**:
  ```
  [
    {
      "id": 2,
      "nome": "Kaue Magnus",
      "email": "kauemagnus@gmail.com",
      "telefone": "4896503932"
    }
  ]
  
- **PUT** `/clientes/1`
  Atualiza o cliente.
  **Exemplo de Body**:
  ```
  {
  "nome": "João Silva Atualizado",
  "email": "joao.silva.novo@example.com",
  "telefone": "987654321"
  }

  - **DELETE** `/clientes/1`
    Deleta o cliente.

### **Carros**
- **POST** `/carros`  
  Cria um novo carro.  
  **Exemplo de Body**:
  ```
  {
    "marca": "Toyota",
    "modelo": "Corolla",
    "ano": "2019"
  }
- **GET**  `/carros`
  Lista todos os carros.
  **Resposta (exemplo)**:
  ```
  [
    {
      "id": 1,
      "marca": "Toyota",
      "modelo": "Corolla",
      "ano": "2019"
    }
  ]
  
- **GET**  `/carros/3`
  Busca o carro pelo id.
  **Resposta (exemplo)**:
  ```
  [
    {
      "id": 3,
      "marca": "Fiat",
      "modelo": "Argo",
      "ano": "2022"
    }
  ]
  
- **PUT** `/carros/1`
  Atualiza o carro.
  **Exemplo de Body**:
  ```
  {
  "marca": "Honda",
  "modelo": "Civic",
  "ano": "2020"
  }
  
- **DELETE** `/carros/1`
    Deleta o carro.
  
---

## Desenvolvido por Kaue Magnus e Filipe Hahn.






