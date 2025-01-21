package ControleDeAcessoPOO;

public class Usuario {
    String nome;
    String email;
    int telefone;
    int Id;
    int IdAcesso;

    public Usuario(String nome, String email, int telefone, int ID, int IdAcesso) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.Id =ID;
        this.IdAcesso=IdAcesso;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s | %s | %s", Id,IdAcesso,nome,telefone,email);
    }
}
