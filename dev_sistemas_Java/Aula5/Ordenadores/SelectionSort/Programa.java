package Aula5.Ordenadores.SelectionSort;

import java.util.Random;

public class Programa {
    public static void main(String[] args) {
        int tamanhoVetor = 6; 
        int [] vetor = new int[tamanhoVetor];
        Random gerador = new Random();

        for (int i=0; i<vetor.length; i++) {
            vetor [i] = gerador.nextInt(100)+1;
        }
        System.out.println("### Vetor original (primeiros elementos) ###");

        for (int i=0; i<tamanhoVetor; i++) {
            System.out.printf("Index %d - %d\n", i, vetor[i]);
        }

        Ordenador.selectionSort(vetor);
        System.out.println("\n### Vetor ordenado ###");
        for (int i=0; i<vetor.length; i++) {
            System.out.printf("Index %d - %d\n", i, vetor[i]);
        }
    }
}