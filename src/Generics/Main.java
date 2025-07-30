package Generics;

public class Main {
    public static void main(String[] args) {
        // TODO - O "Objetct" usado é uma superclasse.
        // TODO - Inicializando nosso objeto com <Object> para trabalhar com diferentes tipos de objetos.

        //Objeto generico criado.
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        //TODO - usando o metodo para adicionar ferramenta, dando "new" == nome do objeto(fornecer os parametros dados pelos construtores)
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(18));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocacao do Sapo"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Mamaru"));

        System.out.println("Itens da nossa bolsa ninja: ");
        bolsaNinja.mostrarFerramentas();
    }
}
