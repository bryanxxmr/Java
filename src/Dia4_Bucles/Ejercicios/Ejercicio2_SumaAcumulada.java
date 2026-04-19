package Dia4_Bucles.Ejercicios;

public class Ejercicio2_SumaAcumulada {
    public static void main (String[] args)
    {
        int suma = 0;
        for (int i=1; i<=10;i++)
        {
            suma = suma + i;
        }
        System.out.println("La suma del 1 al 10 es "  + suma);
    }
}
