package Avaliacao1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class VerValorTotal {

    public static void calcularValorTotal(Produto[] produtos, int quantidadeProdutos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Valor Total em Estoque ---");
        System.out.println("1) Valor total geral");
        System.out.println("2) Valor total por categoria");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                double totalGeral = 0;
                for (int i = 0; i < quantidadeProdutos; i++)
                    totalGeral += produtos[i].getPreco() * produtos[i].getQtdEstoque();
                System.out.printf("💰 Valor total geral em estoque: R$ %.2f%n", totalGeral);
                break;

            case 2:
                HashMap<String, Double> mapa = new HashMap<>();
                for (int i = 0; i < quantidadeProdutos; i++) {
                    String cat = produtos[i].getCategoria();
                    double valor = produtos[i].getPreco() * produtos[i].getQtdEstoque();
                    mapa.put(cat, mapa.getOrDefault(cat, 0.0) + valor);
                }
                System.out.println("\n💰 Valor total por categoria:");
                for (Map.Entry<String, Double> entry : mapa.entrySet()) {
                    System.out.printf("%-15s : R$ %.2f%n", entry.getKey(), entry.getValue());
                }
                break;

            default: System.out.println("Opção inválida!");
        }
    }
}
