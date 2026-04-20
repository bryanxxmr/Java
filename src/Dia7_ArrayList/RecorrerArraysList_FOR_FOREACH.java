package Dia7_ArrayList;

import java.util.ArrayList;

public class RecorrerArraysList_FOR_FOREACH {
    public static void main(String[] args) {
        ArrayList<String>   navegadores = new ArrayList<String>();
        navegadores.add("Chrome");
        navegadores.add("Firefox");
        navegadores.add("Safari");

        //for Clasico
        for (int i=0; i<navegadores.size() ; i++)
        {
            System.out.println(navegadores.get(i));
        }

        //For-each
        for (String asigna:navegadores)
        {
            System.out.println(asigna);
        }


    }
}
