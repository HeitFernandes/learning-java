package Generics;

public class Kunai {
    private String nome;

    public Kunai(String tipoDaKunai) {
        this.nome = tipoDaKunai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Tipo da Kunai: " + nome;
    }
}
