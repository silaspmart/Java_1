package Aula5.BubleSort;

public class Ordenador {
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        for (int i=0; i<n; i++) {
            for (int j =0; j<n-i-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int temporario = vetor [j];
                    vetor [j] = vetor [j+1];
                    vetor [j+1] = temporario;
                }
            }
        }
    }
}