package Aula3;
import java.util.Scanner;

public class Ternario {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int QtdDiaMes;

        System.out.print("\nInforme quantos dias tem o mes: ");
        QtdDiaMes = sc.nextInt();

        System.out.println(QtdDiaMes<30? "Mes e fevereiro" : "Mes nao e fevereiro");

        sc.close();
    } 
    // Escrever dessa forma pode substituir o "if/else"
}
