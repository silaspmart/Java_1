package Aula7.Exercicios.Embarque;

public class EmbarqueInvertido {
    public static void main(String[] args) {
        Fila filaPrincipal = new Fila(7);

        Pessoa p1 = new Pessoa("Ana", 22);
        Pessoa p2 = new Pessoa("Bruno", 31);
        Pessoa p3 = new Pessoa("Carla", 28);
        Pessoa p4 = new Pessoa("Diego", 35);
        Pessoa p5 = new Pessoa("Elaine", 26);
        Pessoa p6 = new Pessoa("Fabio", 40);
        Pessoa p7 = new Pessoa("Gisele", 33);

        filaPrincipal.enqueue(p1);
        filaPrincipal.enqueue(p2);
        filaPrincipal.enqueue(p3);
        filaPrincipal.enqueue(p4);
        filaPrincipal.enqueue(p5);
        filaPrincipal.enqueue(p6);
        filaPrincipal.enqueue(p7);

        System.out.println("==== Fila de espera ====");
        filaPrincipal.exibirFila();
    // Cria a pilha do embarque (capacidade para 4 pessoas)
        Pilha embarque = new Pilha(4);
    // Retira as 4 primeiras pessoas da fila e empilha (área de embarque)
        System.out.println("\n==== Embarcando no micro-ônibus ====");
        for (int i = 0; i < 4; i++) {
            Pessoa pessoa = filaPrincipal.dequeue();
            if (pessoa != null) {
                embarque.push(pessoa);
                System.out.println(pessoa.getNome() + " entrou na área de embarque.");
            }
        }
    // Agora esvazia a pilha — quem sai por último senta primeiro
        System.out.println("\n==== Pessoas sentando no micro-ônibus (da frente para trás) ====");
        while (!embarque.isEmpty()) {
            Pessoa pessoa = embarque.pop();
            System.out.println(pessoa.getNome() + " sentou no ônibus.");
        }
    // Mostra quem ainda está esperando
        System.out.println("\n==== Pessoas que ainda estão na fila de espera ====");
        filaPrincipal.exibirFila();
        System.out.println("-----------------------------------------\n");
    }
}
