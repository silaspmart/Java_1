package Aula4.Time;

public class TimeDeFutebol {
    String nomeDoTime;
    Jogador[] jogadores = new Jogador[11]; // uma variavel "jogador" do tipo 'Jogador', consiste num vetor de 11 posições 
    int jogadoresContratados = 0;

    public TimeDeFutebol (String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
    }

    public void contratarJogador (Jogador novoJogador) { 
    // método recebe na variavel "novoJogador" informações do tipo 'Jogador'
        if (jogadoresContratados < jogadores.length) {
            jogadores[jogadoresContratados] = novoJogador; 
                // adiciona um "novoJogador" ao vetor
            jogadoresContratados++; 
                // adiciona +1 a variavel "jogadoresContratados"
            System.out.printf("Jogador %s contratado para a posição de %s\n\n", novoJogador.nome, novoJogador.posicao);
        } else {
            System.out.println("Não é possivel contratar, as 11 vagas estão preenchidas");
        }
    }
    public void exibirEscalacao () {
        System.out.println("\n*** Escalação do time " +nomeDoTime+ " ***");
        for (int i=0; i<jogadoresContratados; i++) {
            System.out.println((i+1)+ ". " +jogadores[i].nome+ " - " +jogadores[i].posicao);
        }     
    }        
}
