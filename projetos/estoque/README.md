# Projeto API do Estoque

Projeto para aplicar os conhecimentos da disciplina de POO2.

| Academico:    | [José A. Q. C. Gomes <code>@JoseComparotto</code>](https://github.com/JoseComparotto) | RA: 398439413098     |
| ------------- | ------------------------------------------------------------------------------------- | :------------------: |
| Curso:        | Ciência da Computação                                                                 | Noturno              |
| Professor:    | [Luiz Augusto Rodrigues <code>@profluizao</code>](https://github.com/profluizao)      |                      |
| Disciplina:   | Programação Orientada a Objetos II                                                    | 2024.2 - 6º Semestre |
| Universidade: | [Anhanguera-Uniderp - Matriz](https://www.uniderp.com.br/)                            | Campo Grande, MS     |

## Pilha de Tecnologias

- **OpenAPI 3.0:** Documentação da API compativel com o padrão RESTfull.

- **Java 21.0:** Linguagem de Programação (Back-end)

- **Maven 4.0:** Gerenciador de Pacotes Java

- **Spring-Boot 3.3:** Framework do ecossistema Spring para Back-end

- **Spring Data JPA e Hibernate**: Framework ORM para abstrair a camada de persistência de dados.

- **H2 Database**: Banco de Dados In-Memory.

## Estrutura de Diretórios

```plain
📦estoque
 ┣ 📂docs   // Documentação do projeto
 ┣ 📂pages  // Página para o GitHub Pages com o Swagger UI
 ┗ 📂src/main/java/poo2/estoque
   ┣ 📂config       // Configurações para o Spring-Boot (Ex: CORS)
   ┣ 📂controller   // Camada de Apresentação (DDD), neste caso com os End-Points da API
   ┣ 📂domain       // Camada de Domínio (DDD)
   ┣ 📂repository   // Camada de Repositório (DDD)
   ┣ 📂service      // Camada de Serviço (Proxy Design Pattern)
   ┣ 📂fakedb       // FakeDB: Mock com dados de exemplo
   ┗ 📜EstoqueApplication.java  // Classe Principal Java
 ```

## Especificações da API

- [Open API (JSON)](./docs/openapi.json)
- [Swagger UI](https://josecomparotto.github.io/poo2/projetos/estoque/pages/swagger-ui.html)

## Definições UML

### Diagrama de Classes

```mermaid
---
title: Entidades de Domínio
---
classDiagram

    class BaseId {  <<Abstract>>
        # id: long
        # dataInclusao: Date
        # dataAlteracao: Date
    }
    
    class BaseDescricao {  <<Abstract>>
        # descricao : string
    }
    
    class BasePessoa {  <<Abstract>>
        # nome : string
        # endereco : string
        # cidade : string
        # estado : string
        # cep : string
        # telefone : string
        # email : string
    }

    class ClasseProduto {
    }

    class SubclasseProduto {
        - idClasse : long
    }

    class Produto {
        - idSubclasse : long
    }

    class TipoFuncionario {
    }

    class Funcionario {
        - idTipoFuncionario : long
        - senha : string
    }

    class Cliente {
        - cpf : string
    }

    class Fornecedor {
        - cnpj : string
    }

    BaseId <|-- BaseDescricao : extends
    BaseId <|-- BasePessoa : extends
    BaseDescricao <|-- ClasseProduto : extends
    BaseDescricao <|-- SubclasseProduto : extends
    BaseDescricao <|-- Produto : extends
    BaseDescricao <|-- TipoFuncionario : extends

    BasePessoa <|-- Funcionario : extends
    BasePessoa <|-- Cliente : extends
    BasePessoa <|-- Fornecedor : extends

    SubclasseProduto "1" o-- "*" Produto : aggregation
    ClasseProduto "1" *-- "*" SubclasseProduto : composition

    TipoFuncionario "1" o-- "*" Funcionario: aggregation

```

### Diagrama Entidade-Relacionamento

```mermaid
erDiagram

    ClasseProduto {
        long id PK
        string descricao
        date dataInclusao
        date dataAlteracao
    }

    SubclasseProduto {
        long id PK
        string descricao
        date dataInclusao
        date dataAlteracao
        long idClasse FK
    }

    Produto {
        long id PK
        string descricao
        date dataInclusao
        date dataAlteracao
        long idSubclasse FK
    }

    TipoFuncionario {
        long id PK
        string descricao
        date dataInclusao
        date dataAlteracao
    }

    Funcionario {
        long id PK
        string nome
        string endereco
        string cidade
        string estado
        string cep
        string telefone
        string email
        string senha
        date dataInclusao
        date dataAlteracao
        long idTipoFuncionario FK
    }

    Cliente {
        long id PK
        string nome
        string endereco
        string cidade
        string estado
        string cep
        string telefone
        string email
        string cpf
        date dataInclusao
        date dataAlteracao
    }

    Fornecedor {
        long id PK
        string nome
        string endereco
        string cidade
        string estado
        string cep
        string telefone
        string email
        string cnpj
        date dataInclusao
        date dataAlteracao
    }

    ClasseProduto ||--o{ SubclasseProduto : "has"
    SubclasseProduto ||--o{ Produto : "has"
    TipoFuncionario ||--o{ Funcionario : "has"

```
