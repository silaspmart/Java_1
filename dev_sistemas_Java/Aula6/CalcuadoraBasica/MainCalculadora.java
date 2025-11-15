package Aula6.CalcuadoraBasica;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2, resultado;
        int opcao;

        do {
            System.out.println("\n======== CALCULADORA ========");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                numero1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                numero2 = sc.nextDouble();

                Calculadora calculadora = new Calculadora(numero1, numero2);

                switch (opcao) {
                    case 1:
                        resultado = calculadora.soma();
                        System.out.printf("Resultado da soma: %.2f\n", resultado);
                        break;
                    case 2:
                        resultado = calculadora.subtracao();
                        System.out.printf("Resultado da subtração: %.2f\n", resultado);
                        break;
                    case 3:
                        resultado = calculadora.multiplicacao();
                        System.out.printf("Resultado da multiplicação: %.2f\n", resultado);
                        break;
                    case 4:
                        if (numero2 != 0) {
                            resultado = calculadora.divisao();
                            System.out.printf("Resultado da divisão: %.2f\n", resultado);
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;
                }
            } else if (opcao == 5) {
                System.out.println("Encerrando a calculadora...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        sc.close();
    }
}

