package Aula7.Pilha;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Daniel", 25);
        Pessoa p2 = new Pessoa("Pedro", 18);

        System.out.println("--- Pilha de pessoas ----");
        Pilha pilha = new Pilha(2);

        pilha.pop(); // tentativa em pilha vazia
        pilha.push(p1);
        pilha.push(p2);

        System.out.println("Olhando o topo com peek: " + pilha.peek().getNome());
        pilha.pop();
        pilha.pop();
        pilha.pop(); // tentativa extra
    }
}
