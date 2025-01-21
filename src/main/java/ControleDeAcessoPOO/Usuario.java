package ControleDeAcessoPOO;

public class Usuario {
    String nome;
    String email;
    int telefone;
    int id;
    int IdAcesso;

    public Usuario(String nome, String email, int telefone, int id, int IdAcesso) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.id =id;
        this.IdAcesso=IdAcesso;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s | %s | %s", id,IdAcesso,nome,telefone,email);
    }
}
