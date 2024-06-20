package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class ParqueDiversoes {
    public static void main (String[] args) {
        Atracao montanhaRussa = new Atracao(null, 0, null);
        montanhaRussa.setNome("Veloster");
        montanhaRussa.setTipo("Radical");
        montanhaRussa.setCapacidade(12);

        Atracao rodaGigante = new Atracao(null, 0, null);
        rodaGigante.setNome("Volta ao mundo");
        rodaGigante.setTipo("Infantil");
        rodaGigante.setCapacidade(20);

        Atracao casaDeTerror = new Atracao(null, 0, null);
        casaDeTerror.setNome("Horror House");
        casaDeTerror.setTipo("Infantil");
        casaDeTerror.setCapacidade(8);

        Atracao carrinhoDeBateBate = new Atracao(null, 0, null);
        carrinhoDeBateBate.setNome("Sparkling Race");
        carrinhoDeBateBate.setTipo("Infantil");
        carrinhoDeBateBate.setCapacidade(10);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Atracao> atracoes = new ArrayList<>();
        char opcao;

        do {
            System.out.println("Menu:");
            System.out.println("N - Novo");
            System.out.println("L - Listar");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'N':
                    novoVeiculo(scanner, atracoes);
                    break;
                case 'L':
                    listarVeiculos(atracoes);
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

    public static void novoVeiculo(Scanner scanner, ArrayList<Atracao> atracoes) {
        Atracao atracao = null;
        scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a capacidade: ");
        int capacidade = scanner.nextInt();

        System.out.print("Digite o tipo (R - Radical / I - Infantil): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        if (tipo == 'R') {
            String type = "Radical";
            System.out.print("Digite a altura mínima: ");
            double alturaMinima = scanner.nextDouble();
            atracao = new AtracaoRadical(nome, capacidade, type, alturaMinima);
        } else if (tipo == 'I') {
            String type = "Infantil";
            System.out.print("Digite a idade mínima: ");
            int idadeMinima = scanner.nextInt();
            atracao = new AtracaoInfantil(nome, capacidade, type, idadeMinima);
        } else {
            System.out.println("Tipo inválido!");
            return;
        }

        atracoes.add(atracao);
        System.out.println("Atração cadastrada!");
    }

    public static void listarVeiculos(ArrayList<Atracao> atracoes) {
        if (atracoes.isEmpty()) {
            System.out.println("Nenhuma atração cadastrada.");
        } else {
            System.out.println("Lista de Atrações:");
            for (Atracao atracao : atracoes) {
                atracao.mostrarInformacoes();
            }
        }
    }
}

