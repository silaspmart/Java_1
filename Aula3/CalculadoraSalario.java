package Aula3;
// Crie uma classe com o nome CalculadoraSalario e defina uma variavel com o nome 'salario'. Exiba no console o valor com desconto do INSS

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double salario, comDesconto;
        System.out.print("\n======== CALCULO DE DESCONTO ======== \nInforme o valor de seu salário em R$: ");
        salario = sc.nextDouble();

        if (salario <= 1751.81) {
            comDesconto = salario*0.92;
        } else if (salario <= 2919.72) {
            comDesconto = salario*0.91;
        } else if (salario <= 5839.45) {
            comDesconto = salario*0.9;
        } else {
            comDesconto = salario*0.89;
        }
        System.out.printf("\nO seu salario e de: R$ %.2f\nCom desconto fica: R$ %.2f", salario, comDesconto);
        System.out.println("\n--------------------------------\n");
        sc.close();
    }
}
