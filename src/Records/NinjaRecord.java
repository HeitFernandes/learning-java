package Records;

// TODO - classe record ja devolve construtor e getters/setters.
// TODO - Todos atributos sao final por padrao
// TODO -  Records nao tem SETTER
// TODO - Acessando os atributos deparamos que a classe record nao tem getNome é apenas Nome sem o "get" de inicio.
// TODO - Quando usamos Records e tambem Enums?? Quando sabemos que algo sera constante, o valor nunca sera alterado.
public record NinjaRecord(String nome, String email, int telefone) {

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }

}
