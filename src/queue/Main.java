package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //Queue == FILAS
        // Para inicializarmos uma queue == usamos new LinkedList<>();
        // First In, First Out. Lembrando. PRIMEIRO QUE ENTROU NA FILA, SERA O PRIMEIRO A SAIR.
        Queue<String> ninjasQueue = new LinkedList<>();

        //Listar coisas
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");


        // mostrar na fila
        System.out.println("Ninjas Queue: " + ninjasQueue);

        //Tirar um ninja da fila
        ninjasQueue.poll(); // vai tirar a HEAD que seria o Naruto, agora torna-se o sasuke.
        System.out.println("Ninjas Queue depois do poll: " + ninjasQueue); // poll ataca diretamente a HEAD

        // Como ver quem é o primeiro
        System.out.println("Ninja no HEAD: " + ninjasQueue.peek());
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Add a fila: " + ninjasQueue); // Tobirama tornou-se o tail.
        // TODO - Nao conseguimos deletar o tail.

        //Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        // Verificar se esta vazia a fila
        if(ninjasQueue.isEmpty()){
            System.out.println("Lista vazia");
        }







    }
}
