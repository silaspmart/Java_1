package Aula4.Time;

import java.util.Scanner;

public class ExibirTime {
    public static void main(String[] args) {
        TimeDeFutebol meuTime = new TimeDeFutebol("Derrotinha F.C."); 
            // chama o construtor "TimeDeFutebol" e cria a variavel 'meuTime' que recebe o nome definido pelo ususario
        String nome, posicao;
        int tamanho = 11;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n== VAMOS MONTAR UM TIME DE FUTEBOL ==\n");

        for (int i=0; i<tamanho; i++) {
            System.out.printf("Digite o nome do %dº jogador: ", i+1);
            nome = sc.nextLine();
            System.out.printf("Digite a posição do %dº jogador: ", i+1);
            posicao = sc.nextLine();
            Jogador jogador = new Jogador(nome, posicao);
            meuTime.contratarJogador(jogador);
        }
        meuTime.exibirEscalacao();
    }
}
