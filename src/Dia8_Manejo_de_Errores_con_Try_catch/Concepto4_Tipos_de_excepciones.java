package Dia8_Manejo_de_Errores_con_Try_catch;

public class Concepto4_Tipos_de_excepciones {
    public static void main(String[] args) {
        try{
            int[] numeros = {1,2,3};
            System.out.println(numeros[10]);
            System.out.println("Esta linea NO se ejecuta");
        }
        // Captura solo errores de indice fuera de rango
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice invalido: " + e.getMessage());
        }

        // Captura solo errores de division entre cero
        catch (ArithmeticException e) {
            System.out.println("No puedes dividir entre cero");
        }

        // Captura cualquier error (el mas general)
        catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
