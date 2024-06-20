package Test;

public class AtracaoInfantil extends Atracao {
    private int idadeMinima;

    public AtracaoInfantil(String nome, int capacidade, String tipo, int idadeMinima) {
        super(nome, capacidade, tipo);
        this.idadeMinima = idadeMinima;
    }
    
    public int getIdadeMinima() {
        return idadeMinima;
    }
    
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public void mostrarInformacoes() {
        System.out.println("Atração Infantil: " + getNome() + ", Capacidade: " + getCapacidade() + ", Idade mínima: " + getIdadeMinima());
    }
}
