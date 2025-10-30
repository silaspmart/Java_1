package Pomofocus;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Usuario> usuarios = new ArrayList<>(); // guarda a lista dos usuários cadastrados
    private Usuario usuarioLogado = null;
    private Scanner entrada = new Scanner(System.in);

    // Método para cadastrar um novo usuário
    private void cadastrarUsuario() {
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = entrada.nextLine();

        usuarios.add(new Usuario(nome, senha));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    // Método para realizar login
    private boolean login() {
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Senha: ");
        String senha = entrada.nextLine();

        for (Usuario u : usuarios) {
            if (u.getNome().equals(nome) && u.getSenha().equals(senha)) {
                usuarioLogado = u;
                System.out.printf("%s, Login bem-sucedido!", u.getNome());
                return true;
            }
        }

        System.out.println("Usuário ou senha incorretos.");
        return false;
    }

    // Menu específico para as funcionalidades do Pomodoro
    private void menuPomodoro() {
        Pomodoro pomodoro = new Pomodoro(usuarioLogado);
        int opcao;

        do {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║        MENU POMOFOCUS        ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║ 1 - Adicionar blocos de foco ║");
            System.out.println("║ 2 - Verificar blocos         ║");
            System.out.println("║ 3 - Modificar tempos         ║");
            System.out.println("║ 4 - Iniciar ciclos           ║");
            System.out.println("║ 5 - Logout                   ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Quantos blocos deseja adicionar? ");
                    int qtd = entrada.nextInt();
                    usuarioLogado.adicionarBlocos(qtd);
                }
                case 2 -> System.out.println("Blocos restantes: " + usuarioLogado.getBlocoDeFocos());
                case 3 -> {
                    System.out.print("Tempo de foco: ");
                    int foco = entrada.nextInt();
                    System.out.print("Descanso curto: ");
                    int curto = entrada.nextInt();
                    System.out.print("Descanso longo: ");
                    int longo = entrada.nextInt();
                    pomodoro.configurarTempos(foco, curto, longo);
                }
                case 4 -> pomodoro.iniciarCiclos();
                case 5 -> System.out.println("Saindo do Pomofocus...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    // laço do-while que mantém o programa rodando até o usuário decidir sair
    public void menuPrincipal() {
        int opcao;
        do {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║          BEM-VINDO AO POMOFOCUS        ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1 > Cadastrar usuário                  ║");
            System.out.println("║ 2 > Fazer login                        ║");
            System.out.println("║ 3 > Sair                               ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> {
                    if (login()) {
                        menuPomodoro();
                    }
                }
                case 3 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    } 
}

