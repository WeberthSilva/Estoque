# Sistema de Estoque

Sistema de controle de estoque desenvolvido em **Java**, criado para praticar programação orientada a objetos e resolução de problemas reais.

## Sobre o projeto

O sistema permite cadastrar produtos e controlar informações básicas do estoque, aplicando regras de negócio para evitar dados inválidos e produtos duplicados.

## Funcionalidades

* Cadastro de produtos
* Listagem de produtos
* Busca de produtos por código
* Adição de produtos ao estoque
* Controle de produtos com estoque baixo
* Validação de preço e quantidade
* Verificação de códigos de produtos duplicados

## Tecnologias

* Java
* Programação Orientada a Objetos
* `List`
* `ArrayList`
* Git
* GitHub

## Estrutura atual

```text
src/
├── Produto.java
├── Estoque.java
└── Main.java
```

### Produto

A classe `Produto` representa um produto do estoque.

Possui os seguintes atributos:

```text
nome
codigo
preco
quantidade
```

Também possui validações para impedir preço e quantidade negativos.

### Estoque

A classe `Estoque` é responsável pelo gerenciamento dos produtos.

Os produtos são armazenados em uma:

```java
List<Produto>
```

O sistema também verifica se já existe um produto com o mesmo código antes de adicioná-lo.

## Regras de negócio

* O código do produto deve ser único.
* O preço não pode ser negativo.
* A quantidade não pode ser negativa.
* Não é permitido retirar mais produtos do que existem no estoque.
* Um produto é considerado com estoque baixo quando possui **5 unidades ou menos**.

## Objetivo

Este projeto faz parte da prática de desenvolvimento backend com Java, utilizando problemas próximos de situações reais para desenvolver lógica de programação, orientação a objetos e organização de código.

## Próximos passos

* Implementar busca de produtos por código
* Implementar listagem dos produtos
* Implementar entrada e saída de produtos
* Implementar verificação de estoque baixo
* Calcular o valor total do estoque
* Criar testes
* Evoluir o projeto para uma API REST com Spring Boot
* Integrar com PostgreSQL
