package Aula7.SistemaAtendimentoSimples;

public class Fila {
    private Pessoa[] elementos;  // Array para armazenar pessoas
    private int inicio;          // Índice do início da fila
    private int fim;             // Índice do final da fila
    private int tamanho;         // Quantidade de elementos na fila
    private int capacidade;      // Capacidade máxima da fila

// Construtor **************************************************************************************************************
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

// Verifica se a fila está vazia *******************************************************************************************
    public boolean isEmpty() {
        return tamanho == 0;
    }

// Verifica se a fila está cheia *******************************************************************************************
    public boolean isFull() {
        return tamanho == capacidade;
    }

// Adiciona uma pessoa ao final da fila ************************************************************************************
    public void enqueue(Pessoa p) {
        if (isFull()) {
            System.out.println("A fila está cheia! Não é possível adicionar " + p.getNome());
            return;
        }
        fim = (fim + 1) % capacidade;  // Circular
        elementos[fim] = p;
        tamanho++;
        System.out.println(p.getNome()+ " adicionada à fila: ");
    }
 
// Remove e retorna a pessoa do início da fila ****************************************************************************
    public Pessoa dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
            return null;
        }
        Pessoa p = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        System.out.println(p.getNome()+ " atendida e removida da fila: ");
        return p;
    }

// Mostra todas as pessoas na fila (do início ao fim) *********************************************************************
    public void exibirFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
            return;
        }
        System.out.println("===== PESSOAS NA FILA =====");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % capacidade;
            System.out.println("• " + elementos[index]);
        }
    }

// Retorna o tamanho atual da fila ***************************************************************************************
    public int tamanho() {
        return tamanho;
    }

    public Pessoa getElemento(int indice) {
        if (indice < 0 || indice >= tamanho) return null;
        int index = (inicio + indice) % capacidade;
        return elementos[index];
    }   
}