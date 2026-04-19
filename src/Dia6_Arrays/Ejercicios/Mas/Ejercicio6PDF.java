package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio6PDF {
    public static void main(String[] args) {
        int[] ventas = {150, 230, 95, 310, 180};
        int suma = 0;
        for (int i=0; i<ventas.length ; i++)
        {
            System.out.println("Venta "+(i+1)+": "+ ventas[i]);
            suma = suma + ventas[i];
        }
        System.out.println("Total de ventas: "+suma);
    }
}