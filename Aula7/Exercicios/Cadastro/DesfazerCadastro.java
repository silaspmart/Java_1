package Aula7.Exercicios.Cadastro;

import Aula7.Pilha.Pessoa;
import Aula7.Pilha.Pilha;

public class DesfazerCadastro {
    public static void main(String[] args) {

        // 1. Criar uma pilha com capacidade para 5 pessoas
        Pilha pilhaCadastros = new Pilha(5);

        // 2. Criar as pessoas (cadastros)
        Pessoa p1 = new Pessoa("Ana", 28);
        Pessoa p2 = new Pessoa("Bruno", 30);
        Pessoa p3 = new Pessoa("Carla", 25);

        // 3. Simular cadastros (push)
        System.out.println("=== CADASTRANDO PESSOAS ===");
        pilhaCadastros.push(p1);
        pilhaCadastros.push(p2);
        pilhaCadastros.push(p3);

        // 4. Mostrar o topo antes de desfazer
        System.out.println("\nTopo da pilha antes de desfazer: " + pilhaCadastros.peek().getNome());

        // 5. Simular dois “desfazer” (pop)
        System.out.println("\n=== DESFAZENDO CADASTROS ===");
        pilhaCadastros.pop(); // desfaz Carla
        pilhaCadastros.pop(); // desfaz Bruno

        // 6. Mostrar quem ainda está cadastrado
        System.out.println("\nTopo da pilha após desfazer: " + pilhaCadastros.peek().getNome());

        // 7. Mostrar o tamanho atual da pilha
        System.out.println("Pessoas ainda cadastradas: " + pilhaCadastros.tamanho());
    }
}
