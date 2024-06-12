package FifthClass.structures;

public abstract class Eletronico {
    private int voltagem;
    private String arquitetura;
    private String motherBoard;
    
    public Eletronico(int voltagem, String arquitetura, String motherBoard) {
        this.voltagem = voltagem;
        this.arquitetura = arquitetura;
        this.motherBoard = motherBoard;
        
    }

    public int getVoltagem() {
        return voltagem;
    }

    public String getArquitetura() {
        return arquitetura;
    }

    public String getMotherBoard() {
        return motherBoard;
    }
}
