package Dia7_ArrayList.Ejercicios;

import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Crea un ArrayList vacio de Strings. Luego recorre este array y agrega al ArrayList solo los navegadores que
        //contengan la letra 'e'. Al final imprime el ArrayList resultante.
        ArrayList<String> filtrados = new ArrayList<>();
        String[] todos = {"chrome", "firefox", "edge", "safari", "brave"};
        System.out.println("Navegadores con letra e: ");
        int i=0;
        for (String recorrido : todos)
        {
            if (recorrido.contains("e"))
            {
                filtrados.add(recorrido);
                System.out.println("-> " + filtrados.get(i));
                i++;
            }
        }
    }
}
