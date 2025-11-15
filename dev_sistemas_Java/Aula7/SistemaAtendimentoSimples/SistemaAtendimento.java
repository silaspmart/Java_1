package Aula7.SistemaAtendimentoSimples;

import java.util.Scanner;
import java.util.Random;

public class SistemaAtendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        Fila filaNormal = new Fila(5);
        Pilha pilhaEmergencia = new Pilha(5);

        boolean rodando = true;

        while (rodando) {
            limparTela();

            System.out.println("\n===== SISTEMA DE ATENDIMENTO =====");
            System.out.println("1 - Cadastrar pessoa na fila normal");
            System.out.println("2 - Cadastrar pessoa na pilha de emergência");
            System.out.println("3 - Atender próxima pessoa da fila");
            System.out.println("4 - Atender próxima pessoa da pilha");
            System.out.println("5 - Desfazer último cadastro na pilha");
            System.out.println("6 - Cadastro automático de 5 pessoas na fila");
            System.out.println("7 - Exibir fila normal");
            System.out.println("8 - Exibir pilha de emergência");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = lerInteiro(sc);

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeFila = sc.nextLine();
                    int idadeFila = gerarIdade(rand);
                    filaNormal.enqueue(new Pessoa(nomeFila, idadeFila));
                    pausa(sc);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomePilha = sc.nextLine();
                    int idadePilha = gerarIdade(rand);
                    pilhaEmergencia.push(new Pessoa(nomePilha, idadePilha));
                    pausa(sc);
                    break;

                case 3:
                    filaNormal.dequeue();
                    pausa(sc);
                    break;

                case 4:
                    pilhaEmergencia.pop();
                    pausa(sc);
                    break;

                case 5:
                    System.out.println("Desfazendo último cadastro na pilha...");
                    pilhaEmergencia.pop();
                    pausa(sc);
                    break;

                case 6:
                    System.out.println("Cadastro automático de 5 pessoas na fila");
                    for (int i = 1; i <= 5; i++) {
                        String nome = "Pessoa" + i;
                        int idade = gerarIdade(rand);
                        filaNormal.enqueue(new Pessoa(nome, idade));
                    }
                    pausa(sc);
                    break;

                case 7:
                    System.out.println("\n===== FILA NORMAL =====");
                    exibirTabela(filaNormal);
                    pausa(sc);
                    break;

                case 8:
                    System.out.println("\n===== PILHA DE EMERGÊNCIA =====");
                    exibirTabelaPilha(pilhaEmergencia);
                    pausa(sc);
                    break;

                case 0:
                    rodando = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Digite um número válido.");
                    pausa(sc);
            }
        }

        sc.close();
    }

    // ===================== MÉTODOS AUXILIARES =====================

    // Limpa a tela usando ANSI (funciona na maioria dos terminais)
    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Gera idade aleatória entre 18 e 80
    private static int gerarIdade(Random rand) {
        return 18 + rand.nextInt(63);
    }

    // Exibe fila como tabela
    private static void exibirTabela(Fila fila) {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia!");
            return;
        }
        System.out.printf("%-10s | %-5s%n", "Nome", "Idade");
        System.out.println("-------------------");
        for (int i = 0; i < fila.tamanho(); i++) {
            Pessoa p = fila.getElemento(i);
            System.out.printf("%-10s | %-5d%n", p.getNome(), p.getIdade());
        }
    }

    // Exibe pilha como tabela (do topo para base)
    private static void exibirTabelaPilha(Pilha pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia!");
            return;
        }
        System.out.printf("%-10s | %-5s%n", "Nome", "Idade");
        System.out.println("-------------------");
        for (int i = pilha.tamanho() - 1; i >= 0; i--) {
            Pessoa p = pilha.getElemento(i);
            System.out.printf("%-10s | %-5d%n", p.getNome(), p.getIdade());
        }
    }

    // Lê um número inteiro com tratamento de erro
    private static int lerInteiro(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida! Digite um número: ");
            }
        }
    }

    // Pausa até o usuário pressionar ENTER
    private static void pausa(Scanner sc) {
        System.out.println("\nPressione ENTER para continuar...");
        sc.nextLine();
    }
}
