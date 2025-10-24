package Avaliacao1;

import java.util.Scanner;

public class AjustarEstoque {

    public static void ajustarQuantidade(Produto[] produtos, int quantidadeProdutos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o código do produto: ");
        long codigo = sc.nextLong();
        sc.nextLine();

        int idx = Buscador.buscarPorCodigo(produtos, quantidadeProdutos, codigo);
        if (idx == -1) {
            System.out.println("Produto não encontrado!");
            return;
        }

        Produto p = produtos[idx];
        System.out.println("Produto encontrado:");
        p.exibirTabela();

        System.out.println("1) Adicionar quantidade");
        System.out.println("2) Subtrair quantidade");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int q = sc.nextInt();

        if (opcao == 1) p.setQtdEstoque(p.getQtdEstoque() + q);
        else if (opcao == 2) {
            if (p.getQtdEstoque() >= q) p.setQtdEstoque(p.getQtdEstoque() - q);
            else System.out.println("Não é possível subtrair mais do que existe em estoque!");
        } else System.out.println("Opção inválida!");

        System.out.println("Quantidade atualizada:");
        p.exibirTabela();
    }
}
