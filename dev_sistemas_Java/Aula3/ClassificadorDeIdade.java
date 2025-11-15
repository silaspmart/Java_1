package Aula3;
// Criar uma nova classe cm o nome ClassificadorDeIdade. Crie uma variavel idade e use uma estrutura if-else para classificar e exibir
// no console se a pessoa é 'criança', 'adolescente', 'adulto' ou 'idoso'

import java.util.Scanner;

public class ClassificadorDeIdade {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("\n========= CALACULADORA DE FAIXA ETARIA =========\nInforme a sua idade: ");
        idade = sc.nextInt();

        if (idade < 12) {
            System.out.println("\nSua idade e " +idade+ ", portanto voce e crianca!\n");
        } else if (idade < 18) {
            System.out.println("\nSua idade e " +idade+ ", portanto voce e adolescente!\n");
        } else if (idade < 60) {
            System.out.println("\nSua idade e " +idade+ ", portanto voce e adulto!\n");
        } else {
            System.out.println("\nSua idade e " +idade+ ", portanto voce e idoso!\n");
        }
        sc.close();
    }
}
