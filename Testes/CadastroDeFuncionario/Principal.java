package Testes.CadastroDeFuncionario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[3]; 
        String nome, cargo;
        double salario;

        System.out.println("\n== CADASTRO DE FUNCIONARIOS ==\n");

        for (int i=0; i<funcionarios.length; i++) {
            System.out.printf("Digite o nome do %dº colaborador: ", i+1);
            nome = sc.nextLine();
            System.out.printf("Digite o cargo do %dº colaborador: ", i+1);
            cargo = sc.nextLine();
            System.out.printf("Digite o salario do %dº colaborador: ", i+1);
            salario = sc.nextDouble();
            sc.nextLine();

            funcionarios [i] = new Funcionario(nome, cargo, salario);
            System.out.println();
        } 
        System.out.println("**** LISTA DE FUNCIONARIOS ****");
        for (int i=0; i<funcionarios.length; i++) {
            funcionarios[i].aumentarSalario();
            funcionarios[i].exibirDados();
        }
        sc.close();
    }
}