package Dia8_Manejo_de_Errores_con_Try_catch;

public class Concepto3_Analogia_Ejemplo {
    public static void main(String[] args) {
        //Sin try/catch: si tropiezas, los vasos caen, se rompen todo y el servicio para.
        //Con try/catch: si tropiezas, agarras la bandeja antes de que caiga y continúas el servicio.

        try{
            int[] numeros = {1,2,3};
            System.out.println(numeros[10]);
            System.out.println("Esta linea NO se ejecuta");
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println("El programa sigue funcionando");
    }
}
