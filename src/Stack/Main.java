package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
 // TODO - Sempre lembrar que stack funciona na vertical. Sempre o ultimo elemento adicionado vai ser o primeiro a sair, como se fosse uma pilha, quem esta no alto saira primeiro.
public class Main {
    public static void main(String[] args) {

        //Array
        //TODO - sao estaticos(nao aumentam e nem diminuem) e tem ref de memoria
        // Temos que referenciar quanto de memoria vamos usar para o array.

        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki"; // adicionando no array



        // Listas
        // TODO - Sao dinamicas, aumentam e diminuem conforme precisar
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki"); // adicionando na lista

        System.out.println("=========================================");
        System.out.println("NinjaList: " + ninjaList);
        System.out.println("=========================================");


        //Stack
        // TODO - O ultimo elemento que entrou é obrigatoriamente o primeiro que a sair.
        //TODO - Criando uma Stack

        //Stack criada
        Stack<String> ninjaStack = new Stack<>();

        // TODO - Implementando o primeiro elemento.
        System.out.println("Usando Stack ");
        System.out.println("========================================");

        ninjaStack.add("Naruto Uzumaki");
        System.out.println("STACK ATUAL: " + ninjaStack);
        System.out.println("========================================");

        // TODO - Adicionando elementos usando push
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        System.out.println("STACK ATUALIZADA: " + ninjaStack + " , aqui colocamos mais dois elementos");
        System.out.println("========================================");

        // TODO - Usando pop para tirar o ultimo elemento da pilha.
        //   LEMBRANDO veja qual foi o ultimo elemento a entrar, usando o pop ele sera o primeiro a sair.

        ninjaStack.pop();
        System.out.println("MINHA STACK ATUALIZADA COM POP: " + ninjaStack); // mostrando a stack == pilha
        System.out.println("========================================");


        // TODO - Pegando a stack e mostrando o proximo elemento do TOPO. == .peak()
        System.out.println("LISTA ATUALIZADA PROXIMO ELEMENTO DO TOPO: " + ninjaStack.peek());
        System.out.println("========================================");


        // TODO - Usando .size() para verificar o tamanho da STACK.
        System.out.println("TAMANHO DA STACK: " + ninjaStack.size() + " elementos");
        System.out.println("========================================");







    }
}
