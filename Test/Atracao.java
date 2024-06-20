package Test;

public class Atracao {
    private String nome;
    private String tipo;
    private int capacidade;

    public Atracao(String nome, int capacidade, String tipo) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void mostrarInformacoes() {
        
    }
}

