package Dia3_Condicionals;

public class Condicionales5 {
    public static void  main (String[] args)
    {
        int edad = 18;
        if (edad<13)
        {
            System.out.println("Eres nino");
        }
        else if(edad>=13 && edad<=17)
        {
            System.out.println("Eres adolescente");
        }
        else if(edad>=18 && edad<=64)
        {
            System.out.println("Eres adulto");
        }
        else
        {
            System.out.println("Eres adulto mayor");
        }
    }

}
