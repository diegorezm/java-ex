package api.consomeapi.tipos;

import com.google.gson.Gson;

public class Usuarios {
    private int id;
    private String nome, pais;

    public Usuarios() {
    }

    public Usuarios(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }
    
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
