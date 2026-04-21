package Dia7_ArrayList.Ejercicios;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Crea un ArrayList de Boolean con: true, false, true, true, false. Recorrelo e imprime 'PASO' o 'FALLO'
        //segun el valor. Al final imprime el total de cada uno.
        ArrayList<Boolean> respuesta = new ArrayList<>();
        respuesta.add(true);
        respuesta.add(false);
        respuesta.add(true);
        respuesta.add(true);
        respuesta.add(false);
        int contadorPaso = 0;
        int contadorFallido = 0;
        for(int i = 0 ; i<respuesta.size(); i++)
        {
            if (respuesta.get(i).equals(true))
            {
                System.out.println("Prueba " + (i+1) + " PASO");
                contadorPaso = contadorPaso + 1;
            }
            else {
                System.out.println("Prueba " + (i + 1) + " FALLO");
                contadorFallido = contadorFallido + 1;
            }
        }
        System.out.println("-------------------");
        System.out.println("Total PASO: " + contadorPaso);
        System.out.println("Total PASO: " + contadorFallido);
    }
}
