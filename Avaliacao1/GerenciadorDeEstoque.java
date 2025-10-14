package Avaliacao1;

import java.util.Scanner;

public class GerenciadorDeEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[100]; // Vetor com até 100 produtos
        int quantidadeProdutos = 0, qtdEstoque, opcao;
        long codigo, codigoBusca;
        String nome, categoria;
        double preco;
        boolean encontrado; // para realizar as buscas que o ususario desejar

        System.out.println("\n************************************\n*** SISTEMA DE GESTÃO DE ESTOQUE ***\n************************************");
        System.out.println("======== MENU PRINCIPAL ========\n");

///////////////////////////////////////////////////////////////////////////////////////////////////////////
        do {  // Iniciei com um "faça/enquanto"
            System.out.println("1) Cadastrar produto");
            System.out.println("2) Buscar produtos");
            System.out.println("3) Listar produtos");
            System.out.println("4) Sair");             
            System.out.print("\n>> Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar a tela

    //////////////////////////////////////////////////////////////////////////////////////////////////////
            switch (opcao) { // Daqui pra frente, são varios "escolha/caso" aninhados :)
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

                    System.out.println("Produto cadastrado com sucesso!\n");
                    System.out.println("-----------------------------------\n");
                    break;

        ///////////////////////////////////////////////////////////////////////////////////////
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
                                System.out.printf("Nome: %S\n", produtos[i].nome);
                                System.out.printf("Quantidade: %d\n", produtos[i].qtdEstoque);
                                System.out.printf("Valor total em estoque: R$ %.2f\n\n", produtos[i].calcularValorTotal());
                                encontrado = true;
                                break;
                            }
                        }
                        if (encontrado == false) {
                            System.out.printf("Produto com código %s não encontrado!\n", codigoBusca);
                        }
                        break;
                    default:
                        System.out.println("Opção inválida.");

                    case 2: // Buscar por nome
                        System.out.print("Digite o nome do produto: ");
                        String nomeBusca = sc.nextLine();
                        encontrado = false;

                        for (int i = 0; i < quantidadeProdutos; i++) {
                            if (produtos[i].nome.equalsIgnoreCase(nomeBusca)) { // Usei "equalsIgnoreCase" para não diferenciar maiusculas e minusculas
                                System.out.println("\nProduto encontrado:");
                                System.out.printf("Código: %d\n", produtos[i].codigo);
                                System.out.printf("Quantidade: %d\n", produtos[i].qtdEstoque);
                                System.out.printf("Valor total em estoque: R$ %.2f\n\n", produtos[i].calcularValorTotal());
                                encontrado = true;
                        break;
                            }       
                        }
                            if (encontrado == false) {
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
                                System.out.printf("Código: %s\n", produtos[i].codigo);
                                System.out.printf("Nome: %s\n", produtos[i].nome);
                                System.out.printf("Quantidade: %d\n", produtos[i].qtdEstoque);
                                System.out.printf("Valor total em estoque: R$ %.2f\n\n", produtos[i].calcularValorTotal());
                                encontrado = true;
                            }
                        }
                    
                        if (encontrado == false) { // Caso o valor não seja encontrado
                            System.out.printf("Nenhum produto encontrado na categoria %s!\n", categoriaBusca);
                        }
                        break;                    
                }
                break;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
                    case 1: // Por nome (ordem alfabética)
                        System.out.println("\n--- Produtos ordenados por nome ---");

                        Produto[] copiaPorNome = new Produto[quantidadeProdutos]; // Copiar produtos para um novo array do mesmo tamanho
                        for (int i = 0; i < quantidadeProdutos; i++) {
                            copiaPorNome[i] = produtos[i];
                        }
                            for (int i = 0; i < copiaPorNome.length - 1; i++) { // Ordenar pelo nome usando bubble sort
                                for (int j = i + 1; j < copiaPorNome.length; j++) {
                                    if (copiaPorNome[i].nome.compareToIgnoreCase(copiaPorNome[j].nome) > 0) {
                                        Produto temp = copiaPorNome[i];
                                        copiaPorNome[i] = copiaPorNome[j];
                                        copiaPorNome[j] = temp;
                                    }
                                }
                            }
                            break;
                        
                        case 2: // Por CÓDIGO
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
                        for (int i = 0; i < copiaPorCodigo.length; i++) { // Exibir os dados na tela
                            System.out.println("-------------------------");
                            System.out.printf("Código: %s\n", copiaPorCodigo[i].codigo);
                            System.out.printf("Nome: %s\n", copiaPorCodigo[i].nome);
                            System.out.printf("Categoria: %s\n", copiaPorCodigo[i].categoria);
                            System.out.printf("Quantidade: %d\n", copiaPorCodigo[i].qtdEstoque);
                            System.out.printf("Valor total em estoque: R$ %.2f\n\n", copiaPorCodigo[i].calcularValorTotal());
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!\n");
                }
                break;
            }
        } while (opcao != 4);

        sc.close();
    }
}

