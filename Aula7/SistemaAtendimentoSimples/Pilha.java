package Aula7.SistemaAtendimentoSimples;

public class Pilha {
    private Pessoa[] elementos;  // Array que armazena pessoas
    private int topo;            // Índice do topo da pilha
    private int capacidade;      // Capacidade máxima

// Construtor ******************************************************************************************************
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.topo = -1;  // Pilha vazia
    }

// Verifica se a pilha está vazia ***********************************************************************************
    public boolean isEmpty() {
        return topo == -1;
    }

// Verifica se a pilha está cheia ************************************************************************************
    public boolean isFull() {
        return topo == capacidade - 1;
    }

// Adiciona pessoa ao topo da pilha **********************************************************************************
    public void push(Pessoa p) {
        if (isFull()) {
            System.out.println("A pilha está cheia! Não é possível adicionar " + p.getNome());
            return;
        }
        topo++;
        elementos[topo] = p;
        System.out.println(p.getNome()+ " adicionada à pilha (emergência): ");
    }

// Remove e retorna a pessoa do topo da pilha ***********************************************************************
    public Pessoa pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia!");
            return null;
        }
        Pessoa p = elementos[topo];
        elementos[topo] = null;
        topo--;
        System.out.println(p.getNome()+ " atendida e removida da pilha: ");
        return p;
    }

// Olha quem está no topo, sem remover *****************************************************************************
    public Pessoa peek() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia!");
            return null;
        }
        return elementos[topo];
    }

// Mostra todas as pessoas na pilha (do topo para a base) *********************************************************
    public void exibirPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia!");
            return;
        }
        System.out.println("===== PESSOAS NA PILHA (EMERGÊNCIA) =====");
        for (int i = topo; i >= 0; i--) {
            System.out.println("• " + elementos[i]);
        }
    }

// Retorna o tamanho atual da pilha ******************************************************************************
    public int tamanho() {
        return topo + 1;
    }

    public Pessoa getElemento(int indice) {
        if (indice < 0 || indice > topo) return null;
        return elementos[indice];
    }    
}