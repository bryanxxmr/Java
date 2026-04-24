package Dia7_ArrayList.Ejercicios;

import java.util.ArrayList;

public class Ejercicio6_otraForma {
    public static void main(String[] args) {
        ArrayList<String> filtrados = new ArrayList<>();
        String[] todos = {"chrome", "firefox", "edge", "safari", "brave"};

        for (String recorrido : todos) {
            if (recorrido.contains("e")) {
                filtrados.add(recorrido);
            }
        }
        System.out.println("Navegadores con letra e:");
        for (String filtrado : filtrados) {
            System.out.println("-> " + filtrado);
        }
    }
}
