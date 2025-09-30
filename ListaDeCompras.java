/* Crie uma classe chamada ListaDeCompras que funcione como um assistente pessoal. O programa deve solicitar ao usuário, via
Scanner, que digite 5 itens de supermercado. Armazene cada item em um vetor de String e, ao final, exiba a lista completa de
forma organizada no console. */

import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String [] args) {
        int N = 5;
        Scanner ler = new Scanner(System.in);
        String [] itens = new String [N];

        System.out.println("\n======== LISTA DE COMPRAS ========\n");

        for (int i=0; i<N;i++){
            System.out.print("Digite o item " +(i+1)+ " da lista: ");
            itens [i] = ler.nextLine();
        }
        System.out.println("\nSua lista de compras: ");
        for (int i=0; i<N; i++) {
            System.out.println("> " +itens[i]);
        }
        System.out.println("\n");
        ler.close();
    }
}