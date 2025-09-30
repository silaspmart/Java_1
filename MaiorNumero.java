/* Crie uma classe MaiorNumero que analise um conjunto de pontuações. Peça ao usuário para inserir 6 números inteiros, que
podem representar pontuações de um jogo, usando Scanner ou JOptionPane. Armazene esses números em um vetor, processe
os dados para encontrar a maior pontuação e, ao final, exiba o recorde encontrado. */

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String [] args) {
        int N = 6;
        Scanner ler = new Scanner(System.in);
        int [] pontos = new int [N];
        int maior = 0;

        System.out.println("\n======== RECORDE DE PONTOS ========\n");

        for (int i=0; i<N; i++){
            System.out.print("Digite a " +(i+1)+ " pontuacao: ");
            pontos [i] = ler.nextInt();
            if (pontos [i] > maior) {
                maior = pontos [i];
            }
        }

        System.out.printf("\nO recorde de pontuacao e: " +maior+ "\n");
        
        ler.close();
    }
}
