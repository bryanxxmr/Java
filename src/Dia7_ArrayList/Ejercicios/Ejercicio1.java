package Dia7_ArrayList.Ejercicios;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> navegadores = new ArrayList<>();
        navegadores.add("chrome");
        navegadores.add("firefox");
        navegadores.add("edge");
        navegadores.add("safari");

        for(String navega:navegadores)
        {
            System.out.println("-> Navegador: "+navega);
        }
    }
}
