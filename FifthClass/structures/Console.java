package FifthClass.structures;

public class Console extends Eletronico {
    private int qtdControles;

    public Console (int voltagem, String arquitetura, String motherBoard, int qtdControles) {
        super(voltagem, arquitetura, motherBoard);
        this.qtdControles = qtdControles;
    }

    public int getQtdControles() {
        return qtdControles;
    }
}
