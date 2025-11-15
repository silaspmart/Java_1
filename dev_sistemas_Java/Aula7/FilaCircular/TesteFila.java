package Aula7.FilaCircular;

import Aula7.Pilha.Pessoa;

public class TesteFila {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(3);

        Pessoa p1 = new Pessoa("Ana", 20);
        Pessoa p2 = new Pessoa("Bruno", 25);
        Pessoa p3 = new Pessoa("Carlos", 30);
        Pessoa p4 = new Pessoa("Diana", 35);

        fila.enqueue(p1);
        fila.enqueue(p2);
        fila.enqueue(p3);
        fila.enqueue(p4); // fila cheia

        System.out.println("Pessoa no início: " + fila.front().getNome());

        fila.dequeue();
        fila.enqueue(p4); // agora entra no espaço liberado

        System.out.println("Tamanho da fila: " + fila.tamanho());
    }
}

