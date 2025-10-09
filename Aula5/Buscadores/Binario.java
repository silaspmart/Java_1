package Aula5.Buscadores; // Busca um numero dividindo um vetor em metades sucessivas

public class Binario {
    public static int buscaBinaria(int [] vetor, int busca) {
        int inicio = 0;
    int fim = vetor.length-1;

    while(inicio <= fim) {
        int meio = inicio + (fim - inicio) / 2;
        System.out.printf("%d é o inicio \n%d é o meio \n%d é o fim\n\n", inicio, meio, fim);
        if (vetor[meio] == busca) {
            return meio;
        }
        if (vetor[meio] < busca) {
            inicio = meio + 1;
        } else {
            fim = meio - 1;
        }
    }
    return -1;
  }   
}
