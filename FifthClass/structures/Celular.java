package FifthClass.structures;

public class Celular extends Eletronico {
    private int qtdCameras;

    public Celular (int voltagem, String arquitetura, String motherBoard, int qtdCameras) {
        super(voltagem, arquitetura, motherBoard);
        this.qtdCameras = qtdCameras;
    }

    public int getQtdCameras() {
        return qtdCameras;
    }
}
