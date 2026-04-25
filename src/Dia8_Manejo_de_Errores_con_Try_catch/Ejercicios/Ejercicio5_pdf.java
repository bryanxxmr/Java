package Dia8_Manejo_de_Errores_con_Try_catch.Ejercicios;

public class Ejercicio5_pdf {
    public static void main(String[] args) {
        String[] navegadores = {"chrome","firefox","edge","safari"};
        for (int i = 0; i<(navegadores.length + 2); i++)
        {
            try {
                System.out.println("Posicion " + i + ": " + navegadores[i]);
            }
            catch (Exception e)
            {
                System.out.println("Error en posicion " + i + ": indice invalido");
            }
        }
        System.out.println("Bucle completado");
    }
}