package Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 999999);
        System.out.println("cadastro: " + cadastro.getNome());

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 111111);
        System.out.println("cadastroUsandoRecord = " + cadastroUsandoRecord.nome());




    }
}
