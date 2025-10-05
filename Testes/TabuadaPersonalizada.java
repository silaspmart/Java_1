/* Objetivo: Ler um número e mostrar sua tabuada de 1 a 10. */

package Testes;
import java.util.Scanner;
public class TabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite um numero: ");
        int numero = sc.nextInt();

        System.out.printf("\n===== TABUADA DO %d =====\n", numero);

        for (int i=1; i<=10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
        System.out.println("=================");
        sc.close();
    }
}
