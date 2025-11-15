package Avaliacao1;

public class Buscador {

    public static int buscaBinariaPorNome(Produto[] vetor, int tamanho, String nomeBusca) {
        int inicio = 0, fim = tamanho - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int cmp = vetor[meio].getNome().compareToIgnoreCase(nomeBusca);
            if (cmp == 0) return meio;
            else if (cmp < 0) inicio = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }

    public static int buscarPorCodigo(Produto[] vetor, int tamanho, long codigoBusca) {
        for (int i = 0; i < tamanho; i++)
            if (vetor[i].getCodigo() == codigoBusca) return i;
        return -1;
    }

    public static int[] buscarPorCategoria(Produto[] vetor, int tamanho, String categoriaBusca) {
        int[] indices = new int[tamanho];
        int count = 0;
        for (int i = 0; i < tamanho; i++)
            if (vetor[i].getCategoria().equalsIgnoreCase(categoriaBusca))
                indices[count++] = i;

        int[] resultado = new int[count];
        for (int i = 0; i < count; i++) resultado[i] = indices[i];
        return resultado;
    }
}
