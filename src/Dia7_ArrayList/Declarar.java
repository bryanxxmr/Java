package Dia7_ArrayList;

import java.util.ArrayList;

public class Declarar {
    public static void main(String[] args) {
        ArrayList<String> navegadores = new ArrayList<String>();
        navegadores.add("chrome");
        navegadores.add("firefox");
        navegadores.add("safari");
        navegadores.add("edge");

        for(String recorrido: navegadores)
        {
            System.out.println(recorrido);
        }
    }
}
