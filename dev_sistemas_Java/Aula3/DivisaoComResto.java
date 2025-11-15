package Aula3;
// Criar uma nova classe com o nome DivisaoComResto. Crie duas variaveis inteiras, totalDeItens e capacidadeDaCaixa. Calcule quantas caixas serão 
// preenchidas completamente e quantos itens sobrarão

import java.util.Scanner;

public class DivisaoComResto {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int totalDeItens, capacidadeDaCaixa;

        System.out.print("\n-------- CALCULO DE CAPACIDADE --------\nInforme o total de itens: ");
        totalDeItens = sc.nextInt();
        System.out.print("Informe a capacidade das caixas: ");
        capacidadeDaCaixa = sc.nextInt();

        System.out.println("\nSerao preenchidas " +totalDeItens/capacidadeDaCaixa+ " caixas\nSobrarao " +totalDeItens%capacidadeDaCaixa+ " itens\n");

        sc.close();
    }
}
