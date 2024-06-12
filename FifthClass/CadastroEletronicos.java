package FifthClass;

import java.util.ArrayList;
import java.util.Scanner;

import FifthClass.structures.Eletronico;
import FifthClass.structures.Celular;
import FifthClass.structures.Console;
import FifthClass.structures.Monitor;
import FifthClass.structures.Computador;
import FifthClass.structures.Notebook;

public class CadastroEletronicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Eletronico> eletronicos = new ArrayList<>();
        char opcao;

        do {
            System.out.println("Menu:");
            System.out.println("N - Novo");
            System.out.println("L - Listar");
            System.out.println("C - Listar Celulares");
            System.out.println("M - Listar Monitores");
            System.out.println("V - Listar Consoles");
            System.out.println("P - Listar Computadores");
            System.out.println("K - Listar Notebooks");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'N':
                    novoVeiculo(scanner, eletronicos);
                    break;
                case 'L':
                    listarEletronicos(eletronicos);
                    break;
                case 'C':
                    listarCelular(eletronicos);
                    break;
                case 'M':
                    listarMonitor(eletronicos);
                    break;
                case 'V':
                    listarConsole(eletronicos);
                    break;
                case 'P':
                    listarComputador(eletronicos);
                    break;
                case 'K':
                    listarNotebook(eletronicos);
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

        scanner.nextLine();
        System.out.print("Digite a arquitetura: ");
        String arquitetura = scanner.nextLine();

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
                    System.out.println("Tipo: Computador, Quantidade de RAM: " + ((Computador) eletronico).getQtdRAM() + ", Quantidade de VRAM: " + ((Computador) eletronico).getQtdVRAM() + ", Quantidade de Núcleos: " + ((Computador) eletronico).getQtdNucleos() + ", Quantidade de telas: " + ((Computador) eletronico).getQtdTelas());
                } else if (eletronico instanceof Notebook) {
                    System.out.println("Tipo: Notebook, Quantidade de RAM: " + ((Notebook) eletronico).getQtdRAM() + ", Quantidade de VRAM: " + ((Notebook) eletronico).getQtdVRAM() + ", Quantidade de Núcleos: " + ((Notebook) eletronico).getQtdNucleos() + ", Marca: " + ((Notebook) eletronico).getMarca());
                }
            }
        }
    }

    public static void listarCelular(ArrayList<Eletronico> eletronicos) {
        boolean encontrou = false;
        for (Eletronico eletronico : eletronicos) {
            if (eletronico instanceof Celular) {
                if (!encontrou) {
                    System.out.println("Lista de Celulares:");
                    encontrou = true;
                }
                System.out.println("Placa mãe: " + eletronico.getMotherBoard() + ", Arquitetura: " + eletronico.getArquitetura() + ", Voltagem: " + eletronico.getVoltagem() +
                        ", Quantidade de câmeras: " + ((Celular) eletronico).getQtdCameras());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum celular cadastrado.");
        }
    }

    public static void listarMonitor(ArrayList<Eletronico> eletronicos) {
        boolean encontrou = false;
        for (Eletronico eletronico : eletronicos) {
            if (eletronico instanceof Monitor) {
                if (!encontrou) {
                    System.out.println("Lista de Monitores:");
                    encontrou = true;
                }
                System.out.println("Placa mãe: " + eletronico.getMotherBoard() + ", Arquitetura: " + eletronico.getArquitetura() + ", Voltagem: " + eletronico.getVoltagem() +
                        ", Tamanho em polegadas: " + ((Monitor) eletronico).getPolegadas());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum monitor cadastrado.");
        }
    }

    public static void listarConsole(ArrayList<Eletronico> eletronicos) {
        boolean encontrou = false;
        for (Eletronico eletronico : eletronicos) {
            if (eletronico instanceof Console) {
                if (!encontrou) {
                    System.out.println("Lista de Consoles:");
                    encontrou = true;
                }
                System.out.println("Placa mãe: " + eletronico.getMotherBoard() + ", Arquitetura: " + eletronico.getArquitetura() + ", Voltagem: " + eletronico.getVoltagem() +
                        ", Quantidade de controles: " + ((Console) eletronico).getQtdControles());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum console cadastrado.");
        }
    }

    public static void listarComputador(ArrayList<Eletronico> eletronicos) {
        boolean encontrou = false;
        for (Eletronico eletronico : eletronicos) {
            if (eletronico instanceof Computador) {
                if (!encontrou) {
                    System.out.println("Lista de Computadores:");
                    encontrou = true;
                }
                System.out.println("Placa mãe: " + eletronico.getMotherBoard() + ", Arquitetura: " + eletronico.getArquitetura() + ", Voltagem: " + eletronico.getVoltagem() +
                        ", Quantidade de RAM: " + ((Computador) eletronico).getQtdRAM() + ", Quantidade de VRAM: " + ((Computador) eletronico).getQtdVRAM()  + ", Quantidade de núcleos: " + ((Computador) eletronico).getQtdNucleos()  + ", Quantidade de telas: " + ((Computador) eletronico).getQtdTelas());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum computador cadastrado.");
        }
    }

    public static void listarNotebook(ArrayList<Eletronico> eletronicos) {
        boolean encontrou = false;
        for (Eletronico eletronico : eletronicos) {
            if (eletronico instanceof Notebook) {
                if (!encontrou) {
                    System.out.println("Lista de Notebooks:");
                    encontrou = true;
                }
                System.out.println("Placa mãe: " + eletronico.getMotherBoard() + ", Arquitetura: " + eletronico.getArquitetura() + ", Voltagem: " + eletronico.getVoltagem() +
                        ", Quantidade de RAM: " + ((Notebook) eletronico).getQtdRAM() + ", Quantidade de VRAM: " + ((Notebook) eletronico).getQtdVRAM()  + ", Quantidade de núcleos: " + ((Notebook) eletronico).getQtdNucleos()  + ", Quantidade de telas: " + ((Notebook) eletronico).getMarca());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum notebook cadastrado.");
        }
    }
}

