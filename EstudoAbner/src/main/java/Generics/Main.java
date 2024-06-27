package Generics;

public class Main {

    public static void main(String[] args) {

        ListaGenerics<Integer> obj = new ListaGenerics<>();
        obj.addList(20);
        obj.addList(30);
        System.out.println(obj.retornaLista());

        System.out.println(obj.removeList(60));
        System.out.println(obj.retornaLista());




    }
}
