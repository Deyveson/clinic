# clinic

# Clinica

## Descrição do Projeto

### Back-end

API REST para CRUD de produtos, feito em Java. Foram usadas as seguintes tecnologias:
* Spring Boot
* Swagger
* Google Cloud (Postgress)
* Hibernate

É possível acessar a documentação da API (Swagger-ui) através do link http://localhost:8000/swagger-ui.html quando a aplicação está em execução. Foram implementados testes básicos de integração.

## Configuração e Execução

### Execução Local

#### Front-end

Na pasta front, digite:
> npm install

> ng serve --open

O front-end será executado em http://localhost:4200.

#### Back-end

Na pasta back, digite:
>mvn spring-boot:run

O back-end será executado em http://localhost:8000.

### Docker

Foi disponibilizado um arquivo **docker-compose.yml** contendo os conteiners necessários à execução, já configurados. Para executar a aplicação usando docker, basta executar o compose.
> docker-compose up
