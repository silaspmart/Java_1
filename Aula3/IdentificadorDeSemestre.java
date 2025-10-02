package Aula3;
/*  Crie uma nova classe com o nome "IdentificadorDeSemestre". Crie uma variavel 'numeroDoMes' e utilize o 
    operador ternario para verificar se o mes pertence ao primeiro ou ao segundo semestre */

import java.util.Scanner;

public class IdentificadorDeSemestre {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDoMes;
        String mes="";
        System.out.print("\n******** IDENTIFICADOR DE MESES ********\nDigite o numero correspondente ao mes: ");
        numeroDoMes = sc.nextInt();

        switch (numeroDoMes) {
            case 1:  
            mes = "Janeiro";  
                break;
            case 2:  
            mes = "Fevereiro";  
                break;
            case 3:  
            mes = "Marco";  
                break;
            case 4:  
            mes = "Abril";  
                break;
            case 5:  
            mes = "Maio";  
                break;
            case 6:  
            mes = "Junho";  
                break;
            case 7:  
            mes = "Julho";  
                break;
            case 8:  
            mes = "Agosto";  
                break;
            case 9:  
            mes = "Setembro";  
                break;
            case 10:  
            mes = "Outubro";  
                break;
            case 11:  
            mes = "Novembro";  
                break;
            case 12:  
            mes = "Dezembro";  
                break;
            default:
                System.out.print("Numero invalido!");
                break;
        }
        System.out.printf(numeroDoMes <=6 ? "\nMes %d = %s. Pertence ao primeiro semestre\n" : "\nMes %d = %s. Pertence ao segundo semestre\n",numeroDoMes,mes);
        sc.close();
        System.out.println();
    }
}
