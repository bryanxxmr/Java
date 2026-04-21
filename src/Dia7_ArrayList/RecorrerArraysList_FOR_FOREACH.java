package Dia7_ArrayList;

import java.util.ArrayList;

public class RecorrerArraysList_FOR_FOREACH {
    public static void main(String[] args) {
        ArrayList<String>   navegadores = new ArrayList<String>();
        navegadores.add("Chrome");
        navegadores.add("Firefox");
        navegadores.add("Safari");

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

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


        for (int i=0; i<numeros.size(); i++)
        {
            System.out.println(numeros.get(i));
        }
    }
}
