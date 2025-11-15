package Aula5.Buscadores; // olha os numeros em sequencia ate achar o numero procurado (a=b?)

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
