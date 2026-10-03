# poo-lista-02

## Questão 1

Usar getters e setters faz parte do encapsulamento, os atributos ficam privados e o acesso a eles passa por métodos da própria classe. Se os atributos fossem públicos, qualquer parte do programa poderia alterá-los livremente, sem nenhuma verificação. Com getters e setters, a classe passa a ter controle sobre seus dados. As vantagens são:

- **Validação:** o setter pode recusar valores inválidos antes de alterar o objeto.
- **Manutenção:** a implementação interna pode mudar sem afetar quem usa a classe.
- **Controle de acesso:** é possível deixar um atributo somente para leitura (apenas getter).

**Exemplo:** em uma classe `Aluno`, a nota deve ficar sempre entre 0 e 10. O setter garante isso:

```java
public class Aluno {
    private String nome;
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida: deve estar entre 0 e 10.");
        }
    }
}
```

Se `nota` fosse pública, o código poderia fazer `aluno.nota = 15` ou `aluno.nota = -3`, deixando o objeto com um dado impossível. Com o setter, valores fora do intervalo são rejeitados e a nota do aluno continua sempre válida.


## Questão 2

### a) Título, autor(es), ISBN, editora, ano de publicação, edição, gênero/categoria, quantidade de exemplares e status (disponível ou emprestado).

### b) Porque a classe representa apenas os aspectos de um livro que importam para o sistema da biblioteca. Um livro real possui muitas outras características (cor da capa, peso, estado das páginas, cheiro etc.) que são irrelevantes para o controle de empréstimos. Abstração consiste justamente em ignorar os detalhes desnecessários e modelar somente o essencial do objeto real.

### c) 

- `emprestar()`: marca o livro como emprestado, caso esteja disponível.
- `devolver()`: marca o livro como disponível novamente.
- `isDisponivel()`: informa se o livro pode ser emprestado.
- `exibirInfo()`: imprime os dados do livro.
- `getTitulo()`, `getAutor()`, etc.: getters dos atributos.
