package Testes.SistemaBancario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria[] contas = new ContaBancaria[3];
        double valorDeposito, valorSaque, saldo;
        String titular;
        int numeroConta;


        System.out.println("\n=== SISTEMA BANCÁRIO ===\n");

        for (int i = 0; i < contas.length; i++) {
            System.out.printf("Digite o nome do %dº cliente: ", i + 1);
            titular = sc.nextLine();

            System.out.printf("Digite o número da conta do %dº cliente: ", i + 1);
            numeroConta = sc.nextInt();

            System.out.print("Digite o saldo inicial: R$ ");
            saldo = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            contas[i] = new ContaBancaria(titular, numeroConta, saldo);

            int opcao;
            do {
                System.out.println("\nEscolha uma operação:");
                System.out.println("1) Depositar");
                System.out.println("2) Sacar");
                System.out.println("3) Ver saldo");
                System.out.println("4) Finalizar operações do cliente");
                System.out.print("Opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Informe o valor do depósito: R$ ");
                        valorDeposito = sc.nextDouble();
                        contas[i].depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.print("Informe o valor do saque: R$ ");
                        valorSaque = sc.nextDouble();
                        contas[i].sacar(valorSaque);
                        break;
                    case 3:
                        contas[i].exibirInformacoes();
                        break;
                    case 4:
                        System.out.println("Encerrando operações desse cliente...\n");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 4);

            sc.nextLine(); // limpar buffer pro próximo cliente
        }

        System.out.println("\n=== LISTA FINAL DE CLIENTES ===");
        for (int i=0; i<contas.length; i++) {
            contas[i].exibirInformacoes();
        }
        sc.close();
    }
}
