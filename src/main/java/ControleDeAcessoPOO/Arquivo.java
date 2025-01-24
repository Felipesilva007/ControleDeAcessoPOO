package ControleDeAcessoPOO;

import java.util.ArrayList;

public class Arquivo {
    private String bancoDeDados;
    private ArrayList<String>linhas;

    public Arquivo(String bancoDeDados, ArrayList<String> linhas) {
        this.bancoDeDados = bancoDeDados;
        this.linhas = new ArrayList<>();
    }
}
