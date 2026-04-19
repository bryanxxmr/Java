package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio7PDF {
    public static void main(String[] args) {
        int[] tiempos = {320, 150, 480, 95, 260};
        //Encuentra e imprime cual es el tiempo mas alto.
        int maximo = tiempos[0];

        for (int i=0 ; i<tiempos.length ; i++)
        {
            if(tiempos[i]>maximo)
            {
                maximo = tiempos[i];
            }
        }
        System.out.println("Tiempo maximo de respuesta: " + maximo +" ms");
    }
}
