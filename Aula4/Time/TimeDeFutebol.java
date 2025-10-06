package Aula4.Time;

public class TimeDeFutebol {
    String nomeDoTime;
    Jogador[] jogadores = new Jogador[11];
    int jogadoresContratados = 0;

    public TimeDeFutebol (String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
    }

    public void contratarJogador (Jogador novoJogador) {
        if (jogadoresContratados < jogadores.length) {
            jogadores[jogadoresContratados] = novoJogador;
            jogadoresContratados++;
            System.out.println("Jogador " +novoJogador.nome+ " contratado para a posição de " +novoJogador.posicao);
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
