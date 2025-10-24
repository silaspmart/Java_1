package Avaliacao1;

import java.util.Scanner;

public class GerenciadorDeEstoque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[100];
        int quantidadeProdutos = 0;
        int opcao;

        do {
            Util.limparTela();
            System.out.println("\n--- Sistema de Gerenciamento de Estoque ---");
            System.out.println("1) Cadastrar produto");
            System.out.println("2) Buscar produto");
            System.out.println("3) Listar produtos");
            System.out.println("4) Ajustar quantidade");
            System.out.println("5) Ver valor total em estoque");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    quantidadeProdutos = Cadastrar.cadastrarProduto(produtos, quantidadeProdutos);
                    break;
                case 2:
                    Buscar.buscarProduto(produtos, quantidadeProdutos);
                    break;
                case 3:
                    Listar.listarProdutos(produtos, quantidadeProdutos);
                    break;
                case 4:
                    AjustarEstoque.ajustarQuantidade(produtos, quantidadeProdutos);
                    break;
                case 5:
                    VerValorTotal.calcularValorTotal(produtos, quantidadeProdutos);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Voltando para o menu principal...");
                    continue; // volta imediatamente ao menu
            }

            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                sc.nextLine();
            }

        } while (opcao != 0);
    }
}
