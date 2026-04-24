package Dia7_ArrayList.Ejercicios;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        usuarios.add("admin");
        usuarios.add("tester");
        usuarios.add("developer");
        usuarios.add("manager");
        usuarios.add("guest");
        for (int i = 0 ; i<usuarios.size() ; i++)
        {
            if (usuarios.get(i).contains("tester"))
            {
                System.out.println("El usuario tester existe: " + usuarios.contains("tester"));
            }
        }

        //Solucion sin el for System.out.println("El usuario tester existe: " + usuarios.contains("tester"));
    }
}