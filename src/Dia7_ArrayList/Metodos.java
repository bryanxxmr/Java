package Dia7_ArrayList;

import java.util.ArrayList;

public class Metodos {
    public static void main(String[] args) {
        ArrayList<String> navegadores = new ArrayList<String>();
        navegadores.add("Chrome");
        navegadores.add("Firefox");
        navegadores.add("Safari");

        //Obtener elemento por posicion
        System.out.println(navegadores.get(0));     //Imprime: Chrome

        //Cuantos elementos tiene
        System.out.println(navegadores.size());     //Tiene: 3

        //Eliminar posicion
        System.out.println(navegadores.remove(1));  //Elimina la posicion 1

        //Verifica si existe
        System.out.println(navegadores.contains("Chrome"));     //true

    }
}
