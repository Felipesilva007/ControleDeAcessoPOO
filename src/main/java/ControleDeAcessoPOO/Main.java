package ControleDeAcessoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Usuario> listaUsuarios=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int opcao;

        String menu= """
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
            opcao=scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:

                    break;
                case 2:
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
                default:
            }
        }while (opcao !=7);
    }
    static void listaUsuarios(){
        for (Usuario usuarios : listaUsuarios){
            System.out.println(listaUsuarios.indexOf(usuarios)+1+ "-" +usuarios);
        }
    }

}