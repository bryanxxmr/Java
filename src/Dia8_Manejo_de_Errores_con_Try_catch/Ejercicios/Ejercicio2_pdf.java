package Dia8_Manejo_de_Errores_con_Try_catch.Ejercicios;

public class Ejercicio2_pdf {
    public static void main(String[] args) {
        try
        {
            int a = 10;
            int b = 0;
            System.out.println("Intentando dividir 10 entre 0...");
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Error: No puedes dividir entre cero");
        }
        System.out.println("Operacion finalizada");
    }
}
