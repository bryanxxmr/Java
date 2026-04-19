package Dia3_Condicionals.Ejercicios;

public class EjercicioTemperatura {
    public static void main(String[] args)
    {
        int temperatura = 30;
        if(temperatura<15)
        {
            System.out.println("Hace frio");
        }
        else if(temperatura<=25)
        {
            System.out.println("Temperatura agradable");
        }
        else
        {
            System.out.println("Hace calor");
        }
    }
}
