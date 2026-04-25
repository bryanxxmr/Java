package Dia8_Manejo_de_Errores_con_Try_catch.Ejercicios;

public class Ejercicio6_pdf {
    public static void main(String[] args) {
        String[] elementos = {"boton-login", "boton-inexistente", "campo-email"};
        for (String ele : elementos) {
            metodo(ele);
            System.out.println("---");
        }
    }
    public static void metodo(String elemento) {
        try {
            System.out.println("Buscando: " + elemento);
            if (elemento.equals("boton-inexistente")) {
                throw new Exception("Elemento no encontrado en la pagina");
            }
            System.out.println("Elemento encontrado: " + elemento);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("Cerrando navegador...");
        }
    }
}