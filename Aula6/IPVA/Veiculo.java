package Aula6.IPVA;

public class Veiculo {
    String placa;
    String tipo;
    double valor;

    public Veiculo(String placa, String tipo, double valor) {
        this.placa = placa;
        this.tipo = tipo;
        this.valor = valor;
    }

    public double calculaIPVA() {
        if (tipo.equalsIgnoreCase("Flex")) {
            return valor * 0.04;
        } else if (tipo.equalsIgnoreCase("Gás")) {
            return valor * 0.015;
        } else {
            return 0;
        }
    }
}
