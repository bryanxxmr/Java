package Dia4_Bucles.Ejercicios;

public class Ejercicio3_SimuladordeIntentosLogin {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            if (i == 3)
            {
                System.out.println("Intento " + i + ": Login exitoso");
            }
            else
            {
                System.out.println("Intento " + i + ": Login fallido");
            }
        }
    }
}
