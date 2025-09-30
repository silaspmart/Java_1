/* Construa uma classe MontadorDeGrid que permita ao usuário preencher um grid numérico de 3x3. O programa deve usar laços
aninhados e Scanner para solicitar um número para cada célula da matriz. Após o preenchimento completo, exiba a matriz no
console, formatada como uma grade com colunas bem alinhadas. */

import java.util.Scanner;

public class MontadorDeGrid {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);
        int L = 3, C = 3;
        int [][] matriz = new int [L] [C];

        for (int i=0; i<L; i++) {
            for (int j=0; j<C; j++) {
                System.out.print("Digite o " +(j+1)+ " numero da " + (i+1)+ " linha: ");
                matriz [i] [j]= ler.nextInt();
            } 
        }

        System.out.println("\n=== Matriz formatada ===\n");
        
        for (int i=0; i<L; i++) {
            for (int j=0; j<C; j++) {
                System.out.print(+matriz[i][j]+ " | ");
            } 
            System.out.println();
        }  
    }
}
