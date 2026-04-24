package Dia8_Manejo_de_Errores_con_Try_catch.Ejercicios;

public class Ejercicio1_pdf {
    public static void main(String[] args) {
        try
        {
            int[] numeros = {1,2,3};
            System.out.println(numeros[10]);

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        System.out.println("El programa continua funcionando");
    }
}
