package Aula7.Exercicios.Vacinacao;

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
        if (tamanho == capacidade) {
            System.out.println("A fila esta cheia! não foi possivel adicionar " +elemento.getNome());
            return;
        }
        elementos[tamanho] = elemento;
        tamanho++;
        System.out.println("A pessoa " +elemento.getNome()+ " foi adicionada a fila!");
    }

    public Pessoa dequeue () {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
            return null;
        }
        Pessoa p = elementos[0];
        for (int i=0; i<tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho-1] = null;
        tamanho--;
        System.out.println("A pessoa " +p.getNome()+ " foi removida do inicio da fila!");
        return p;
    }   

    public boolean isEmpty () {
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
