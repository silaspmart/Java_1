package Aula4.Autoria;

public class DadosDoLivro {
    public static void main(String[] args) {
        Autor livro = new Autor("Machado de Assis","Brasileiro");
        Livro publicacao = new Livro("Dom Casmurro",1899, livro);

        System.out.println("\nO livro '" +publicacao.titulo+ "' foi escrito por " +livro.nome+ " em " +publicacao.ano+ "\n");
    }
}
