package ControleDeAcessoPOO;

import java.util.Scanner;

public class Usuario {
    String nome;
    String email;
    String telefone;
    String idAcesso;
    String foto= "-";

    //Construtor da classe

    public Usuario(String nome, String email, String telefone, String idAcesso) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idAcesso = idAcesso;
    }
}



