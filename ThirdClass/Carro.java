package ThirdClass;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    private String nome;
    private String marca;
    private double preco;
    private String cabine;

    public Carro(String modelo, int ano, String cor, String nome, String marca, String cabine, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.cabine = cabine;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }    

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public String getCabine() {
        return cabine;
    }

    public double getPreco() {
        return preco;
    }
}