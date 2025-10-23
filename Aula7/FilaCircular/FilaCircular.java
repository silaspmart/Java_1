package Aula7.FilaCircular;

import Aula7.Pilha.Pessoa;

public class FilaCircular {
    private Pessoa[] elementos;
    private int inicio;
    private int fim;
    private int capacidade;
    private int tamanho;

    public FilaCircular(int capacidade) {
        this.elementos = new Pessoa[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    // Adiciona uma pessoa no final da fila (sem imprimir nada)
    public void enqueue(Pessoa elemento) {
        if (tamanho == capacidade) {
            System.out.println("⚠️ A fila está cheia! Não foi possível adicionar: " + elemento.getNome());
            return;
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
    }

    // Remove uma pessoa do início da fila
    public Pessoa dequeue() {
        if (isEmpty()) {
            System.out.println("⚠️ A fila está vazia!");
            return null;
        }
        Pessoa p = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return p;
    }

    public Pessoa front() {
        if (isEmpty()) return null;
        return elementos[inicio];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    // Exibe a fila em formato de tabela
    public void exibirFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
            return;
        }

        System.out.println("+----------------------+--------+");
        System.out.println("| Nome                 | Idade  |");
        System.out.println("+----------------------+--------+");

        int index = inicio;
        for (int i = 0; i < tamanho; i++) {
            Pessoa p = elementos[index];
            System.out.printf("| %-20s | %6d |\n", p.getNome(), p.getIdade());
            index = (index + 1) % capacidade;
        }

        System.out.println("+----------------------+--------+");
    }
}
