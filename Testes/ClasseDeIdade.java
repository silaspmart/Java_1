/* Ler a idade de várias pessoas, classificar a faixa etária de cada uma, e depois mostrar um resumo 
   em formato de tabela (matriz) */

package Testes;
import java.util.Scanner;

public class ClasseDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite quantas pessoas deseja informar a idade: ");
        int pessoas = sc.nextInt();
        System.out.println();

        int [] idades = new int[pessoas];
        String [] faixas = new String[pessoas];
        String [] nomes = new String[pessoas];
        String matriz [][] = new String[pessoas][3];

        for (int i=0; i<pessoas; i++) {
            System.out.printf("Pessoa %d:\n", i+1);
            System.out.print("Digite o nome: ");
            nomes[i] = sc.next();
            System.out.print("Digite a idade: ");
            idades[i] = sc.nextInt();
            System.out.println();

            if (idades[i] < 13) {
                faixas[i] = "Criança";
            } else if (idades[i] < 18) {
                faixas[i] = "Adolescente";
            } else if (idades[i] < 60) {
                faixas[i] = "Adulto";
            } else {
                faixas[i]="Idoso";
            }

            matriz[i][0]=nomes[i];
            matriz[i][1]=String.valueOf(idades[i]);
            matriz[i][2]=faixas[i];
        }

        System.out.println("\n******* TABELA DE FAIXA ETARIA *******");
        System.out.printf("%-10s %-10s %-15s\n", "NOME", "IDADE", "FAIXA ETARIA");
        System.out.println("------------------------------------");
        for (int i=0; i<pessoas; i++){
            System.out.printf("%-10s %-10s %15s\n", matriz[i][0], matriz[i][1], matriz[i][2]);
        }
        sc.close();
        System.out.println();
  }
}
