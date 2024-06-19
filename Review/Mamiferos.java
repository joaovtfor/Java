package Review;

public class Mamiferos extends Animal {
    private String alimentacao;

    public Mamiferos (String name, String species, int age, String alimentacao) {
        super(name, species, age);
        this.alimentacao = alimentacao;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void mostrarInformacoes() {
        System.out.println("Teste mamífero");
    }
}
