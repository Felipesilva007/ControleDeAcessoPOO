package ControleDeAcessoPOO;

public class Usuario {
    String nome;
    String email;
    int telefone;


    public Usuario(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s", nome, email, telefone);
    }
}
