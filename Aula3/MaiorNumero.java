package Aula3;
/* Crie uma classe MaiorNumero que analise um conjunto de pontuações. Peça ao usuário para inserir 6 números inteiros, que
podem representar pontuações de um jogo, usando Scanner ou JOptionPane. Armazene esses números em um vetor, processe
os dados para encontrar a maior pontuação e, ao final, exiba o recorde encontrado. */

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String [] args) {
        int N = 6;
        Scanner sc = new Scanner(System.in);
        int [] pontos = new int [N];
        int maior = 0;

        System.out.println("\n======== RECORDE DE PONTOS ========\n");

        for (int i=0; i<pontos.length; i++){
            System.out.printf("Digite a %dª pontuacao: ", i+1);
            pontos [i] = sc.nextInt();
            if (pontos [i] > maior) {
                maior = pontos [i];
            }
        }
        System.out.printf("\nO recorde de pontuacao e %d", maior);
        sc.close();
    }
}
