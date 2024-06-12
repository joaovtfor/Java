package FifthClass.structures;

public class Monitor extends Eletronico {
    private int polegadas;

    public Monitor (int voltagem, String arquitetura, String motherBoard, int polegadas) {
        super(voltagem, arquitetura, motherBoard);
        this.polegadas = polegadas;
    }

    public int getPolegadas() {
        return polegadas;
    }
}
