package ThirdClass;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alunos> alunos = new ArrayList<>();
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
                    novoAluno(scanner,alunos);
                    break;
                case 'L':
                    listarAlunos(alunos);
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

    public static void novoAluno(Scanner scanner, ArrayList<Alunos> alunos) {
        scanner.nextLine();

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        scanner.nextLine();
        System.out.println("Digite a cidade: ");
        String cidade = scanner.nextLine();
        
        scanner.nextLine();
        System.out.println("Digite o curso: ");
        String curso = scanner.nextLine();

        scanner.nextLine();
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        Alunos aluno = new Alunos(nome, cidade, curso, idade);
        alunos.add(aluno);    
    }

    public static void listarAlunos(ArrayList<Alunos> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Alunos aluno : alunos) {
                System.out.println("Alunos: " + aluno.getNome() + ", Ano: " + aluno.getIdade() + ", Cidade: " + aluno.getCidade());
            }
        }
    }
}
