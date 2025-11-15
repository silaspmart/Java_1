// Crie um Exemplo2.java (uma classe) no VSCode. Imprima seu nome em uma linha e sobrenome em outra linha usando o comando "System.out.print()". 
// Sabendo que os caracteres \n representa quebra de linhas

public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("Silas\nPereira\nMartins");
        System.out.println("Silas\t\tPereira\t\tMartins");
        System.out.println("Silas\bPereira\bMartins");
        System.out.println("Silas\\Pereira\\Martins");
        System.out.println("Silas\'Pereira\'Martins");
        System.out.println("Silas\"Pereira\"Martins");
    }
}

// Utilize os caracteres (\t,\b,\\,\',\") no Exemplo2 no lugar de \n para ver o resultado