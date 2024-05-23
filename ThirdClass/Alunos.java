package ThirdClass;

public class Alunos {
    private String nome;
    private String cidade;
    private String curso;
    private int idade;

    public Alunos (String nome, String cidade, String curso, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.curso = curso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCurso() {
        return curso;
    }

    public int getIdade() {
        return idade;
    }
}
