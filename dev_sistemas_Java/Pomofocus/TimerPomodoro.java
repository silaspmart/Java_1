package Pomofocus;

// Responsável por “esperar” o tempo (simula o timer)
public class TimerPomodoro {

    //Método principal que roda o timer
    public static void iniciar(int minutos, String mensagem) {
        int totalSegundos = minutos * 60;

        while (totalSegundos > 0) {
            int min = totalSegundos / 60;
            int seg = totalSegundos % 60;
            System.out.printf("\r%s = %02d:%02d", mensagem, min, seg);
            
            // bloco para contagem dos segundos
            try {
                Thread.sleep(1000); // 1 segundo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            totalSegundos--;
        }
        System.out.println("\n" + mensagem + " finalizado!");
    }
}

