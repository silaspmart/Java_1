package Testes.LetreiroDigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o prefixo: ");
        String prefixo = scanner.nextLine();

        System.out.print("Quantos destinos deseja inserir? (max 4): ");
        int n = Math.min(scanner.nextInt(), 4);
        scanner.nextLine();

        List<Mensagem> mensagens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite destino #" + (i + 1) + ": ");
            String destino = scanner.nextLine();
            mensagens.add(new Mensagem(prefixo, destino));
        }

        System.out.println("Escolha o modo de exibição:");
        System.out.println("1 - Rolagem");
        System.out.println("2 - Troca direta");
        System.out.println("3 - Mensagem parada (apenas 1 destino)");
        int modo = scanner.nextInt();

        Painel painel = new Painel();
        GerenciadorMensagens gerenciador = new GerenciadorMensagens(mensagens, painel, modo);

        gerenciador.iniciar();

        scanner.close();
    }
}

