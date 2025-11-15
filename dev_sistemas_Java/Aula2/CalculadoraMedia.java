/*  Criar uma nova classe com o nome CalculadoraMedia. Criar 4 variaveis com o nome nota1, nota2, nota3, nota4 
    e exibir a media no console */

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        System.out.println("\n******* CALCULADORA DE MEDIA DE NOTAS *******");
        System.out.print("Digite a nota da avaliação 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a nota da avaliação 2: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a nota da avaliação 3: ");
        nota3 = sc.nextDouble();
        System.out.print("Digite a nota da avaliação 4: ");
        nota4 = sc.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("\nA media e: " +media+ "\n");
        sc.close();
    }
}
