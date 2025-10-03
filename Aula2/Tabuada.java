import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero, i; 
        Scanner sc = new Scanner(System.in);

        System.out.print("\n******** TABUADA INTERATIVA ********\n\nDigite um numero para saber a sua tabuada: ");
        numero = sc.nextInt();
        System.out.printf("A tabuada do %d é:\n---------------\n", numero);
    
        for (i=1; i<=10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
        System.out.println();
        sc.close();
    }
}
