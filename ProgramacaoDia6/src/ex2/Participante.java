package ex2;

import java.util.Objects;

public class Participante {
    private String id;
    private String nome;

    public Participante(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof  Participante)) return false;
        return this.id.equals(((Participante) obj).getId());
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\nnome: " + this.nome;
    }
}
