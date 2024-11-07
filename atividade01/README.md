# Turma que gerencia alunos

## Intro

O objetivo dessa atividade é implementar uma turma que recebe n alunos e que é possível adicionar alunos e notas e visualizar aprovados e quem ficou de recuperação

### Descrição

- Aluno
  - O aluno tem nome, matricula e um vetor com notas
  - Ao criar o aluno é passado para o construtor nome e matricula.
  - Os métodos do aluno serão:
    - getNome: retorna o nome do aluno
    - getMatricula: retorna a matricula do aluno
    - getMedia: calcula e retorna a média das notas
    - setNotas: recebe as notas e armazena em notas
    - toString: imprime nome, matricula e as notas
- Turma
  - A turma tem disciplina, cod(código), um vetor de alunos e qtd_alunos(quantidade de alunos)
  - Ao criar a turma é passado disciplina, cod e a capacidade de alunos
  - Os métodos da turma serão:
    - verAlunos: imprime todos os alunos
    - verAprovados: imprime apenas os alunos aprovados
    - verAlunosFinal: imprime apenas os alunos de recuperação
    - lancarNotas: recebe índice da nota e uma nota
    - adicionarAluno: recebe uma instancia de aluno e aloca no vetor respeitando a capacidade definida

## Guide

![_](diagrama.png)

- Parte 1: Aluno
  - Crie uma classe chamada `Aluno` com os artributos `String nome`, `int matricula`, `float[] notas`
  - Faça o construtor recebendo `String nome`, `int matricula` e inicializa `notas com o tamanho 2`
- Parte 2: Aluno
  - Crie o método `String getNome()` que retorna o `nome`
  - Crie o método `int getMatricula()` que retorna a `matricula`
  - Crie o método `float getMedia()` que calcula os valores dentro do vetor nota e divide pelo tamanho do vetor notas
  - Crie o método `setNotas(int index, float nota)` que insere a nota no vetor `notas` de acordo com o index, (verifique se o index está de acordo com o tamanho do vetor)
  - Crie o método `toString()` que retorna as informações nesse formato:  `f"nome: {this.nome}, Matrícula:{this.matricula}, Notas {notas[0], notas[1]}, Média {getMedia()}"`
- Parte 3: Turma
  - Crie uma classe chama `Turma` com os atributos `String disciplina`, `int cod`, `Aluno[] alunos` , `int capacidade` e `int qtd_alunos`
  - Faça o construtor recebendo `String disciplina`, `int cod`, `int capacidade` e inicializando `alunos[]` com `capacidade` e `qtd_alunos` com 0
- Parte 4:
  - Parte 4: Métodos da Turma
    - Crie o método `void verAlunos()` que imprime todos os alunos da turma.
    - Crie o método `void verAprovados()` que imprime apenas os alunos aprovados (média maior ou igual a 7).
    - Crie o método `void verAlunosFinal()` que imprime apenas os alunos de recuperação (média menor que 7).
    - Crie o método `void lancarNotas()` dentro desse método faça a leitura das duas notas e atualize as notas dos alunos pelo método `setNotas`.
    - Crie o método `void adicionarAluno(Aluno aluno)` que recebe uma instância de aluno e adiciona ao vetor de alunos, respeitando a capacidade definida.
  - Lembre-se de que nos métodos de que imprimem os alunos fazer a verificação se aluno não é null.
