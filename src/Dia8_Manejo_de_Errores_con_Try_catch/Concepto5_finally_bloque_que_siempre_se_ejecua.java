package Dia8_Manejo_de_Errores_con_Try_catch;

public class Concepto5_finally_bloque_que_siempre_se_ejecua {
    public static void main(String[] args) {
        try {
            System.out.println("Intentando...");
            int resultado = 10 / 0; // falla
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        } finally {
            System.out.println("Esto siempre se ejecuta");
        }
    }
}
