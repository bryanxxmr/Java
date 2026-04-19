package Dia4_Bucles;

public class Bucles_For {
    public static void main (String[] args)
    {
        //Bucle1: contar del 1 al 5
        System.out.println("=== Contando del 1 al 5 ===");
        for (int i=1;i<=5;i++)
        {
            System.out.println("Numero: "+i);
        }

        //Bucle2: simular pruebas de login
        System.out.println("\n=== Probando login ===");
        for(int i=1; i<=3;i++)
        {
            System.out.println("Probando usuario " + i + "...");
        }

        //Bucle 3: contar hacia atras
        System.out.println("\n=== Cuenta regresiva ===");
        for(int i=5; i>=1;i--)
        {
            System.out.println(i + "...");
        }
        System.out.println("Despegue!");
    }
}
