package FifthClass.structures;

public class Notebook extends CPU {
    private String marca;
    private int nucleos;

    public Notebook (int voltagem, String arquitetura, String motherBoard, int qtdRAM, int qtdVRAM, String marca, int nucleos) {
        super(voltagem, arquitetura, motherBoard, qtdRAM, qtdVRAM);
        this.marca = marca;
        this.nucleos = nucleos;
    }

    public String getMarca() {
        return marca;
    }

    public int getQtdNucleos() {
        return nucleos;
    }
}
