package Aula7.Exercicios.Embarque;

public class Fila {
    private Pessoa[] elementos;
    private int tamanho;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.tamanho = 0;
    }

    public void enqueue (Pessoa elemento) {
        if (tamanho == capacidade) return;
        elementos[tamanho] = elemento;
        tamanho++; 
    }

    public Pessoa dequeue () {
        if (isEmpty()) return null;
        Pessoa p = elementos[0];
        for (int i=0; i < tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;
        return p;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int tamanho () {
        return tamanho;
    }

    public void exibirFila () {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
            return;
        }
        for (int i=0; i<tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }
}
