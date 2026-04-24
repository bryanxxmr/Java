package Dia8_Manejo_de_Errores_con_Try_catch.Ejercicios;

public class Ejercicio3_pdf {
    public static void main(String[] args) {
        try
        {
            int[] numeros = {1,2,3};
            System.out.println(numeros[10]);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        finally {
            System.out.println("Proceso terminado - cerrando recursos");
        }
    }
}
