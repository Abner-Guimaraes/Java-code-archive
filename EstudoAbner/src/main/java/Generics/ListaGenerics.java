package Generics;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerics <A> {

    private final List<A> listAbner;


    public ListaGenerics(){
        this.listAbner = new ArrayList<>();
    }

    public void addList(A info){
        listAbner.add(info);
    }
    public boolean removeList(A info){
        return listAbner.remove(info);
    }

    public boolean buscaList(A info){
        return listAbner.contains(info);
    }

    public List<A> retornaLista(){
        return listAbner;
    }







}
