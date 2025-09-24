// Crie uma nova classe com o nome "IdentificadorDeSemestre". Crie uma variavel 'numeroDoMes' e utilize o operador ternario para verificar se o mes
// pertence ao primeiro ou ao segundo semestre

public class IdentificadorDeSemestre {
    public static void main (String [] args) {
        int numeroDoMes = 5;

        System.out.println(numeroDoMes <=6 ? "\nMes " +numeroDoMes+ " pertence ao primeiro semestre\n" : "\nMes " +numeroDoMes+ " pertence ao segundo semestre\n");
    }
}
