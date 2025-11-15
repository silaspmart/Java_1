package Aula3;
// Criar uma nova classe com o nome CalculadoraAreaRetangulo. Crie 2 variaveis com o nome base e altura e exiba a area do retangulo 

import java.util.Scanner;

public class CalculadoraAreaRetangulo {
    public  static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        float base, altura;
        System.out.println ("\n========= CALCULADORA DE AREA =========");
        System.out.print ("Informe a base: ");
        base = sc.nextInt();
        System.out.print ("Informe a altura: ");
        altura = sc.nextInt();
        System.out.println ("\nA area do retangulo e: " + base*altura+"\n");
        sc.close();
    }
}
