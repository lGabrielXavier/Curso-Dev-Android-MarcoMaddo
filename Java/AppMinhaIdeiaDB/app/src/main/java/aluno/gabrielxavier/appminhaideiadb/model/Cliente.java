package aluno.gabrielxavier.appminhaideiadb.model;

import android.util.Log;

import aluno.gabrielxavier.appminhaideiadb.api.AppUtil;
import aluno.gabrielxavier.appminhaideiadb.controller.ICrud;

public class Cliente {


    private int id; // << chave primaria.
    private String nome;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
