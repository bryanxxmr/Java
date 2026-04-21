package Dia7_ArrayList.Ejercicios;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Crea un ArrayList de Integer con estos tiempos de respuesta: 320, 150, 480, 95, 260. Recorrelo con for
        //clasico e imprime cada uno con su posicion.
        ArrayList<Integer> tiempo = new ArrayList<>();
        tiempo.add(320);
        tiempo.add(150);
        tiempo.add(480);
        tiempo.add(95);
        tiempo.add(260);

        for (int i = 0 ; i<tiempo.size() ; i++)
        {
            System.out.println("Posicion " + i + ": " + tiempo.get(i) + "ms");
        }
    }
}
