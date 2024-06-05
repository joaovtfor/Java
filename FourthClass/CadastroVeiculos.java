import java.util.ArrayList;
import java.util.Scanner;

class Veiculo {
    private String modelo;
    private int ano;
    private String cor;

    public Veiculo(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, int ano, String cor, int cilindradas) {
        super(modelo, ano, cor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}

class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String modelo, int ano, String cor, int capacidadeCarga) {
        super(modelo, ano, cor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
}

class Aviao extends Veiculo {
  private int quantidadeTurbinas;

  public Aviao(String modelo, int ano, String cor, int quantidadeTurbinas) {
      super(modelo, ano, cor);
      this.quantidadeTurbinas = quantidadeTurbinas;
  }

  public int getQuantidadeTurbinas() {
      return quantidadeTurbinas;
  }
}

class Embarcacao extends Veiculo {
  private String porte;

  public Embarcacao(String modelo, int ano, String cor, String porte) {
      super(modelo, ano, cor);
      this.porte = porte;
  }

  public String getPorte() {
      return porte;
  }
}

public class CadastroVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();
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
                    listarMotos(veiculos);
                    break;
                case 'C':
                    listarCaminhoes(veiculos);
                    break;
                case 'A':
                    listarAvioes(veiculos);
                    break;
                case 'E':
                    listarBarcos(veiculos);
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

    public static void novoVeiculo(Scanner scanner, ArrayList<Veiculo> veiculos) {
        scanner.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Digite a cor: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o tipo (M - Moto, C - Caminhão, A - Avião, E - Embarcação): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        Veiculo veiculo = null;
        if (tipo == 'M') {
            System.out.print("Digite a cilindrada: ");
            int cilindradas = scanner.nextInt();
            veiculo = new Moto(modelo, ano, cor, cilindradas);
        } else if (tipo == 'C') {
            System.out.print("Digite a capacidade de carga: ");
            int capacidadeCarga = scanner.nextInt();
            veiculo = new Caminhao(modelo, ano, cor, capacidadeCarga);
        } else if (tipo == 'A') {
            System.out.print("Digite a quantidade de turbinas: ");
            int quantidadeTurbinas = scanner.nextInt();
            veiculo = new Aviao(modelo, ano, cor, quantidadeTurbinas);
        } else if (tipo == 'E') {
            scanner.nextLine();
            System.out.print("Digite o porte da embaração: ");
            String porte = scanner.nextLine();
            veiculo = new Embarcacao(modelo, ano, cor, porte);
        } else {
            System.out.println("Tipo inválido!");
            return;
        }

        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado!");
    }

    public static void listarVeiculos(ArrayList<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("Lista de Veículos:");
            for (Veiculo veiculo : veiculos) {
                System.out.println("Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Cor: " + veiculo.getCor());
                if (veiculo instanceof Moto) {
                    System.out.println("Tipo: Moto, Cilindradas: " + ((Moto) veiculo).getCilindradas());
                } else if (veiculo instanceof Caminhao) {
                    System.out.println("Tipo: Caminhão, Capacidade de Carga: " + ((Caminhao) veiculo).getCapacidadeCarga());
                }
            }
        }
    }

    public static void listarMotos(ArrayList<Veiculo> veiculos) {
        boolean encontrou = false;
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                if (!encontrou) {
                    System.out.println("Lista de Motos:");
                    encontrou = true;
                }
                System.out.println("Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Cor: " + veiculo.getCor() +
                        ", Cilindradas: " + ((Moto) veiculo).getCilindradas());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma moto cadastrada.");
        }
    }

    public static void listarCaminhoes(ArrayList<Veiculo> veiculos) {
        boolean encontrou = false;
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Caminhao) {
                if (!encontrou) {
                    System.out.println("Lista de Caminhões:");
                    encontrou = true;
                }
                System.out.println("Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Cor: " + veiculo.getCor() +
                        ", Capacidade de Carga: " + ((Caminhao) veiculo).getCapacidadeCarga());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum caminhão cadastrado.");
        }
    }

    public static void listarAvioes(ArrayList<Veiculo> veiculos) {
        boolean encontrou = false;
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Aviao) {
                if (!encontrou) {
                    System.out.println("Lista de Aviões:");
                    encontrou = true;
                }
                System.out.println("Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Cor: " + veiculo.getCor() +
                        ", Quantidade de Turbinas: " + ((Aviao) veiculo).getQuantidadeTurbinas());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum avião cadastrado.");
        }
    }

    public static void listarBarcos(ArrayList<Veiculo> veiculos) {
        boolean encontrou = false;
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Embarcacao) {
                if (!encontrou) {
                    System.out.println("Lista de Embarcações:");
                    encontrou = true;
                }
                System.out.println("Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Cor: " + veiculo.getCor() +
                        ", Porte: " + ((Embarcacao) veiculo).getPorte());
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma embarcação cadastrada.");
        }
    }
}