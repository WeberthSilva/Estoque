# Sistema de Estoque

Sistema de controle de estoque desenvolvido em **Java**, criado para praticar programação orientada a objetos e desenvolver habilidades na resolução de problemas reais.

## Sobre o projeto

O projeto simula um sistema básico de gerenciamento de estoque. Atualmente, permite cadastrar produtos, buscar produtos pelo código, listar produtos cadastrados e adicionar quantidades ao estoque.

O desenvolvimento está sendo realizado de forma incremental, implementando e testando cada funcionalidade antes de avançar para a próxima.

## Funcionalidades implementadas

* Cadastro de produtos
* Listagem de produtos cadastrados
* Busca de produto pelo código
* Adição de produtos ao estoque
* Validação de preço
* Validação de quantidade
* Verificação de código de produto duplicado
* Armazenamento dos produtos utilizando `List` e `ArrayList`

## Regras de negócio

* O código do produto deve ser único.
* O preço não pode ser negativo.
* A quantidade não pode ser negativa.
* Um produto pode ser localizado através do seu código.
* Produtos podem receber novas quantidades no estoque.
* Um produto é considerado com estoque baixo quando possui **5 unidades ou menos**.

> Algumas regras já estão definidas no projeto, enquanto outras serão implementadas nas próximas etapas.

## Tecnologias

* Java
* Programação Orientada a Objetos (POO)
* `List`
* `ArrayList`
* Git
* GitHub

## Estrutura do projeto

```text
Estoque/
├── Produto.java
├── Estoque.java
├── Main.java
└── README.md
```

## Classe Produto

A classe `Produto` representa um produto armazenado no estoque.

### Atributos

```text
nome
codigo
preco
quantidade
```

A classe utiliza encapsulamento por meio de atributos privados e métodos getters e setters.

Também possui validações para impedir valores negativos de preço e quantidade.

## Classe Estoque

A classe `Estoque` é responsável pelo gerenciamento dos produtos.

Os produtos são armazenados em:

```java
List<Produto>
```

Atualmente, a classe possui funcionalidades para:

* Adicionar produtos
* Impedir produtos com códigos duplicados
* Buscar produtos pelo código
* Listar produtos cadastrados
* Adicionar quantidade ao estoque

## Exemplo

Um produto pode ser criado da seguinte forma:

```java
Produto produto = new Produto(
    "Fone",
    404,
    25.0,
    39
);
```

Depois, ele pode ser adicionado ao estoque:

```java
Estoque estoque = new Estoque();

estoque.adicionarProduto(produto);
```

## Próximos passos

* Finalizar validações do método `adicionarEstoque()`
* Implementar retirada de produtos do estoque
* Impedir retirada maior que a quantidade disponível
* Implementar verificação de estoque baixo
* Calcular o valor total do estoque
* Melhorar os testes
* Organizar melhor a estrutura do projeto
* Futuramente transformar o projeto em uma API REST com Spring Boot
* Futuramente integrar com PostgreSQL

## Objetivo

Este projeto faz parte da prática de desenvolvimento com Java, utilizando um problema próximo de uma situação real para desenvolver:

* Lógica de programação
* Programação Orientada a Objetos
* Estrutura de dados
* Regras de negócio
* Organização de código
* Git e GitHub

O projeto será desenvolvido gradualmente, adicionando novas funcionalidades conforme o aprendizado.

