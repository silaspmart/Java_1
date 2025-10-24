package Avaliacao1;

import java.util.Scanner;

public class Cadastrar {

    public static int cadastrarProduto(Produto[] produtos, int quantidadeProdutos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Cadastro de Produto ---");
        System.out.print("Código: ");
        long codigo = sc.nextLong();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Categoria: ");
        String categoria = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        int qtdEstoque = sc.nextInt();

        produtos[quantidadeProdutos] = new Produto(codigo, nome, categoria, preco, qtdEstoque);
        quantidadeProdutos++;

        System.out.println("\nProduto cadastrado com sucesso!");
        System.out.println("-----------------------------------\n");
        return quantidadeProdutos;
    }
}
