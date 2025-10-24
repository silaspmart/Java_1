package Avaliacao1;

public class Ordenador {

    public static void ordenarPorNome(Produto[] vetor, int tamanho) {
        for (int i = 1; i < tamanho; i++) {
            Produto atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j].getNome().compareToIgnoreCase(atual.getNome()) > 0) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
    }

    public static void ordenarPorCodigo(Produto[] vetor, int tamanho) {
        for (int i = 1; i < tamanho; i++) {
            Produto atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j].getCodigo() > atual.getCodigo()) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
    }

    public static void ordenarPorQuantidade(Produto[] vetor, int tamanho) {
        for (int i = 1; i < tamanho; i++) {
            Produto atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j].getQtdEstoque() > atual.getQtdEstoque()) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
    }

    public static void ordenarPorPreco(Produto[] vetor, int tamanho) {
        for (int i = 1; i < tamanho; i++) {
            Produto atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j].getPreco() > atual.getPreco()) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
    }
}
