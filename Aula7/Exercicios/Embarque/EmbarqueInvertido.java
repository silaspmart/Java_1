package Aula7.Exercicios.Embarque;

import Aula7.Exercicios.Vacinacao.FilaCircular;
import Aula7.Pilha.Pessoa;
import Aula7.Pilha.Pilha;

public class EmbarqueInvertido {
    public static void main(String[] args) {
        // Fila circular com todas as pessoas aguardando
        FilaCircular filaPrincipal = new FilaCircular(10);

        Pessoa[] pessoas = {
            new Pessoa("Ana", 22),
            new Pessoa("Bruno", 31),
            new Pessoa("Carla", 28),
            new Pessoa("Diego", 35),
            new Pessoa("Elaine", 26),
            new Pessoa("Fabio", 40),
            new Pessoa("Gisele", 33),
            new Pessoa("Henrique", 45),
            new Pessoa("Isabela", 29),
            new Pessoa("João", 38)
        };

        // Enfileira todas as pessoas
        for (Pessoa p : pessoas) {
            filaPrincipal.enqueue(p);
        }

        System.out.println("==== FILA DE ESPERA ====");
        filaPrincipal.exibirFila();

        // Capacidade do micro-ônibus por vez
        final int CAPACIDADE_EMBARQUE = 4;
        Pilha embarque = new Pilha(CAPACIDADE_EMBARQUE);

        System.out.println("\n==== PROCESSO DE EMBARQUE ====");

        // Enquanto houver pessoas na fila
        while (!filaPrincipal.isEmpty()) {
            System.out.println("\n-- Novo grupo entrando na área de embarque --");

            // 1️⃣ Entra até 4 pessoas na área de embarque (ou menos, se sobrar menos gente)
            for (int i = 0; i < CAPACIDADE_EMBARQUE && !filaPrincipal.isEmpty(); i++) {
                Pessoa pessoa = filaPrincipal.dequeue();
                embarque.push(pessoa);
                System.out.println(pessoa.getNome() + " entrou na área de embarque.");
            }

            // 2️⃣ Agora elas sentam (desempilhando)
            System.out.println("\n-- Pessoas sentando no micro-ônibus (da frente para trás) --");
            while (!embarque.isEmpty()) {
                Pessoa pessoa = embarque.pop();
                System.out.println(pessoa.getNome() + " sentou no ônibus.");
            }

            // 3️⃣ Mostra quem ainda está esperando
            if (!filaPrincipal.isEmpty()) {
                System.out.println("\n-- Pessoas que ainda estão na fila de espera --");
                filaPrincipal.exibirFila();
            } else {
                System.out.println("\nTodos embarcaram!");
            }
        }

        System.out.println("\n-----------------------------------------\n");
    }
}
