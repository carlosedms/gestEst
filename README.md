# Gestão de Estoque

Este é um trabalho em Java que implementa um sistema básico de gestão de estoque. O sistema permite adicionar, listar e remover produtos do estoque. Cada classe está em um arquivo separado para melhor organização e legibilidade do código.

## Funcionalidades

O programa oferece as seguintes funcionalidades:

- Adicionar produto ao estoque: Permite adicionar produtos, como smartphones, laptops e monitores, ao estoque. O usuário insere as informações do produto, como marca, modelo, tamanho da tela (apenas para laptops e monitores) e preço.
- Listar produtos no estoque: Exibe a lista de produtos atualmente armazenados no estoque.
- Remover produto do estoque: Permite remover um produto específico do estoque com base no número do item.

## Utilização

Ao executar o programa, um menu é exibido para o usuário com as opções disponíveis. O usuário pode selecionar a opção desejada digitando o número correspondente. O programa continuará em execução até que o usuário escolha a opção para finalizá-lo.

O objetivo principal é fornecer uma interface simples e intuitiva para a gestão do estoque, permitindo ao usuário adicionar, visualizar e remover produtos de forma fácil e eficiente.

Este código pode ser utilizado como base para desenvolver sistemas de gestão de estoque mais complexos, adicionando novas funcionalidades conforme necessário.

## Diagrama de Classes

Aqui está o diagrama de classes que ilustra o relacionamento entre as classes do sistema:

![Diagrama de Classes](https://drive.google.com/uc?export=view&id=1p1XFcI_AzKNZ5glLxqyfiPZchI7DPe1t)

O diagrama de classes mostra as classes do sistema e os relacionamentos entre elas. Nesse caso, as setas indicam a direção da associação entre as classes. É possível observar a herança entre as classes `Produto`, `Smartphone`, `Laptop` e `Monitor`, onde as subclasses herdam os atributos e métodos da classe pai.

Além disso, a classe `Estoque` possui uma composição com a classe `ArrayList`, indicando que o estoque é composto por objetos da classe `Produto`. Essa composição permite armazenar e manipular os produtos no estoque de forma conveniente.

O diagrama de classes é uma ferramenta útil para visualizar a estrutura do sistema e entender os relacionamentos entre as classes. Ele auxilia no design e na implementação do código, fornecendo uma visão geral das entidades e suas interações.


## Observações

- Cada classe está em um arquivo separado para melhor organização e manutenção do código.
- As classes `Smartphone`, `Laptop`, `Teclado`, `FoneBluetooth` e `Monitor` implementam a interface `Produto`, definindo os métodos necessários para obter informações específicas de cada produto.
- A classe `Estoque` é responsável por gerenciar os produtos no estoque, utilizando um `ArrayList` para armazenar os objetos da classe `Produto`.

## Requisitos

- Java Development Kit (JDK) instalado.
- Ambiente de desenvolvimento Java, como Eclipse ou IntelliJ IDEA, ou compilador Java para executar o programa a partir da linha de comando.

## Execução

1. Abra o projeto em seu ambiente de desenvolvimento Java ou navegue até o diretório onde os arquivos estão localizados.
2. Compile e execute o arquivo `Main.java`.
3. Siga as instruções exibidas no menu para interagir com o programa e gerenciar o estoque.

## Autores

O trabalho em questão foi desenvolvido por Carlos Eduardo, Ana Catarina, João Carlos e William Campos, na disciplina de Linguagem de Programação II, em 2023.1
