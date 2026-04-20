package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio9PDF {
    public static void main(String[] args) {
        boolean[] resultados = {true, false, true, true, false};

        for(int i = 0 ; i<resultados.length ; i++)
        {
           if (resultados[i] == true)
           {
               System.out.println("Prueba "+(i+1)+ ": PASO" );
           }
           else
           {
               System.out.println("Prueba "+(i+1)+ ": FALLO" );
           }
        }
    }
}
