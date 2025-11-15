package Aula3;
/* Construa uma classe MontadorDeGrid que permita ao usuário preencher um grid numérico de 3x3. O programa deve usar laços
aninhados e Scanner para solicitar um número para cada célula da matriz. Após o preenchimento completo, exiba a matriz no
console, formatada como uma grade com colunas bem alinhadas. */

import java.util.Scanner;

public class MontadorDeGrid {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int L = 3, C = 3;
        int [][] matriz = new int [L] [C];

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.printf("Digite o %d numero da %d linha: ", i+1, j+1);
                matriz [i] [j]= sc.nextInt();
            } 
        }

        System.out.println("\n=== Matriz formatada ===");

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.printf("%d | \t", matriz[i][j]);
            } 
            System.out.println();
        }  
        sc.close();
    }
}
