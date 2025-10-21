package Aula6.IPVA;

import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n***** CALCULADORA DE IPVA *****\n\nDigite os dados do veículo:");
        System.out.print("Placa (ex: LZX9090): ");
        String placa = sc.nextLine().toUpperCase();
        placa = formatarPlaca(placa);

        String tipo = escolherTipo(sc);

        System.out.print("Valor: R$ ");
        double valor = sc.nextDouble();
        sc.nextLine();

        Veiculo veiculo = new Veiculo(placa, tipo, valor);

        System.out.printf("\n------------------------------\n====== DADOS DO VEICULO ======");
        System.out.printf("\nPlaca: %s \nTipo: %s \nValor: R$ %.2f \nIPVA: R$ %.2f\n", veiculo.placa, veiculo.tipo, veiculo.valor, veiculo.calculaIPVA());
        System.out.printf("------------------------------\n");

        sc.close();
    }

    // Método para formatar a placa como "ABC 1234"
    public static String formatarPlaca(String placa) {
        if (placa.length() == 7) {
            return placa.substring(0, 3) + " " + placa.substring(3);
        } else {
            return placa; // Caso o usuário digite errado, deixa como está
        }
    }

    // Menu para escolher tipo do veículo
    public static String escolherTipo(Scanner sc) {
        while (true) {
            System.out.println("Escolha o tipo de combustível:");
            System.out.println("> 1 - Flex");
            System.out.println("> 2 - Gás");
            System.out.print("Digite a opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    return "Flex";
                case 2:
                    return "Gás";
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
