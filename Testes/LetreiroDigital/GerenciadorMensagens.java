package Testes.LetreiroDigital;

import java.util.List;

public class GerenciadorMensagens {
    private List<Mensagem> mensagens;
    private Painel painel;

    private int modo; // 1=scroll, 2=troca, 3=parado

    public GerenciadorMensagens(List<Mensagem> mensagens, Painel painel, int modo) {
        this.mensagens = mensagens;
        this.painel = painel;
        this.modo = modo;
    }

    public void iniciar() throws InterruptedException {
        if (modo == 3 && mensagens.size() > 1) {
            System.out.println("Modo parado só funciona com uma mensagem. Usando modo troca.");
            modo = 2;
        }

        switch (modo) {
            case 1:
                rolarMensagens();
                break;
            case 2:
                trocarMensagens();
                break;
            case 3:
                mostrarParado();
                break;
            default:
                System.out.println("Modo inválido");
        }
    }

    private void rolarMensagens() throws InterruptedException {
        while (true) {
            for (Mensagem m : mensagens) {
                String texto = m.getTexto() + "     "; // espaçamento no fim
                for (int desloc = 0; desloc <= texto.length() * 8; desloc++) { 
                    painel.limpar();
                    painel.desenharMensagem(texto, -desloc);
                    painel.exibir();
                    Thread.sleep(200);
                    System.out.print("\033[H\033[2J"); // limpa terminal (funciona na maioria dos terminais)
                    System.out.flush();
                }
            }
        }
    }

    private void trocarMensagens() throws InterruptedException {
        while (true) {
            for (Mensagem m : mensagens) {
                painel.limpar();
                painel.desenharMensagem(m.getTexto(), 0);
                painel.exibir();
                Thread.sleep(5000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
    }

    private void mostrarParado() {
        painel.limpar();
        painel.desenharMensagem(mensagens.get(0).getTexto(), 0);
        painel.exibir();
    }
}

