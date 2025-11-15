package Aula7.Exercicios.Vacinacao;

import java.util.Random;
import Aula7.Pilha.Pessoa;
import Aula7.FilaCircular.FilaCircular;

public class TriagemVacinaCircular {
    public static void main(String[] args) {
        FilaCircular filaPrincipal = new FilaCircular(10);
        FilaCircular filaPrioridade = new FilaCircular(10);
        FilaCircular filaComum = new FilaCircular(10);

        Random random = new Random();

        // Lista de nomes possíveis
        String[] nomes = {
            "Ailton", "Rosana", "Cosme", "Débora", "Arsonval",
            "Bruna", "Carlos", "Sueli", "João", "Marina",
            "Paulo", "Fernanda", "Lúcio", "Marta", "Roberto"
        };

        // Gera 10 pessoas com nomes e idades aleatórias
        for (int i = 0; i < 10; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            int idade = random.nextInt(90) + 10; // de 10 a 99 anos
            Pessoa p = new Pessoa(nome, idade);
            filaPrincipal.enqueue(p);
        }

        // Separa entre fila de prioridade e fila comum
        while (!filaPrincipal.isEmpty()) {
            Pessoa pessoaAtual = filaPrincipal.dequeue();

            if (pessoaAtual.getIdade() >= 60) {
                filaPrioridade.enqueue(pessoaAtual);
            } else {
                filaComum.enqueue(pessoaAtual);
            }
        }

        System.out.println("\n===== FILA DE PRIORIDADE (60+) =====");
        filaPrioridade.exibirFila();

        System.out.println("\n===== FILA COMUM (<60) =====");
        filaComum.exibirFila();

        System.out.println("---------------------------------------------");
    }
}