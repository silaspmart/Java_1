package Aula6.CalculoICMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String descricao, opcao;
        double valor;
        int quantidade;

        do {
            System.out.print("Digite o produto: ");
            descricao = sc.nextLine();
            System.out.print("Digite o valor unitário: R$ ");
            valor = sc.nextDouble();
            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();

            // Criar produto
            Produto produto = new Produto(descricao, valor, quantidade);

            // Calcular valores
            double total = produto.getValor() * produto.getQuantidade();
            double icms = produto.calcularIcms();

            System.out.printf("\n--- DADOS DO PRODUTO ---\n");
            System.out.printf("Descrição: %s\n", produto.getDescricao());
            System.out.printf("Valor unitário: R$ %.2f\n", produto.getValor());
            System.out.printf("Quantidade: %d\n", produto.getQuantidade());
            System.out.printf("Valor total: R$ %.2f\n", total);
            System.out.printf("ICMS (12%%): R$ %.2f\n", icms);

            System.out.print("\nDeseja encerrar o programa? (S/N): ");
            opcao = sc.next();

        } while (!opcao.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}

