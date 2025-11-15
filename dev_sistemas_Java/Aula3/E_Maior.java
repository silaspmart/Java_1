package Aula3;
// Faça um programa com duas variaveis inteiras, compare e imprima na tela o maior valor.

import java.util.Scanner;

public class E_Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("\n******* DESCUBRA O MAIOR NÚMERO *******");
        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("\nOs numeros são iguais\n");
        } else if (num1 > num2) {
            System.out.println("\nO maior numero e: " + num1+ "\n");
        } else {
            System.out.println("\nO maior numero e: " + num2+ "\n");
        }

        sc.close();
    }
}
