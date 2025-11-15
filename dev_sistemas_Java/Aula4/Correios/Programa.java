package Aula4.Correios;

public class Programa {
    public static void main(String[] args) {
        Endereco endDoJoao = new Endereco();
        endDoJoao.rua = "Rua das Flores";
        endDoJoao.numero = 609;
        endDoJoao.cep = "25.719-285";
        endDoJoao.cidade = "Petropolis";

        Pessoa joao = new Pessoa();
        joao.nome = "Joao Carlos";
        joao.cpf = "127.343.938-33";

        joao.endereco = endDoJoao;

        System.out.println("\nO "+joao.nome+" mora na cidade de "+joao.endereco.cidade+ "\n");
    }
}
