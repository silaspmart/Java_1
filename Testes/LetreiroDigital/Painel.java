package Testes.LetreiroDigital;

public class Painel {
    private final int linhas = 13;
    private final int colunas = 128;

    private char[][] buffer;

    public Painel() {
        buffer = new char[linhas][colunas];
        limpar();
    }

    public void limpar() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                buffer[i][j] = ' ';
            }
        }
    }

    // Método para desenhar a mensagem no buffer (implementaremos depois)
    public void desenharMensagem(String mensagem, int deslocamentoX) {
        // Aqui você monta os caracteres da mensagem no buffer,
        // começando na coluna deslocamentoX (para simular rolagem horizontal)
    }

    public void exibir() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(buffer[i][j]);
            }
            System.out.println();
        }
    }
}

