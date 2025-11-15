package Aula5.Ordenadores.SelectionSort; // percorre o vetor e vai 'passando' o numero menor para a esquerda até ordernar

public class Ordenador {
    public static void selectionSort (int[] vetor) {
        int n = vetor.length;

        for(int i=0; i<n-1; i++) {
            int indiceDoMenor = i;
            for(int j=i+1; j<n; j++) {
                if (vetor[j] < vetor[indiceDoMenor]) {
                    indiceDoMenor = j;
                }
            }
            int temporario = vetor[indiceDoMenor];
            vetor[indiceDoMenor] = vetor[i];
            vetor[i] = temporario;
        }
    }
}
