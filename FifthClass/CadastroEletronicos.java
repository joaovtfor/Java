package FifthClass;

import java.util.ArrayList;
import java.util.Scanner;

import SecondClass.Moto;

abstract class Eletronico {
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

class Celular extends Eletronico {
    private int qtdCameras;

    public Celular (int voltagem, String arquitetura, String motherBoard, int qtdCameras) {
        super(voltagem, arquitetura, motherBoard);
        this.qtdCameras = qtdCameras;
    }

    public int getQtdCameras() {
        return qtdCameras;
    }
}

class Monitor extends Eletronico {
    private int polegadas;

    public Monitor (int voltagem, String arquitetura, String motherBoard, int polegadas) {
        super(voltagem, arquitetura, motherBoard);
        this.polegadas = polegadas;
    }

    public int getPolegadas() {
        return polegadas;
    }
}

class Console extends Eletronico {
    private int qtdControles;

    public Console (int voltagem, String arquitetura, String motherBoard, int qtdControles) {
        super(voltagem, arquitetura, motherBoard);
        this.qtdControles = qtdControles;
    }

    public int getQtdControles() {
        return qtdControles;
    }
}

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

class Computador extends CPU {
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

class Notebook extends CPU {
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

public class CadastroEletronicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Eletronico> eletronicos = new ArrayList<>();
        char opcao;

        do {
            System.out.println("Menu:");
            System.out.println("N - Novo");
            System.out.println("L - Listar");
            System.out.println("M - Listar Motos");
            System.out.println("C - Listar Caminhões");
            System.out.println("A - Listar Aviões");
            System.out.println("E - Listar Embarcações");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'N':
                    novoVeiculo(scanner, eletronicos);
                    break;
                case 'C':
                    listarEletronicos(eletronicos);
                    break;
                case 'M':
                    // listarMotos(eletronicos);
                    break;
                case 'V':
                    // listarCaminhoes(eletronicos);
                    break;
                case 'P':
                    // listarAvioes(eletronicos);
                    break;
                case 'K':
                    // listarBarcos(eletronicos);
                    break;
                case 'S':
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 'S');

        scanner.close();
    }

    public static void novoVeiculo(Scanner scanner, ArrayList<Eletronico> eletronicos) {
        scanner.nextLine();

        System.out.print("Digite a voltagem: ");
        int voltagem = scanner.nextInt();

        System.out.print("Digite a arquitetura: ");
        String arquitetura = scanner.nextLine();

        scanner.nextLine();
        System.out.print("Digite a placa mãe: ");
        String motherBoard = scanner.nextLine();

        System.out.print("Digite o tipo (C - Celular, M - Monitor, V - Console, P - Computador, K - Notebook): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        Eletronico eletronico = null;
        if (tipo == 'C') {
            System.out.print("Digite a quantidade de cameras: ");
            int qtdCameras = scanner.nextInt();
            eletronico = new Celular(voltagem, arquitetura, motherBoard, qtdCameras);
        } else if (tipo == 'M') {
            System.out.print("Digite o tamanho em polegadas (inteiro): ");
            int polegadas = scanner.nextInt();
            eletronico = new Monitor(voltagem, arquitetura, motherBoard, polegadas);
        } else if (tipo == 'V') {
            System.out.print("Digite a quantidade de controles: ");
            int qtdControles = scanner.nextInt();
            eletronico = new Console(voltagem, arquitetura, motherBoard, qtdControles);
        } else if (tipo == 'P') {
            System.out.println("Digite a quantidade de RAM:");
            int qtdRAM = scanner.nextInt();
            System.out.println("Digite a quantidade de VRAM:");
            int qtdVRAM = scanner.nextInt();
            System.out.println("Digite a quantidade de nucleos:");
            int nucleos = scanner.nextInt();
            System.out.println("Digite a quantidade de telas:");
            int qtdTelas = scanner.nextInt();
            eletronico = new Computador(voltagem, arquitetura, motherBoard, qtdRAM, qtdVRAM, qtdTelas, nucleos);
        } else if (tipo == 'K') {
            System.out.println("Digite a quantidade de RAM:");
            int qtdRAM = scanner.nextInt();
            System.out.println("Digite a quantidade de VRAM:");
            int qtdVRAM = scanner.nextInt();
            System.out.println("Digite a quantidade de nucleos:");
            int nucleos = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a marca:");
            String marca = scanner.nextLine();
            eletronico = new Notebook(voltagem, arquitetura, motherBoard, qtdRAM, qtdVRAM, marca, nucleos);
        } else {
            System.out.println("Tipo inválido!");
            return;
        }

        eletronicos.add(eletronico);
        System.out.println("Eletrônico cadastrado!");
    }

    public static void listarEletronicos(ArrayList<Eletronico> eletronicos) {
        if (eletronicos.isEmpty()) {
            System.out.println("Nenhum eletrônico cadastrado.");
        } else {
            System.out.println("Lista de Eletrônicos:");
            for (Eletronico eletronico : eletronicos) {
                System.out.println("Placa Mãe: " + eletronico.getMotherBoard() + ", Arquitetura: " + eletronico.getArquitetura() + ", Voltagem: " + eletronico.getVoltagem());
                if (eletronico instanceof Celular) {
                    System.out.println("Tipo: Celular, Quantidade de Câmeras: " + ((Celular) eletronico).getQtdCameras());
                } else if (eletronico instanceof Monitor) {
                    System.out.println("Tipo: Monitor, Tamanho em polegadas: " + ((Monitor) eletronico).getPolegadas());
                } else if (eletronico instanceof Console) {
                    System.out.println("Tipo: Console, Quantidade de controles: " + ((Console) eletronico).getQtdControles());
                } else if (eletronico instanceof Computador) {
                    System.out.println("Tipo: Computador, Quantidade de RAM: " + ((Computador) eletronico).getQtdRAM() + "Quantidade de VRAM: " + ((Computador) eletronico).getQtdVRAM() + "Quantidade de Núcleos: " + ((Computador) eletronico).getQtdNucleos() + "Quantidade de telas: " + ((Computador) eletronico).getQtdTelas());
                } else if (eletronico instanceof Notebook) {
                    System.out.println("Tipo: Quantidade de RAM: " + ((Notebook) eletronico).getQtdRAM() + "Quantidade de VRAM: " + ((Notebook) eletronico).getQtdVRAM() + "Quantidade de Núcleos: " + ((Computador) eletronico).getQtdNucleos() + "Marca: " + ((Notebook) eletronico).getMarca());
                }
            }
        }
    }
}
