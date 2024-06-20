package Test;

public class AtracaoRadical extends Atracao {
    private double alturaMinima;

    public AtracaoRadical(String nome, int capacidade, String type, double alturaMinima) {
        super(nome, capacidade, type);
        this.alturaMinima = alturaMinima;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }
    
    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public void mostrarInformacoes() {
        System.out.println("Atração Radical: " + getNome() + ", Capacidade: " + getCapacidade() + ", Altura mínima: " + getAlturaMinima());
    }
}
