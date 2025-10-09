package Aula5.Buscadores;

public class Programa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7};
        int busca = 2;

        int posicao = Binario.buscaBinaria(vetor, busca);
        if (posicao == -1) {
            System.out.print("O número não esta na lista.");
        } else {
            System.out.printf("O item buscado esta na posição %d e é o item %d ", posicao, vetor[posicao]);
        }
    }
}
