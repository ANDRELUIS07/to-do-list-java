# To Do List — Java

Aplicação de lista de tarefas (To Do List) com interface gráfica em Java, com persistência local de dados.

Projeto acadêmico desenvolvido como exercício de arquitetura de software (padrão MVC), manipulação de interface gráfica e persistência de dados.

## Funcionalidades

- Adicionar novas tarefas
- Listar todas as tarefas cadastradas
- Marcar/desmarcar tarefas como concluídas
- Editar a descrição de uma tarefa
- Excluir tarefas (com confirmação)
- Filtrar tarefas por status (todas / pendentes / concluídas)
- Persistência local dos dados entre execuções

## Tecnologias

- **Linguagem:** Java
- **Interface gráfica:** JavaFX
- **Persistência:** MySQL via JDBC
- **Arquitetura:** MVC (Model-View-Controller)

## Estrutura do projeto

```
src/
  main/
    java/
      br/com/todolist/
        model/       # Classes de domínio (ex.: include.Task)
        view/        # Telas e componentes da interface gráfica
        controller/   # Lógica de negócio e orquestração
        dao/         # Camada de acesso e persistência de dados
```

## Como executar

> Instruções serão detalhadas conforme o projeto avança.

1. Clone o repositório:
   ```
   git clone https://github.com/ANDRELUIS07/to-do-list-java.git
   ```
2. Abra o projeto no IntelliJ IDEA (ou outra IDE de sua preferência).
3. Execute a classe principal (`Main`).

## Requisitos

O levantamento completo de requisitos funcionais e não funcionais do projeto está documentado separadamente e serviu de base para o desenvolvimento desta aplicação.

## Status do projeto

🚧 Em desenvolvimento.

## Autor

André Luís Cardoso Rezende Pimenta
