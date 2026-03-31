# Task Tracker CLI

O rastreador de tarefas (Task tracker) é um projeto utilizado para rastrear e gerenciar suas tarefas. Nesta tarefa, você construirá uma interface de linha de comando (CLI) simples para rastrear o que você precisa fazer, o que já fez e no que está trabalhando atualmente. Este projeto ajudará você a praticar suas habilidades de programação, incluindo trabalhar com o sistema de arquivos, lidar com entradas de usuário e construir um aplicativo CLI simples.

## Requisitos

O aplicativo deve ser executado a partir da linha de comando, aceitar ações e entradas do usuário como argumentos e armazenar as tarefas em um arquivo JSON. O usuário deve ser capaz de:

- Adicionar, Atualizar e Excluir tarefas
- Marcar uma tarefa como em andamento ou concluída
- Listar todas as tarefas
- Listar todas as tarefas concluídas
- Listar todas as tarefas não concluídas
- Listar todas as tarefas em andamento

Aqui estão algumas restrições para orientar a implementação:

- Você pode usar qualquer linguagem de programação para construir este projeto.
- Use argumentos posicionais na linha de comando para aceitar as entradas do usuário.
- Use um arquivo JSON para armazenar as tarefas no diretório atual.
- O arquivo JSON deve ser criado se não existir.
- Use o módulo de sistema de arquivos nativo de sua linguagem de programação para interagir com o arquivo JSON.
- Não use bibliotecas ou frameworks externos para construir este projeto.
- Certifique-se de lidar com erros e casos extremos de forma adequada.

## Exemplo

A lista de comandos e seus usos é fornecida abaixo:

```bash
# Adding a new task
task-cli add "Buy groceries"
# Output: Task added successfully (ID: 1)

# Updating and deleting tasks
task-cli update 1 "Buy groceries and cook dinner"
task-cli delete 1

# Marking a task as in progress or done
task-cli mark-in-progress 1
task-cli mark-done 1

# Listing all tasks
task-cli list

# Listing tasks by status
task-cli list done
task-cli list todo
task-cli list in-progress
```

## Propriedades da Tarefa

Cada tarefa deve ter as seguintes propriedades:

- `id`: Um identificador único para a tarefa
- `description`: Uma breve descrição da tarefa
- `status`: O status da tarefa (todo, in-progress, done)
- `createdAt`: A data e hora em que a tarefa foi criada
- `updatedAt`: A data e hora em que a tarefa foi atualizada pela última vez

Certifique-se de adicionar essas propriedades ao arquivo JSON ao adicionar uma nova tarefa e atualizá-las ao atualizar uma tarefa.

## Começando

Aqui estão algumas etapas para ajudá-lo a começar com o projeto Task Tracker CLI:

### Configure Seu Ambiente de Desenvolvimento
- Escolha uma linguagem de programação com a qual você se sinta confortável (por exemplo, Python, JavaScript, etc.).
- Certifique-se de ter um editor de código ou IDE instalado (por exemplo, VSCode, PyCharm).

### Inicialização do Projeto
- Crie um novo diretório de projeto para o seu Task Tracker CLI.
- Inicialize um sistema de controle de versão (por exemplo, Git) para gerenciar seu projeto.

### Implementando Funcionalidades
- Comece criando uma estrutura CLI básica para lidar com as entradas do usuário.
- Implemente cada funcionalidade uma a uma, certificando-se de testar exaustivamente antes de passar para a próxima (por exemplo, implemente a funcionalidade de adicionar tarefa primeiro, a listagem a seguir, depois a atualização, marcando como em andamento, etc.).

### Testes e Depuração
- Teste cada funcionalidade individualmente para garantir que elas funcionem conforme o esperado. Verifique o arquivo JSON para confirmar que as tarefas estão sendo armazenadas corretamente.
- Depure quaisquer problemas que surjam durante o desenvolvimento.

### Finalizando o Projeto
- Certifique-se de que todas as funcionalidades foram implementadas e testadas.
- Limpe seu código e adicione comentários onde for necessário.
- Escreva um bom arquivo readme sobre como usar o seu Task Tracker CLI.

Ao final deste projeto, você terá desenvolvido uma ferramenta prática que pode ajudar você ou outras pessoas a gerenciar tarefas com eficiência. Este projeto estabelece uma base sólida para projetos de programação mais avançados e aplicações do mundo real.

Feliz codificação!
