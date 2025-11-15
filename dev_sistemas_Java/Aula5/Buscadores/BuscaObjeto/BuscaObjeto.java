package Aula5.Buscadores.BuscaObjeto;

public class BuscaObjeto {
    public static void selectionSortPorNome(Item[] vetor) {
        int n = vetor.length;
        for (int i=0; i<n-1; i++) {
            int indiceDoMenor = i;
            for (int j=i+1; j<n ; j++) {
                if (vetor[j].nome.compareToIgnoreCase(vetor[indiceDoMenor].nome)<0) {
                    indiceDoMenor = j;
                }
            }
            Item temp = vetor[indiceDoMenor];  
            vetor[indiceDoMenor] = vetor[i];
            vetor[i] = temp;       
        }
    }
}
