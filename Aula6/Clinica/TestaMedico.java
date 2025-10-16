package Aula6.Clinica;

public class TestaMedico {
    public static void main(String[] args) {

        System.out.println("===== LISTAGEM DE MEDICOS =====\n");
        Medico medico1 = new Medico(12345, "Ana Maria", 0 , 250);
        Medico medico2 = new Medico(67890, "Jose Antonio", 0 , 300);
        Medico medico3 = new Medico(67890, "Silvia", 0 , 280);
        Medico medico4 = new Medico(67890, "Ranolpho", 0 , 320);
        Medico medico5 = new Medico(67890, "Celeste", 0 , 260);

        medico1.pagamentoDinheiro(medico1.getVlrConsulta());
        medico2.pagamentoCartao(medico2.getVlrConsulta());
        medico3.pagamentoCartao(medico3.getVlrConsulta());
        medico4.pagamentoDinheiro(medico4.getVlrConsulta());
        medico5.pagamentoCartao(medico5.getVlrConsulta());

        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico1.getNome(), medico1.getSalario());
        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico2.getNome(), medico2.getSalario());
        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico3.getNome(), medico3.getSalario());
        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico4.getNome(), medico4.getSalario());
        System.out.println();
        System.out.printf("Nome: %s\nSalario: R$ %.2f\n", medico5.getNome(), medico5.getSalario());
        System.out.println();
        System.out.printf("Total de médicos cadastrados: %d", Medico.getTotalMedicos());
        System.out.println("\n********************************************\n ");
    }
}
