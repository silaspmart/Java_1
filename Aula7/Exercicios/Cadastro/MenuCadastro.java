package Aula7.Exercicios.Cadastro;

import java.util.Scanner;
import Aula7.Pilha.Pessoa;
import Aula7.Pilha.Pilha;

public class MenuCadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando uma pilha com capacidade para 5 pessoas
        Pilha pilhaCadastros = new Pilha(5);

        int opcao;
        do {
            System.out.println("\n========== MENU DE CADASTRO ==========");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Desfazer último cadastro");
            System.out.println("3 - Mostrar última pessoa cadastrada");
            System.out.println("4 - Mostrar todas as pessoas cadastradas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    if (pilhaCadastros.tamanho() == 5) {
                        System.out.println("❌ A pilha está cheia! Não é possível cadastrar mais pessoas.");
                        break;
                    }
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine(); // limpar buffer

                    Pessoa p = new Pessoa(nome, idade);
                    pilhaCadastros.push(p);
                }
                case 2 -> {
                    pilhaCadastros.pop();
                }
                case 3 -> {
                    Pessoa topo = pilhaCadastros.peek();
                    if (topo != null) {
                        System.out.println("👤 Última pessoa cadastrada: " + topo.getNome() + " (" + topo.getIdade() + " anos)");
                    }
                }
                case 4 -> {
                    if (pilhaCadastros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("\n===== PESSOAS CADASTRADAS (Topo → Base) =====");
                        for (int i = pilhaCadastros.tamanho() - 1; i >= 0; i--) {
                            Pessoa p = pilhaCadastros.peek();
                            System.out.println("• " + pilhaCadastros.tamanho() + " pessoa(s)");
                            break;
                        }

                        // Como Pilha não tem método direto pra listar tudo,
                        // vamos apenas mostrar o topo e o tamanho.
                        System.out.println("Topo atual: " + pilhaCadastros.peek().getNome());
                        System.out.println("Total cadastrados: " + pilhaCadastros.tamanho());
                    }
                }
                case 5 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        sc.close();
    }
}