# Desafio back-end Java BTG-Pactual

Desafio para estudo sobre consumo de filas do rabbitMQ e consumo de dados por uma API Rest

## Tecnologias utilizadas:

- Java 21
- Spring 3.3.4
- RabbitMQ
- MongoDB
- Docker

## Sobre o desafio:

Sistema de compras onde recebe na fila do rabbitMQ um pedido é tratado e persistido num banco noSQL mongoDB,
o valor total dos pedidos do cliente é somado e retornado por uma API.