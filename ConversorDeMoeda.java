// Crie uma nova classe com o nome ConversorDeMoeda. Crie uma variavel valorEmDolar e uma taxaDeCambio. Calcule e exiba o valor convertido para reais (R$)

import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double valor, taxaDeCambio = 5.28;

        System.out.print("*********** CONVERSOR DE CAMBIO ***********\nDigite o valor em reais (R$): ");
        valor = sc.nextDouble();

        System.out.printf("\nO valor em reais (R$) e: %.2f", valor);
        System.out.printf("\nO valor em dolares (US$) e: %.2f", valor/taxaDeCambio);

        sc.close();
    }   
}
