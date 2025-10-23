package Aula7.Exercicios.Vacinacao;

public class TriagemVacinaCircular {
    public static void main(String[] args) {
        FilaCircular filaPrincipal = new FilaCircular(5);
        FilaCircular filaPrioridade = new FilaCircular(5);
        FilaCircular filaComum = new FilaCircular(5);

        Pessoa p1 = new Pessoa("Ailton", 32);
        Pessoa p2 = new Pessoa("Rosana", 61);
        Pessoa p3 = new Pessoa("Cosme", 58);
        Pessoa p4 = new Pessoa("Debora", 36);
        Pessoa p5 = new Pessoa("Arsonval", 81);

        filaPrincipal.enqueue(p1);
        filaPrincipal.enqueue(p2);
        filaPrincipal.enqueue(p3);
        filaPrincipal.enqueue(p4);
        filaPrincipal.enqueue(p5);

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

