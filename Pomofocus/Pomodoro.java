package Pomofocus;

// Gerencia os ciclos de foco e descanso de um usuário

public class Pomodoro {
    private int tempoDeFoco = 25;
    private int descansoCurto = 5;
    private int descansoLongo = 20;
    private Usuario usuario;

    // Construtor: recebe o usuário logado e o associa a esse Pomodoro
    public Pomodoro (Usuario usuario) {
        this.usuario = usuario;
    }

    // Permite mudar os tempos padrão
    public void configurarTempos (int foco, int curto, int longo) {
        tempoDeFoco = foco;
        descansoCurto = curto;
        descansoLongo = longo;
    }

    //Método principal: executa o ciclo completo do Pomodoro
    public void iniciarCiclos () {
        int ciclo = 0;
        
        if (usuario.getBlocoDeFocos() <= 0) {
            System.out.println("Nenhum bloco de foco disponivel!");
            return;
        }
        while (usuario.getBlocoDeFocos() > 0) {
            TimerPomodoro.iniciar(tempoDeFoco, "Tempo de Foco");
            usuario.reduzirBloco();
            ciclo++;

            if (ciclo == 4) {
                TimerPomodoro.iniciar(descansoLongo, "Descanso longo!");
                ciclo = 0;
            } else if (usuario.getBlocoDeFocos() > 0) {
                TimerPomodoro.iniciar(descansoCurto, "Descanso Curto!");
            }
        }
        System.out.println("Parabéns!!! \nTodos os seus Pomofocus foram concluídos!");
    }
}
