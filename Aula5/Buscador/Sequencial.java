package Aula5.Buscador;

public class Sequencial {
    public static int buscaSequencial(int[] vetor, int busca) {
        for (int i=0; i<vetor.length; i++) {
            if (vetor [i] == busca) {
                return i;
            }
        }
        return-1;
    }
}
