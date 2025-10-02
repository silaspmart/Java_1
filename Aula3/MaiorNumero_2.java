package Aula3;
/* Crie uma classe MaiorNumero que analise um conjunto de pontuações. Peça ao usuário para inserir 6 números inteiros, que
podem representar pontuações de um jogo, usando Scanner ou JOptionPane. Armazene esses números em um vetor, processe
os dados para encontrar a maior pontuação e, ao final, exiba o recorde encontrado, agora com JOptioPane */

import javax.swing.JOptionPane;;

public class MaiorNumero_2 {
    public static void main(String [] args) {
        int N = 6;
        int [] pontos = new int [N];
        int maior = 0;

        JOptionPane.showMessageDialog(null,"Digite os pontos para descobrirmos a maior pontuação!!! ");

        for (int i=0; i<pontos.length; i++){
            String message = String.format("Digite a %d pontuacao: ", i+1);
            pontos [i] = Integer.parseInt(JOptionPane.showInputDialog(null, message));
            if (pontos [i] > maior) {
                maior = pontos [i];
            }
        }
        JOptionPane.showMessageDialog(null, "A maior pontuação registrada foi: " +maior);
    }
}