package Aula7.Exercicios.Embarque;

public class Pilha {
    private Pessoa [] elementos;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.topo = -1;
    }

    public void push(Pessoa elemento) {
        if (topo == capacidade - 1) return;
        topo++;
        elementos[topo] = elemento;
    }

    public Pessoa pop () {
        if (isEmpty()) return null;
        Pessoa p = elementos[topo];
        topo--;
        return p;
    }

    public boolean isEmpty () {
        return topo == -1;
    }

    public int tamanho () {
        return topo +1;
    }
} 
