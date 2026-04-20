package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio10PDF {
    public static void main(String[] args) {
        boolean[] resultados = {true, false, true, true, false};
        int totalpasaron = 0;
        int totalfallaron = 0;

        for (int i = 0; i<resultados.length ; i++)
        {
            if (resultados[i] == true)
            {
                totalpasaron = totalpasaron + 1;
                System.out.println("Prueba "+ (i+1)+ ": PASO");
            }
            else
            {
                totalfallaron = totalfallaron + 1;
                System.out.println("Prueba "+ (i+1)+ ": FALLO");
            }
        }
        System.out.println("-------------------");
        System.out.println("Total PASO: "+totalpasaron);
        System.out.println("Total FALLO: "+totalfallaron);
    }
}