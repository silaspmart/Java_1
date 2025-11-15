package Pomofocus;

// Representa um usuário do sistema

public class Usuario {
    private String nome;
    private String senha;
    private int blocoDeFocos;
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.blocoDeFocos = 0; // blocos só são adicionados depois, quando o usuário entra no menu Pomodoro e escolhe “Adicionar blocos de foco”
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getBlocoDeFocos() {
        return blocoDeFocos;
    }

    public void setBlocoDeFocos(int blocoDeFocos) {
        this.blocoDeFocos = blocoDeFocos;
    }

    // Métodos
    public void adicionarBlocos(int qtd) {
        if (qtd > 0) {
            blocoDeFocos += qtd;
            System.out.println(">> BLOCO DE FOCOS ADICIONADOS: " +qtd);
        } else {
            System.out.println("QUANTIDADE INVÁLIDA!");
        }
    }

    public void reduzirBloco () {
        if (blocoDeFocos > 0) {
            blocoDeFocos--;
    }
  }
}
