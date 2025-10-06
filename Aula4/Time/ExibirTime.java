package Aula4.Time;

public class ExibirTime {
    public static void main(String[] args) {
        TimeDeFutebol meuTime = new TimeDeFutebol("Derrotinha F.C.");

        Jogador p1 = new Jogador("Muralha", "Goleiro");
        Jogador p2 = new Jogador("Fagner", "LD");
        Jogador p3 = new Jogador("Erazo", "Zagueiro");
        Jogador p4 = new Jogador("Wallace", "Zagueiro");
        Jogador p5 = new Jogador("Apodi", "LE");
        Jogador p6 = new Jogador("Marcio Araujo", "Volante");
        Jogador p7 = new Jogador("Lucas Mugni", "Meia");
        Jogador p8 = new Jogador("Paulo Baier", "Meia");
        Jogador p9 = new Jogador("Juninho", "Atacante");
        Jogador p10 = new Jogador("Michael", "Atacante");
        Jogador p11= new Jogador("Ribamar", "Atacante");

        meuTime.contratarJogador(p1);
        meuTime.contratarJogador(p2);
        meuTime.contratarJogador(p3);
        meuTime.contratarJogador(p4);
        meuTime.contratarJogador(p5);
        meuTime.contratarJogador(p6);
        meuTime.contratarJogador(p7);
        meuTime.contratarJogador(p8);
        meuTime.contratarJogador(p9);
        meuTime.contratarJogador(p10);
        meuTime.contratarJogador(p11);

        meuTime.exibirEscalacao();
    }
}
