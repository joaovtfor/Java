package FourthClass;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Pacientes {
    String name;
    double weight;
    double height;

    public Pacientes (String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    String getName() {
        return name;
    }

    double getWeight() {
        return weight;
    }

    double getHeight() {
        return height;
    }

    double calcIMC() {
        return weight / (height * height);
    }
}

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pacientes> pacientes = new ArrayList<>();
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
                    newPatient(scanner,pacientes);
                    break;
                case 'L':
                    listPatients(pacientes);
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

    public static void newPatient(Scanner scanner, ArrayList<Pacientes> pacientes) {
        try {
            scanner.nextLine();
            System.out.println("Digite o nome: ");
            String name = scanner.nextLine();
    
            System.out.println("Digite a altura: ");
            double height = scanner.nextDouble();
    
            System.out.println("Digite o peso: ");
            double weight = scanner.nextDouble();

            Pacientes paciente = new Pacientes(name, weight, height);
            pacientes.add(paciente);    
        } catch (InputMismatchException err) {
            System.out.println("Erro! O valor digitado é inválido! Tente novamente!");
        }
    }

    public static void listPatients(ArrayList<Pacientes> pacientes) {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de Pacientes:");
            for (Pacientes paciente : pacientes) {
                System.out.println("\nPaciente: " + paciente.getName() + "\nAltura: " + paciente.getHeight() + "\nPeso: " + paciente.getWeight() + "\nIMC: " + paciente.calcIMC());
            }
        }
    }
}
