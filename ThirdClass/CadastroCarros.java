package ThirdClass;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();
        char opcao;

        do {
            System.out.println("Menu: ");
            System.out.println("N - Novo: ");
            System.out.println("L - Listar: ");
            System.out.println("S - Sair: ");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'N':
                    novoCarro(scanner,carros);
                    break;
                case 'L':
                    listarCarros(carros);
                    break;
                case 'S':
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 'S');
    }

    public static void novoCarro(Scanner scanner, ArrayList<Carro> carros) {
        scanner.nextLine();

        System.out.println("Digite o modelo: ");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Digite a cor: ");
        String cor = scanner.nextLine();

        scanner.nextLine();
        System.out.println("Digite a marca: ");
        String marca = scanner.nextLine();

        scanner.nextLine();
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        scanner.nextLine();
        System.out.println("Digite o preco: ");
        double preco = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Digite qual o tipo de cabine: ");
        String cabine = scanner.nextLine();

        Carro carro = new Carro(modelo, ano, cor, marca, nome, cabine, preco);
        carros.add(carro);    
    }

    public static void listarCarros(ArrayList<Carro> carros) {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            System.out.println("Lista de Carros:");
            for (Carro carro : carros) {
                System.out.println("Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno() + ", Cor: " + carro.getCor());
            }
        }
    }
}