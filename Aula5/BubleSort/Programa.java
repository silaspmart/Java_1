package Aula5.BubleSort;   // Vai comparando e trocando nas posições caso "a < b"

import java.util.Random;

public class Programa {
    public static void main(String[] args) {
        int tamanhoVetor = 6; 
        int [] vetor = new int[tamanhoVetor];
        Random gerador = new Random();

        for (int i=0; i<vetor.length; i++) {
            vetor [i] = gerador.nextInt(100)+1;
        }
        System.out.println("### Vetor original ###");

        for (int i=0; i<tamanhoVetor; i++) {
            System.out.printf("Index %d - %d\n", i, vetor[i]);
        }

        Ordenador.bubbleSort(vetor);
        System.out.println("\n### Vetor ordenado ###");
        for (int i=0; i<vetor.length; i++) {
            System.out.printf("Index %d - %d\n", i, vetor[i]);
        }
    }
}
