package Aula3;
// Criar uma nova classe com o nome VerificadorDePermissao. Crie duas variaveis, 'altura' e 'estaAcompanhado'. Verifique e exiba no console se a pessoa pode 
// entrar no brinquedo, sabendo que a regra é ter altura minima de 1,60m  ou estar acompanhada

public class VerificadorDePermissao {
    public static void main (String[] args) {
        float altura = 1.67f;
        boolean estaAcompanhado = false;

        if (altura >= 1.6 || estaAcompanhado == true) {
            System.out.println("\nVoce esta autorizado a entrar!\n");
        } else {
            System.out.println("\nVoce nao esta autorizado a entrar!\n");
        }
    }
}
