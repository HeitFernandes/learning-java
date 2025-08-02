package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TODO - LINKED LIST - Criando uma.
        LinkedList<String> LinkedList = new LinkedList<>();
        // adicionando
        LinkedList.add("Naruto Uzumaki");
        LinkedList.add("Sasuke Uchiha");
        LinkedList.add("Sakura Haruno");
        List nomes = new ArrayList<>();
        System.out.println(LinkedList);

        LinkedList.add(1,"Kakashi Hatake");
        System.out.println(LinkedList);









    }
}
