package Avaliacao1;

import java.util.Scanner;

public class Buscar {

    public static void buscarProduto(Produto[] produtos, int quantidadeProdutos) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado;

        System.out.println("\n--- Buscar produtos ---");
        System.out.println("1) Por código");
        System.out.println("2) Por nome");
        System.out.println("3) Por categoria");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Digite o código do produto: ");
                long codigo = sc.nextLong();
                sc.nextLine();
                encontrado = false;
                for (int i = 0; i < quantidadeProdutos; i++) {
                    if (produtos[i].getCodigo() == codigo) {
                        System.out.println("\nProduto encontrado:");
                        produtos[i].exibirTabela();
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) System.out.println("Produto não encontrado!");
                break;

            case 2:
                System.out.print("Digite o nome do produto: ");
                String nome = sc.nextLine();
                Produto[] copia = new Produto[quantidadeProdutos];
                for (int i = 0; i < quantidadeProdutos; i++) copia[i] = produtos[i];
                Ordenador.ordenarPorNome(copia, quantidadeProdutos);
                int idx = Buscador.buscaBinariaPorNome(copia, quantidadeProdutos, nome);
                if (idx != -1) copia[idx].exibirTabela();
                else System.out.println("Produto não encontrado!");
                break;

            case 3:
                System.out.println("\n--- Produtos por categoria ---");
                for (int i = 0; i < quantidadeProdutos; i++) {
                    produtos[i].exibirTabela();
                }
                break;

            default: System.out.println("Opção inválida!");
        }
    }
}
