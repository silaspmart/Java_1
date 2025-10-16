package Testes.LetreiroDigital;

public class Mensagem {
    private String prefixo;
    private String destino;

    public Mensagem(String prefixo, String destino) {
        this.prefixo = prefixo;
        this.destino = destino;
    }

    public String getTexto() {
        return prefixo + "  " + destino;
    }
}
