# 🏢 Sistema de Gerenciamento de Funcionários

Um sistema de linha de comando (CLI) desenvolvido em Java para gerenciar dados de funcionários, calcular reajustes salariais e gerar relatórios agrupados. 

Este projeto foi inicialmente desenvolvido como um teste prático e, posteriormente, **refatorado** para melhorar a legibilidade, aplicar princípios de Orientação a Objetos e utilizar recursos mais modernos do Java.

## 🚀 O Projeto

O sistema simula o setor de Recursos Humanos de uma empresa, permitindo a manipulação de uma lista de funcionários através de um menu interativo. As operações incluem inserção, remoção, atualizações salariais e filtragem de dados usando a API de Collections do Java.

### Funcionalidades (Requisitos Atendidos)
1. **Inserção de Funcionários:** Cadastro em lote de funcionários pré-definidos.
2. **Remoção:** Exclusão de funcionários pelo nome (ex: "João").
3. **Listagem Formatada:** Exibição de todos os funcionários com datas no padrão `dd/MM/yyyy` e salários com padrão brasileiro (`R$ 1.000,00`).
4. **Reajuste Salarial:** Aplicação de 10% de aumento para todos os funcionários.
5. **Agrupamento por Função:** Estruturação dos dados em um `Map` (Função -> Lista de Funcionários).
6. **Relatório por Função:** Impressão dos funcionários agrupados.
7. **Filtro de Aniversariantes:** Busca de funcionários que fazem aniversário nos meses 10 (Outubro) e 12 (Dezembro).
8. **Filtro de Idade:** Busca do funcionário mais velho e cálculo automático da sua idade atual.
9. **Ordenação Alfabética:** Impressão da lista de funcionários ordenada por nome.
10. **Somatório Financeiro:** Cálculo do total da folha de pagamento.
11. **Cálculo de Salários Mínimos:** Conversão do salário de cada funcionário em salários mínimos (considerando o valor de R$ 1.212,00).

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+** (Compatível com versões recentes)
* **Java Collections API** (`List`, `ArrayList`, `Map`, `HashMap`)
* **Java Time API** (`LocalDate`, `Period`, `DateTimeFormatter`)
* **Java Math** (`BigDecimal` para precisão em cálculos financeiros)
* **Stream API & Lambdas** (Implementados na refatoração)

---

## 🔄 Sobre a Refatoração (Antes vs. Depois)

A primeira versão deste código foi escrita sob pressão de tempo e, embora funcional, possuía lógicas de formatação e regras de negócio misturadas diretamente na classe `Principal`. 

O código foi refatorado focando em **Clean Code** e **Encapsulamento**:

* **Delegação de Responsabilidades:** A formatação da data de nascimento e do salário, que antes poluía os laços de repetição na classe `Principal` com `DecimalFormat` e `DateTimeFormatter`, foi movida para as classes de domínio (`Pessoa` e `Funcionario`), com a criação dos métodos `getdataNascimentoFormatada()` e `getSalarioFormatado()`.
* **Uso de Streams e Lambdas:** Substituição de laços `for` tradicionais e `if` aninhados por expressões lambda (`forEach`, `removeIf`) e Stream API (`stream().min()`, `Comparator.comparing`), tornando o código mais limpo e eficiente.
* **Extração de Métodos:** Separação da lógica de impressão do menu em métodos estáticos (`imprimirListaFucionarios`), reduzindo a complexidade ciclomática do método `main`.

### Estrutura de Classes Atual
* `Pessoa.java`: Superclasse que encapsula `nome`, `dataNascimento` e sua respectiva formatação visual.
* `Funcionario.java`: Subclasse que herda de `Pessoa` e adiciona regras específicas como `salario`, `funcao` e formatação monetária.
* `Principal.java`: Classe executável contendo o menu interativo e a orquestração das chamadas.
