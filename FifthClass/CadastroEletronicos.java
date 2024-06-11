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

abstract class Computadores extends Eletronico {
    private int qtdRAM;

    public Computadores (int voltagem, String arquitetura, String motherBoard, int qtdRAM) {
        super(voltagem, arquitetura, motherBoard);
        this.qtdRAM = qtdRAM;
    }

    public int getQtdRAM() {
        return qtdRAM;
    }
}

class Computador extends Computadores {
    private int qtdVRAM;

    public Computador (int voltagem, String arquitetura, String motherBoard, int qtdRAM, int qtdVRAM) {
        super(voltagem, arquitetura, motherBoard, qtdRAM);
        this.qtdVRAM = qtdVRAM;
    }

    public int getVRAM() {
        return qtdVRAM;
    }
}

class Notebook extends Computadores {
    private String marca;

    public Notebook (int voltagem, String arquitetura, String motherBoard, int qtdRAM, String marca) {
        super(voltagem, arquitetura, motherBoard, qtdRAM);
        this.marca = marca;
    }

    public String getVRAM() {
        return marca;
    }
}

public class CadastroEletronicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Eletronico> veiculos = new ArrayList<>();
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
                    novoVeiculo(scanner, veiculos);
                    break;
                case 'L':
                    listarVeiculos(veiculos);
                    break;
                case 'M':
                    // listarMotos(veiculos);
                    break;
                case 'C':
                    // listarCaminhoes(veiculos);
                    break;
                case 'A':
                    // listarAvioes(veiculos);
                    break;
                case 'E':
                    // listarBarcos(veiculos);
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

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Digite a cor: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o tipo (M - Moto, C - Caminhão, A - Avião, E - Embarcação): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        Eletronico eletronico = null;
        if (tipo == 'M') {
            System.out.print("Digite a cilindrada: ");
            int cilindradas = scanner.nextInt();
            eletronico = new Moto(modelo, ano, cor, cilindradas);
        } else if (tipo == 'C') {
            System.out.print("Digite a capacidade de carga: ");
            int capacidadeCarga = scanner.nextInt();
            eletronico = new Caminhao(modelo, ano, cor, capacidadeCarga);
        } else if (tipo == 'A') {
            System.out.print("Digite a quantidade de turbinas: ");
            int quantidadeTurbinas = scanner.nextInt();
            eletronico = new Aviao(modelo, ano, cor, quantidadeTurbinas);
        } else if (tipo == 'E') {
            scanner.nextLine();
            System.out.print("Digite o porte da embaração: ");
            String porte = scanner.nextLine();
            eletronico = new Embarcacao(modelo, ano, cor, porte);
        } else {
            System.out.println("Tipo inválido!");
            return;
        }

        eletronicos.add(eletronico);
        System.out.println("Veículo cadastrado!");
    }

    public static void listarEletronicos(ArrayList<Eletronico> eletronicos) {
        if (eletronicos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("Lista de Veículos:");
            for (Eletronico eletronico : eletronicos) {
                System.out.println("Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Cor: " + veiculo.getCor());
                if (veiculo instanceof Moto) {
                    System.out.println("Tipo: Moto, Cilindradas: " + ((Moto) veiculo).getCilindradas());
                } else if (veiculo instanceof Caminhao) {
                    System.out.println("Tipo: Caminhão, Capacidade de Carga: " + ((Caminhao) veiculo).getCapacidadeCarga());
                }
            }
        }
    }
}
