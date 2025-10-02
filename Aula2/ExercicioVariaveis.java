/* Criar uma nova pasta com o nome Aula2 e abrir no VSCode. Criar a classe ExerciciosVariaveis
Declarar as variaveis: nome, idade, peso e altura. Devera ser impresso o resultado */  

import java.util.Scanner;

public class ExercicioVariaveis {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;
        double altura, peso;
        System.out.println("\n========== CADASTRO DE PESSOAS ==========\n");
        System.out.print("Informe o nome: ");
        nome = sc.nextLine();
        System.out.print("Informe a idade: ");
        idade = sc.nextInt();
        System.out.print("Informe a altura: ");
        altura = sc.nextDouble();
        System.out.print("Informe o peso: ");
        peso = sc.nextDouble();

        System.out.println("\n-----------------\n" +nome+ " tem:");
        System.out.printf("Idade: %d anos \n", idade);
        System.out.printf("Altura: %.2f \n", altura);
        System.out.printf("Peso: %.2f kg\n-----------------", peso);
        System.out.println();
        
        sc.close();
    }
}
