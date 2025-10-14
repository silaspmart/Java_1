package Avaliacao1;

import java.util.Scanner;

public class GerenciadorDeEstoque {

    // Função para ordenar um array de Produtos por nome (alfabética)
    public static void ordenarPorNome(Produto[] array, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (array[i].nome.compareToIgnoreCase(array[j].nome) > 0) {
                    Produto temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Função para busca binária por nome (retorna índice ou -1 se não encontrado)
    public static int buscaBinariaPorNome(Produto[] array, int tamanho, String nomeBusca) {
        int inicio = 0, fim = tamanho - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int cmp = array[meio].nome.compareToIgnoreCase(nomeBusca);
            if (cmp == 0) {
                return meio; // encontrado
            } else if (cmp < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1; // não encontrado
    }

    // Função para calcular o valor total de todos os produtos
    public static double calcularValorTotalEstoque(Produto[] array, int tamanho) {
        double total = 0;
        for (int i = 0; i < tamanho; i++) {
            total += array[i].calcularValorTotal();
        }
        return total;
    }

    // Função para calcular o valor total por categoria
    public static double calcularValorPorCategoria(Produto[] array, int tamanho, String categoriaBusca) {
        double total = 0;
        for (int i = 0; i < tamanho; i++) {
            if (array[i].categoria.equalsIgnoreCase(categoriaBusca)) {
                total += array[i].calcularValorTotal();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[100]; // vetor com até 100 produtos
        int quantidadeProdutos = 0, qtdEstoque, opcao;
        long codigo, codigoBusca;
        String nome, categoria;
        double preco;
        boolean encontrado;

        System.out.println("\n************************************\n*** SISTEMA DE GESTÃO DE ESTOQUE ***\n************************************");
        System.out.println("======== MENU PRINCIPAL ========\n");

        do {
            // Menu principal
            System.out.println("1) Cadastrar produto");
            System.out.println("2) Buscar produtos");
            System.out.println("3) Listar produtos");
            System.out.println("4) Ver valor total em estoque"); // Nova opção
            System.out.println("5) Sair");             
            System.out.print("\n>> Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: // CADASTRAR PRODUTOS
                    System.out.println("\n--- Cadastro de Produto ---");
                    System.out.print("Código: ");
                    codigo = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Categoria: ");
                    categoria = sc.nextLine();

                    System.out.print("Preço: ");
                    preco = sc.nextDouble();

                    System.out.print("Quantidade em Estoque: ");
                    qtdEstoque = sc.nextInt();

                    Produto novo = new Produto(codigo, nome, categoria, preco, qtdEstoque);
                    produtos[quantidadeProdutos] = novo;
                    quantidadeProdutos++;

                    System.out.println("\nProduto cadastrado com sucesso!");
                    System.out.println("-----------------------------------\n");
                    break;

                case 2: // BUSCAR PRODUTOS
                    int opcaoBusca;
                    System.out.println("\n--- Procurar produtos ---");
                    System.out.println("1) Por código");
                    System.out.println("2) Por nome");
                    System.out.println("3) Por categoria");
                    System.out.print("\n>> Escolha uma opção: ");
                    opcaoBusca = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoBusca) {
                        case 1: // Buscar por código
                            System.out.print("Digite o código do produto: ");
                            codigoBusca = sc.nextLong();
                            sc.nextLine();
                            encontrado = false;

                            for (int i = 0; i < quantidadeProdutos; i++) {
                                if (produtos[i].codigo == codigoBusca) {
                                    System.out.println("\nProduto encontrado:");
                                    produtos[i].exibirInformacoes();
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (encontrado == false) {
                                System.out.printf("Produto com código %s não encontrado!\n", codigoBusca);
                            }
                            break;

                        case 2: // Buscar por nome (busca binária)
                            System.out.print("Digite o nome do produto: ");
                            String nomeBusca = sc.nextLine();

                            Produto[] copiaPorNome = new Produto[quantidadeProdutos];
                            for (int i = 0; i < quantidadeProdutos; i++) {
                                copiaPorNome[i] = produtos[i];
                            }
                            ordenarPorNome(copiaPorNome, quantidadeProdutos);

                            int indice = buscaBinariaPorNome(copiaPorNome, quantidadeProdutos, nomeBusca);
                            if (indice != -1) {
                                System.out.println("\nProduto encontrado:");
                                copiaPorNome[indice].exibirInformacoes();
                            } else {
                                System.out.printf("Produto com nome %s não encontrado!\n", nomeBusca);
                            }
                            break;

                        case 3: // Buscar por categoria
                            System.out.print("Digite a categoria: ");
                            String categoriaBusca = sc.nextLine();
                            encontrado = false;

                            for (int i = 0; i < quantidadeProdutos; i++) {
                                if (produtos[i].categoria.equalsIgnoreCase(categoriaBusca)) {
                                    System.out.println("\nProduto encontrado:");
                                    produtos[i].exibirInformacoes();
                                    encontrado = true;
                                }
                            }
                            if (encontrado == false) {
                                System.out.printf("Nenhum produto encontrado na categoria %s!\n", categoriaBusca);
                            }
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 3: // LISTAR PRODUTOS
                    int opcaoListar;
                    System.out.println("\n--- Listar produtos ---");
                    System.out.println("1) Por nome (ordem alfabética)");
                    System.out.println("2) Por código (menor para o maior)");
                    System.out.println("3) Por quantidade (menor para o maior)");
                    System.out.println("4) Por valor unitário (menor para o maior)");
                    System.out.print("\n>> Escolha uma opção: ");
                    opcaoListar = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoListar) {
                        case 1: // Por nome
                            System.out.println("\n--- Produtos ordenados por nome ---");
                            Produto[] copiaPorNomeList = new Produto[quantidadeProdutos]; 
                            for (int i = 0; i < quantidadeProdutos; i++) {
                                copiaPorNomeList[i] = produtos[i];
                            }
                            ordenarPorNome(copiaPorNomeList, quantidadeProdutos);
                            for (int i = 0; i < copiaPorNomeList.length; i++) {
                                copiaPorNomeList[i].exibirInformacoes();
                            }
                            break;

                        case 2: // Por código
                            System.out.println("\n--- Produtos ordenados por código ---");
                            Produto[] copiaPorCodigo = new Produto[quantidadeProdutos]; 
                            for (int i = 0; i < quantidadeProdutos; i++) {
                                copiaPorCodigo[i] = produtos[i];
                            }
                            for (int i = 0; i < copiaPorCodigo.length - 1; i++) { 
                                for (int j = i + 1; j < copiaPorCodigo.length; j++) {
                                    if (copiaPorCodigo[i].codigo > copiaPorCodigo[j].codigo) {
                                        Produto temp = copiaPorCodigo[i];
                                        copiaPorCodigo[i] = copiaPorCodigo[j];
                                        copiaPorCodigo[j] = temp;
                                    }
                                }
                            }
                            for (int i = 0; i < copiaPorCodigo.length; i++) { 
                                copiaPorCodigo[i].exibirInformacoes();
                            }
                            break;

                        case 3: // Por quantidade
                            System.out.println("\n--- Produtos ordenados por quantidade ---");
                            Produto[] copiaPorQuantidade = new Produto[quantidadeProdutos];
                            for (int i = 0; i < quantidadeProdutos; i++) {
                                copiaPorQuantidade[i] = produtos[i];
                            }
                            for (int i = 0; i < copiaPorQuantidade.length - 1; i++) {
                                for (int j = i + 1; j < copiaPorQuantidade.length; j++) {
                                    if (copiaPorQuantidade[i].qtdEstoque > copiaPorQuantidade[j].qtdEstoque) {
                                        Produto temp = copiaPorQuantidade[i];
                                        copiaPorQuantidade[i] = copiaPorQuantidade[j];
                                        copiaPorQuantidade[j] = temp;
                                    }
                                }
                            }
                            for (int i = 0; i < copiaPorQuantidade.length; i++) {
                                copiaPorQuantidade[i].exibirInformacoes();
                            }
                            break;

                        case 4: // Por preço
                            System.out.println("\n--- Produtos ordenados por preço ---");
                            Produto[] copiaPorPreco = new Produto[quantidadeProdutos];
                            for (int i = 0; i < quantidadeProdutos; i++) {
                                copiaPorPreco[i] = produtos[i];
                            }
                            for (int i = 0; i < copiaPorPreco.length - 1; i++) {
                                for (int j = i + 1; j < copiaPorPreco.length; j++) {
                                    if (copiaPorPreco[i].preco > copiaPorPreco[j].preco) {
                                        Produto temp = copiaPorPreco[i];
                                        copiaPorPreco[i] = copiaPorPreco[j];
                                        copiaPorPreco[j] = temp;
                                    }
                                }
                            }
                            for (int i = 0; i < copiaPorPreco.length; i++) {
                                copiaPorPreco[i].exibirInformacoes();
                            }
                            break;

                        default:
                            System.out.println("Opção inválida!\n");
                    }
                    break;

                case 4: // VER VALORES TOTAIS EM ESTOQUE
                    System.out.println("\n--- Valores totais em estoque ---");
                    System.out.println("1) Valor total geral");
                    System.out.println("2) Valor total por categoria");
                    System.out.print("\n>> Escolha uma opção: ");
                    int opcaoValor = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoValor) {
                        case 1:
                            double totalGeral = calcularValorTotalEstoque(produtos, quantidadeProdutos);
                            System.out.printf("\nValor total em estoque: R$ %.2f\n", totalGeral);
                            break;

                        case 2:
                            System.out.print("Digite a categoria: ");
                            String catBusca = sc.nextLine();
                            double totalCategoria = calcularValorPorCategoria(produtos, quantidadeProdutos, catBusca);
                            System.out.printf("\nValor total em estoque para a categoria '%s': R$ %.2f\n", catBusca, totalCategoria);
                            break;

                        default:
                            System.out.println("Opção inválida!\n");
                    }
                    break;

                case 5: // SAIR
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }

        } while (opcao != 5);

        sc.close();
    }
}
