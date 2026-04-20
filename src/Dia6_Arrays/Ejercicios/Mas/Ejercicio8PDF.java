package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio8PDF {

    public static void main(String[] args) {
        int[] tiempos = {320, 150, 480, 95, 260, 510, 88};
        int lentos=0;
        int rapidos = 0;

        for(int i=0 ; i<tiempos.length ; i++)
        {
            if(tiempos[i]>300)
            {
                lentos = lentos + 1;
            }
            else
            {
                rapidos = rapidos + 1;
            }
        }
        System.out.println("Tiempos lentos (mas de 300ms): "+lentos);
        System.out.println("Tiempos rapidos (300ms o menos): "+rapidos);

    }
}
