package Aula5.Ordenadores.InsertSort; // vai movendo cada item até sua posição correta, sempre a esquerda

public class Insert {
    public static void insertionSort(int [] vetor) {
        for (int i=1; i<vetor.length; i++){
            int chave = vetor[i];
            int j = i-1;
            while (j>=0 && vetor[j]>chave) {
                vetor[j+1] = vetor[j];
                j = j-1;
            }
            vetor[j+1] = chave;
        }
    }
}
