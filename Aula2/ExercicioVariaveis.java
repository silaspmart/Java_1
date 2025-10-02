// Criar uma nova pasta com o nome Aula2 e abrir no VSCode
// Criar a classe ExerciciosVariaveis
// Declarar as variaveis: nome, idade, peso e altura
// Devera ser impresso o resultado 

import java.util.Scanner;

public class ExercicioVariaveis {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;
        double altura, peso;
        
        System.out.print("Informe o nome do colaborador: ");
        nome = sc.nextLine();
        System.out.print("Informe a idade do colaborador: ");
        idade = sc.nextInt();
        System.out.print("Informe a altura do colaborador: ");
        altura = sc.nextDouble();
        System.out.print("Informe o peso do colaborador: ");
        peso = sc.nextDouble();

        System.out.println("O funcionario " +nome+ " tem:");
        System.out.println("Idade: %d anos: " +idade);
        System.out.println("Altura: " +altura);
        System.out.println("Idade: " +peso);

        sc.close();
    }
}
