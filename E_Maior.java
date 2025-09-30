// Faça um programa com duas variaveis inteiras ivicializadas com um valor, compare e imprima na tela o maior valor.

public class E_Maior {
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 18;

        if (num1 == num2) {
            System.out.println("\nOs numeros são iguais\n");
        } else if (num1 > num2) {
            System.out.println("\nO maior numero e: " + num1+ "\n");
        } else {
            System.out.println("\nO maior numero e: " + num2+ "\n");
        }
    }
}
