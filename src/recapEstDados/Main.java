package recapEstDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Arrays * sao estaticos == nao alteram de tamanhp
        String[] nomeNinjaArray = new String[5];

        System.out.println("--------------- ARRAY --------------");
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";
        System.out.println("nomeNinjaArray: " + nomeNinjaArray); // vai devolver o endereco de memoria
        System.out.println("nomeNinjaArray[4]: " + nomeNinjaArray[4]);


        //Listas sao mais lentas em comparacao com ARRAY
        // Elas podem aumentar ou diminuir de tamanho
        System.out.println("---------------- LISTA ------------------");
        List<String> nomeNinjaList = new ArrayList<>(); // sao dinamicas, funcionam de acordo.
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Itachi Uchiha");
        nomeNinjaList.add("Madara Uchiha");
        System.out.println(nomeNinjaList);

        //Stack sao unicos
        // Exigem uma ordem! O ULTIMO A ENTRAR SERA O PRIMEIRO A SAIR
        System.out.println("-------------- STACK --------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki"); // equivalente ao .add em LISTAS(usamos para adicionar elementos).
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostrar stack: " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack: " + nomeNinjaStack.pop());
        System.out.println("Mostrar stack alterada: " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack: " + nomeNinjaStack.pop());
        nomeNinjaStack.push("Kakashi");
        System.out.println("Mostrar stack: " + nomeNinjaStack);
        System.out.println("Ninja no topo (sem remover): " + nomeNinjaStack.peek());






    }
}
