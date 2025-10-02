import java.util.Scanner;

public class Soma {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a, b, soma;

        System.out.print("\n******** CALCULADORA DE SOMA ********\n\n");
        System.out.print("Digite um numero: ");
        a = sc.nextInt();
        System.out.print("Digite outro numero: ");
        b = sc.nextInt();
        soma = a+b;

        System.out.println("A soma de " + a + " + " + b + " = " + soma);
        sc.close();
    }
}
