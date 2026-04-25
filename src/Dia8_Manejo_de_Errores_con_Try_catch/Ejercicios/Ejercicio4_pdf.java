package Dia8_Manejo_de_Errores_con_Try_catch.Ejercicios;

public class Ejercicio4_pdf {
    public static void main(String[] args) {
        try
        {
            int[] numeros = {1,2,3};
            int resultado = numeros[1] / 0;
            System.out.println(resultado);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error de indice: " + e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error matematico: division entre cero");
        }
        catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        System.out.println("Programa finalizado");
    }
}
