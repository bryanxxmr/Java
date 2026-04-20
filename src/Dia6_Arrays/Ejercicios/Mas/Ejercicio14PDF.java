package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio14PDF {
    public static void main(String[] args) {
        int[] tiempos = {95, 310, 620, 180, 450, 800, 55};
        for (int i=0; i<tiempos.length; i++ )
        {
            String capturador = evaluarVelocidad(tiempos[i]);
            System.out.println(tiempos[i] + "ms -> "+capturador);
        }
    }

    public static String evaluarVelocidad (int velocidad)
    {
        if (velocidad<200)
        {
            return "Rapido";
        }
        else if (velocidad>=200 && velocidad <=500) {
            return "Aceptable";
        }
        else
        {
            return "Lento - revisar";
        }
    }
}
