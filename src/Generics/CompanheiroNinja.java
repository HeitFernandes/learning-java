package Generics;

public class CompanheiroNinja {

    public CompanheiroNinja(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    private String nomeDoAnimal;

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    @Override
    public String toString() {
        return "Nome do animal: " + nomeDoAnimal;
    }
}
