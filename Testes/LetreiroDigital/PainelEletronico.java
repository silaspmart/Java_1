package Testes.LetreiroDigital;

import java.util.HashMap;
import java.util.Map;

public class PainelEletronico {

    public static void main(String[] args) throws InterruptedException {
        String texto = " 704 VIA CENTRO ";  // Mensagem para exibir

        Alfabeto alfabeto = new Alfabeto();
        MensagemBuilder builder = new MensagemBuilder(alfabeto);

        // Monta a matriz da mensagem (13 linhas x largura variável)
        char[][] matrizMensagem = builder.construirMensagem(texto);

        Painel painel = new Painel(13, 128);

        int larguraMensagem = matrizMensagem[0].length;
        int pos = 0;

        while (true) {
            // Copia uma "janela" de 128 colunas da matrizMensagem para o painel
            painel.limpar();

            for (int linha = 0; linha < painel.linhas; linha++) {
                for (int col = 0; col < painel.colunas; col++) {
                    int indiceMensagem = (pos + col) % larguraMensagem;
                    painel.setLed(linha, col, matrizMensagem[linha][indiceMensagem]);
                }
            }

            painel.exibir();

            pos = (pos + 1) % larguraMensagem;

            Thread.sleep(150);  // Controla a velocidade do scroll
        }
    }
}

// Classe que representa o painel de LEDs (matriz 13x128)
class Painel {
    int linhas;
    int colunas;
    char[][] matriz;

    public Painel(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new char[linhas][colunas];
        limpar();
    }

    public void limpar() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = ' ';  // LED apagado = espaço em branco
            }
        }
    }

    public void setLed(int linha, int coluna, char valor) {
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            matriz[linha][coluna] = valor;
        }
    }

    public void exibir() {
        System.out.print("\033[H\033[2J");  // ANSI escape para limpar tela (funciona na maioria dos terminais)
        System.out.flush();

        for (int i = 0; i < linhas; i++) {
            System.out.println(new String(matriz[i]));
        }
    }
}

// Classe que monta a mensagem a partir do texto usando o alfabeto
class MensagemBuilder {
    private Alfabeto alfabeto;
    private static final int ESPACO_ENTRE_LETRAS = 1;

    public MensagemBuilder(Alfabeto alfabeto) {
        this.alfabeto = alfabeto;
    }

    public char[][] construirMensagem(String texto) {
        texto = texto.toUpperCase();
        // Calcula largura total da mensagem
        int larguraTotal = 0;
        for (char c : texto.toCharArray()) {
            larguraTotal += alfabeto.getLargura(c) + ESPACO_ENTRE_LETRAS;
        }

        int linhas = alfabeto.getAltura();
        char[][] matrizMensagem = new char[linhas][larguraTotal];

        // Inicializa com espaços
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < larguraTotal; j++) {
                matrizMensagem[i][j] = ' ';
            }
        }

        int colunaAtual = 0;

        for (char c : texto.toCharArray()) {
            char[][] letra = alfabeto.getMatriz(c);
            int larguraLetra = alfabeto.getLargura(c);

            for (int linha = 0; linha < linhas; linha++) {
                for (int col = 0; col < larguraLetra; col++) {
                    matrizMensagem[linha][colunaAtual + col] = letra[linha][col];
                }
            }
            colunaAtual += larguraLetra + ESPACO_ENTRE_LETRAS;
        }

        return matrizMensagem;
    }
}

// Classe que representa o alfabeto em matriz de LEDs
class Alfabeto {
    private Map<Character, char[][]> letras = new HashMap<>();
    private final int altura = 13;

    public Alfabeto() {
        // Exemplo: define as matrizes de alguns caracteres (13 linhas x largura variável)

        letras.put(' ', criarEspaco(5));

        letras.put('0', new char[][] {
            " *** ".toCharArray(),
            "*   *".toCharArray(),
            "*  **".toCharArray(),
            "* * *".toCharArray(),
            "**  *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            " *** ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('1', new char[][] {
            "  *  ".toCharArray(),
            " **  ".toCharArray(),
            "* *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "*****".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('4', new char[][] {
            "*  * ".toCharArray(),
            "*  * ".toCharArray(),
            "*  * ".toCharArray(),
            "*****".toCharArray(),
            "   * ".toCharArray(),
            "   * ".toCharArray(),
            "   * ".toCharArray(),
            "   * ".toCharArray(),
            "   * ".toCharArray(),
            "   * ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('7', new char[][] {
            "*****".toCharArray(),
            "    *".toCharArray(),
            "   * ".toCharArray(),
            "  *  ".toCharArray(),
            " *   ".toCharArray(),
            " *   ".toCharArray(),
            " *   ".toCharArray(),
            " *   ".toCharArray(),
            " *   ".toCharArray(),
            " *   ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('A', new char[][] {
            "  *  ".toCharArray(),
            " * * ".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*****".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('B', new char[][] {
            "**** ".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "**** ".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "**** ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('C', new char[][] {
            " *** ".toCharArray(),
            "*   *".toCharArray(),
            "*    ".toCharArray(),
            "*    ".toCharArray(),
            "*    ".toCharArray(),
            "*    ".toCharArray(),
            "*   *".toCharArray(),
            " *** ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('E', new char[][] {
            "*****".toCharArray(),
            "*    ".toCharArray(),
            "*    ".toCharArray(),
            "**** ".toCharArray(),
            "*    ".toCharArray(),
            "*    ".toCharArray(),
            "*    ".toCharArray(),
            "*****".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('I', new char[][] {
            "*****".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "*****".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('N', new char[][] {
            "*   *".toCharArray(),
            "**  *".toCharArray(),
            "* * *".toCharArray(),
            "*  **".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('O', new char[][] {
            " *** ".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            " *** ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('R', new char[][] {
            "**** ".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "**** ".toCharArray(),
            "* *  ".toCharArray(),
            "*  * ".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('S', new char[][] {
            " ****".toCharArray(),
            "*    ".toCharArray(),
            "*    ".toCharArray(),
            " *** ".toCharArray(),
            "    *".toCharArray(),
            "    *".toCharArray(),
            "    *".toCharArray(),
            "**** ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('T', new char[][] {
            "*****".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "  *  ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('V', new char[][] {
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            "*   *".toCharArray(),
            " * * ".toCharArray(),
            "  *  ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
            "     ".toCharArray(),
        });

        letras.put('I', letras.get('I')); // Já definido acima
    }

    public char[][] getMatriz(char c) {
        if (!letras.containsKey(c)) {
            return criarEspaco(5);  // Retorna espaço em branco para caracteres desconhecidos
        }
        return letras.get(c);
    }

    public int getLargura(char c) {
        if (!letras.containsKey(c)) return 5;
        return letras.get(c)[0].length;
    }

    public int getAltura() {
        return altura;
    }

    private char[][] criarEspaco(int largura) {
        char[][] espaco = new char[altura][largura];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                espaco[i][j] = ' ';
            }
        }
        return espaco;
    }
}

