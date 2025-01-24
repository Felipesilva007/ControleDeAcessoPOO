package ControleDeAcessoPOO;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    static ArrayList<Usuario> cabecalho = new ArrayList<>();


    static File registroDeAcesso = new File("registroDeAcesso.txt");
    static File bancoDeDados = new File("src\\main\\java\\ControleDeAcessoPOO\\Dados");

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        int opcao;

        String menu = """
                -----------------------------------
                | 1-Exibir Registro.
                | 2-Criar Cadastro.
                | 3-Atualizar Cadastro.
                | 4-deletar Cadastro.
                | 5-Savar Registro.
                | 6-Carregar Dados.
                | 7-Listar Registros.
                -----------------------------------
                """;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    listarUsuarios();
                    break;
                case 2:
                    cadastrarUsuarios();
                    break;
                case 3:
                    atualizarUsuarios();
                    break;
                case 4:
                    break;
                case 5:
                    salvarDados();
                    break;
                case 6:carregarDados();
                    break;
                case 7:
                    break;
                default:
            }
        } while (opcao != 7);
    }

    static void listarUsuarios() {
        for (Usuario usuarios : listaUsuarios) {
            System.out.println(listaUsuarios.indexOf(usuarios) + 1 + "-" + usuarios);
        }
    }

    static void cadastrarUsuarios() {
        System.out.print("Digite a quantidade de usuarios que deseja cadastrar:");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();
        listaUsuarios.add();

    }

    static void atualizarUsuarios() {
        listarUsuarios();
        System.out.println("Escolha um id para atualizar o cadastro:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\nAtualize os dados a seguir:");
        System.out.print("Nome: ");
        listaUsuarios.get(idUsuario).nome = scanner.nextLine();
        System.out.print("email: ");
        listaUsuarios.get(idUsuario).email = scanner.nextLine();
        System.out.print("Telefone: ");
        listaUsuarios.get(idUsuario).telefone = scanner.nextInt();
        System.out.println("---------Atualizado com sucesso-----------");
        listarUsuarios();
    }

    static void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(bancoDeDados))) {
            for (Usuario linha : listaUsuarios) {
                writer.write(String.join((CharSequence) ",", (CharSequence) linha));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void carregarDados() {
        try (BufferedReader reader = new BufferedReader(new FileWriter(bancoDeDados)) {
            String linha;


        }
        }

        static void carregarRegistros(){
        try (BufferedReader reader = new BufferedReader(new FileReader()))
        }
}