package Aula3;
/* Desenvolva uma classe CalculadoraDeMediaVetor para calcular a média de um aluno. Utilizando Scanner, o programa deve
solicitar as 4 notas bimestrais, armazenando-as em um vetor de double. Após a inserção de todas as notas, calcule a média final
e exiba o resultado formatado com duas casas decimais. */

import java.util.Scanner;

public class CalculadoraDeMediaVetor {
    public static void main(String [] args) {
        int N = 4;
        Scanner sc = new Scanner(System.in);
        double [] notas = new double [N];
        double soma = 0;

        System.out.println("\n======== CALCULADORA DE MEDIA ========\n");

        for (int i=0; i<notas.length; i++){
            System.out.printf("Digite a nota da avaliacao %d: ", i+1);
            notas [i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma/notas.length;
        System.out.printf("\nSua media final: %.2f" , media);
        System.out.println();
        
        sc.close();
    }
}