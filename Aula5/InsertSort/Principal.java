package Aula5.InsertSort;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int tamanhoVetor = 6; 
        int [] vetor = new int[tamanhoVetor];
        Random gerador = new Random();

        for (int i=0; i<vetor.length; i++) {
            vetor [i] = gerador.nextInt(100)+1;
        }
        System.out.println("\n### Vetor original ###");

        for (int i=0; i<tamanhoVetor; i++) {
            System.out.printf("Index %d - %d\n", i, vetor[i]);
        }

        Insert.insertionSort(vetor);
        System.out.println("\n### Vetor ordenado ###");
        for (int i=0; i<vetor.length; i++) {
            System.out.printf("Index %d - %d\n", i, vetor[i]);
        }
    }
}
