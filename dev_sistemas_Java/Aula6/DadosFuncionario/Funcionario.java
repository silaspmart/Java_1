package Aula6.DadosFuncionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularInss () {
        return salario * 0.11;
    }

    public double calcularVT () {
        return salario * 0.06;
    }
}
