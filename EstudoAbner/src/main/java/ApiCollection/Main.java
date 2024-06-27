package ApiCollection;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Abner", 20);
        mapa.put("Marcelo", 23);

        for (String i : mapa.keySet()) {
            System.out.println("Nome: " + i + " Idade: " + mapa.get(i));

        }













    }

}
