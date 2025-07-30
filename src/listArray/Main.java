package listArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arrayNinja = new String[4]; // arrays sao estaticos, nunca alteram de tamnho.

        arrayNinja[0] = "Naruto Uzumaki";
        arrayNinja[1] = "Sasuke Uchiha";
        arrayNinja[2] = "Sakura Haruno";

        System.out.println("Printando array: " + arrayNinja[0]);

        System.out.println("===================== List =====================");
        //TODO - Listas nao sao estaticas, elas podem aumentar ou diminuir quando necessario.
        // TODO - como inicializar uma List, logo abaixo. dentro dos <coloca-se o tipo> logo depois o nome da List.

        //TODO - Criando a lista.
        List<String> ninjaList = new ArrayList<>();

        // TODO - Adicionando elementos dentro da lista. Repare que a lista nao tem tamanho fixo.
        // TODO - Para adicionar elementos na lista usamos == "nomeDaLista.add". Como previsto no exemplo abaixo.

        ninjaList.add("Naruto Uzumaki"); //index 0 // poderia ser uma variavel para usar de parametro
        ninjaList.add("Sasuke Uchiha"); // index 1
        ninjaList.add("Sakura Haruno"); // index 2
        ninjaList.add("Tobirama Senju"); // index 3
        ninjaList.add("Kakashi Hatake"); // index 4

        // TODO - Usando o metodo toString para mostrar os elementos dentro da List.
        System.out.println("ninjaList = " + ninjaList);

        // TODO - Removendo elementos da lista. Usamos "nomeDaLista.remove".
        ninjaList.remove("Kakashi Hatake");
        System.out.println("=======================================================");
        System.out.println("ninjaList com Kakashi removido: " + ninjaList);
        System.out.println("=======================================================");



        // TODO - Trocar elementos. Usamos "NomeDaLista.set", o metodo set requer DOIS parametros.
        // TODO - O Primeiro sera o INDEX(indice) para identificar qual elemento sera trocado.
        // TODO - O Segundo sera a String(poderia ser qualquer outra variavel) pela qual queremos substituir.
        // Exemplo abaixo >>

        // Trocando o Tobirama
        ninjaList.set(3, "Hashirama Senji");
        System.out.println("ninjaList com Tobirama Trocado pelo Hashirama: " + ninjaList);
        System.out.println("=======================================================");


        // TODO - Ver tamanho da List. Usamos "nomeDaLista.size();".
        System.out.println("Tamanho da Lista: " + ninjaList.size() + " elementos...");





    }
}
