package Review;

public class Aves extends Animal {
    private void voar() {
        System.out.println("Fly fly fly my little butterfly");
    }

    public Aves (String name, String species, int age) {
        super(name, species, age);
    }

    public void mostrarInformacoes() {
        System.out.println("Teste ave");
    }
}
