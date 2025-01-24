package ControleDeAcessoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //Objetos cadastro Usuario

        int opcao;

        do {
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                   |
                    |       1 - Exibir cadastro completo                     |
                    |       2 - Inserir novo cadastro                        |
                    |       3 - Atualizar cadastro por id                    |
                    |       4 - Deletar um cadastro por id                   |
                    |       5 - Associar TAG ou cartão de acesso ao usuário  |
                    |       6 - Ver registros de acesso de um usuário        |
                    |       7 - Deletar registro de acesso                   |
                    |       8 - Sair                                         |
                    _________________________________________________________
                    """;
            System.out.println(menu);
            System.out.println("Selecione uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirListaDeUsuarios();
                    break;

                case 2:
                    cadastrarUsuario();
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 8);

    }
    public static void cadastrarUsuario(){
        System.out.println("Digite o nome da pessoa cadastrada:");
        String nome = scanner.nextLine();

        System.out.println("Digite o e-mail da pessoa cadastrada:");
        String email = scanner.nextLine();

        System.out.println("Digite o telefone da pessoa cadastrada");
        String telefone = scanner.nextLine();

        Usuario usuario = new Usuario(nome,email,telefone);

        listaDeUsuarios.add(usuario);

    }

    public static void exibirListaDeUsuarios(){
        StringBuilder tabelaCadastro = new StringBuilder();

        for (Usuario usuario : listaDeUsuarios) {
            tabelaCadastro.append(String.format("%-15s | %-20s | %-10s", usuario.nome, usuario.email, usuario.telefone));
            tabelaCadastro.append("\n");
        }
        System.out.println(tabelaCadastro);
    }

}
