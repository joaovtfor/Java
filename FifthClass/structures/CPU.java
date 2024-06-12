package FifthClass.structures;

abstract class CPU extends Eletronico {
    private int qtdRAM;
    private int qtdVRAM;

    public CPU (int voltagem, String arquitetura, String motherBoard, int qtdRAM, int qtdVRAM) {
        super(voltagem, arquitetura, motherBoard);
        this.qtdRAM = qtdRAM;
        this.qtdVRAM = qtdVRAM;
    }

    public int getQtdRAM() {
        return qtdRAM;
    }

    public int getQtdVRAM() {
        return qtdVRAM;
    }

    public abstract int getQtdNucleos();
}