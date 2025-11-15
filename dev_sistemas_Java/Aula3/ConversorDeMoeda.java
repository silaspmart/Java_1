package Aula3;
// Crie uma nova classe com o nome ConversorDeMoeda. Crie uma variavel valorEmDolar e uma taxaDeCambio. 
// Calcule e exiba o valor convertido para reais (R$)

import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double valor, taxaDeCambio = 5.28;

        System.out.print("\n*********** CONVERSOR DE CAMBIO ***********\n");
        System.out.print("Digite o valor em dolares (US$): ");
        valor = sc.nextDouble();

        System.out.printf("\nO valor em dolares e: US$ %.2f", valor);
        System.out.printf("\nO valor em reais e: R$ %.2f", valor/taxaDeCambio);

        sc.close();
    }   
}
