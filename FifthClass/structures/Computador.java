package FifthClass.structures;

public class Computador extends CPU {
    private int qtdTelas;
    private int nucleos;

    public Computador (int voltagem, String arquitetura, String motherBoard, int qtdRAM, int qtdVRAM, int nucleos, int qtdTelas) {
        super(voltagem, arquitetura, motherBoard, qtdRAM, qtdVRAM);
        this.nucleos = nucleos;
        this.qtdTelas = qtdTelas;
    }

    public int getQtdTelas() {
        return qtdTelas;
    }

    public int getQtdNucleos() {
        return nucleos;
    }
}
