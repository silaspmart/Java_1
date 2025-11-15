package Aula7.Exercicios.Vacinacao;

import Aula7.Pilha.Pessoa;

public class FilaCircular {
    private Pessoa[] elementos;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaCircular(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = 0;
    }
    // Adiciona uma pessoa no final da fila
    public void enqueue(Pessoa elemento) {
        if (tamanho == capacidade) {
            System.out.println("A fila está cheia! Não foi possível adicionar " + elemento.getNome());
            return;
        }
        elementos[fim] = elemento;
        fim = (fim + 1) % capacidade;
        tamanho++;
    }
    // Remove e retorna a pessoa do início da fila
    public Pessoa dequeue() {
        if (isEmpty()) {
            return null;
        }
        Pessoa p = elementos[inicio];
        elementos[inicio] = null; // limpa referência
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return p;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
    // Mostra todas as pessoas ainda na fila
    // Mostra todas as pessoas ainda na fila, com posição
    public void exibirFila() {
        if (isEmpty()) {
        System.out.println("A fila está vazia!");
        return;
        }

    int indice = inicio;
        for (int posicao = 1; posicao <= tamanho; posicao++) {
            Pessoa pessoa = elementos[indice];
            System.out.println(posicao + "º - " + pessoa.getNome() + " (" + pessoa.getIdade() + " anos)");
            indice = (indice + 1) % capacidade;
         }
    }
}

