package Aula3;
// Criar uma classe nova com o nome 'VerificadorDiaDaSemana'. Crie uma variavel 'diaDaSemana' com um numero 
// de 1 a 7. Use a estrutura switch-case para determinar se o numero corresponde a um dia util (2 a 6) ou fim de semana (1 e 7)

import java.util.Scanner;
public class VerificadorDiaDaSemana {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaDaSemana;

        System.out.print("\nDigite um numero para saber se o dia é util: ");
        diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 2, 3, 4, 5, 6:  
            System.out.println("Dia " +diaDaSemana+ ". Dia util");  
                break;  

            case 7, 1:  
            System.out.println("Dia " +diaDaSemana+ ". Fim de semana");  
                break;
        
            default:
                System.out.print("Dia invalido!");
                break;
        }
        sc.close();
    }
}
