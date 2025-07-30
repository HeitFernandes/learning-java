package Generics;

import java.util.ArrayList;
import java.util.List;

// TODO - Porque transformamos a classe em generica? == Para receber qualquer tipo de equipamento, como kunais, pergaminhos entre outros.
// TODO - Transformando a classe em Generica. Usamos <> jacarezinho, logo após o nome da classe.
// TODO - dentro do <jararezinho> colocamos o tipo, lembrando de boas praticas. Colocar <T> para identificar o tipo generico.

// classe generica criada.

public class BolsaNinja<T>{

   // TODO - Inicializando nosso array. Poderiamos colocar algumas da classes presentes no <Tipo>, como: Kunai ou Pergaminho.
    // TODO - Porem para querermos levar todos equipamentos dentro do array(superPoderoso) usamos o <T>.

    // array criado.
    private List<T> ferramentas;

    // TODO - Construtor vazio
    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }
    // TODO - Construtor com parametros. iria dar erro.
    public BolsaNinja(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }


    // TODO - 1 -Colocando ferramentas no nosso array(arraySuperpoderoso).
    // TODO - 2 - METODO VAI RECEBER QUALQUER TIPO GENERICO, O QUE NOS QUEREMOS AQUI É ADICIONAR UM EQUIPAMENTO AO NOSSO ARRAY.
    // TODO - 3 -Este metodo vai poder receber uma ferramenta(equipamento), como: Kunai, Pergaminho e etc.
    // TODO - 4 - O parametro dado (T ferramenta) vai fazer nossa List receber uma nova ferramenta, leia 3.

    //metodo criado pra inserir ferramentas(equipamentos).
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //TODO - Mostrando ferramentas
    // TODO - O for each esta comecando do comeco até final lendo os metodos toString de cada objeto.
    public void mostrarFerramentas(){
        for(T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }









}
