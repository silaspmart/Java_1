package Aula6.Clinica;

public class Medico {
    private int crm;
    private String nome;
    private double salario = 0;
    private double vlrConsulta = 0;
    private static int totalMedicos;

    public Medico(int crm, String nome, double salario, double vlrConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.vlrConsulta = vlrConsulta;
        totalMedicos+=1;
    }

    public void pagamentoDinheiro (double vlrConsulta) {
        salario += vlrConsulta;
    }

    public void pagamentoCartao (double vlrConsulta) {
        salario += vlrConsulta * 0.7;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getVlrConsulta() {
        return vlrConsulta;
    }

    public static int getTotalMedicos() {
        return totalMedicos;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setVlrConsulta(double vlrConsulta) {
        this.vlrConsulta = vlrConsulta;
    }

    public static void setTotalMedicos(int totalMedicos) {
        Medico.totalMedicos = totalMedicos;
    }    
}
