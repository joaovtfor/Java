package SecondClass;
import SecondClass.Carro;
import SecondClass.Moto;

public class Ex2 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        Moto moto01 = new Moto();
        Moto moto02 = new Moto();

        carro01.modelo = "Fusca";
        carro01.ano = 1989;

        System.out.println("Carro 1: ");
        carro01.exibir();

        carro02.modelo = "Celta";
        carro02.ano = 2011;

        System.out.println("\nCarro 2: ");
        carro02.exibir();

        moto01.modelo = "Ninja";
        moto01.ano = 2010;

        System.out.println("Moto 1: ");
        moto01.exibir();
        
        moto02.modelo = "Ninja";
        moto02.ano = 2010;

        System.out.println("Moto 1: ");
        moto02.exibir();
    }
}
