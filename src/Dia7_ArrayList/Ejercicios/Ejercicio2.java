package Dia7_ArrayList.Ejercicios;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> ambientes = new ArrayList<>();
        ambientes.add("dev");
        ambientes.add("qa");
        ambientes.add("staging");
        ambientes.add("prod");
        System.out.println("Ambientes activos:");
        ambientes.remove(1);

        for (String ambien:ambientes)
        {
            System.out.println("-> " + ambien);
        }

        for (int i = 0 ; i<ambientes.size() ; i++)
        {
            System.out.println(ambientes.get(i));
        }
    }
}
