package Avaliacao1;

import java.util.Scanner;

public class Listar {

    public static void listarProdutos(Produto[] produtos, int quantidadeProdutos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Listar produtos ---");
        System.out.println("1) Por nome");
        System.out.println("2) Por código");
        System.out.println("3) Por quantidade");
        System.out.println("4) Por preço");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        Produto[] copia = new Produto[quantidadeProdutos];
        for (int i = 0; i < quantidadeProdutos; i++) copia[i] = produtos[i];

        switch (opcao) {
            case 1: Ordenador.ordenarPorNome(copia, quantidadeProdutos); break;
            case 2: Ordenador.ordenarPorCodigo(copia, quantidadeProdutos); break;
            case 3: Ordenador.ordenarPorQuantidade(copia, quantidadeProdutos); break;
            case 4: Ordenador.ordenarPorPreco(copia, quantidadeProdutos); break;
            default: System.out.println("Opção inválida!"); return;
        }

        System.out.printf("%-8s | %-20s | %-15s | %-10s | %-5s | %-10s%n",
                "Código", "Nome", "Categoria", "Preço", "Qtd", "Valor Total");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < quantidadeProdutos; i++) copia[i].exibirTabela();
    }
}
