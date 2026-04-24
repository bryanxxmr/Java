package Dia8_Manejo_de_Errores_con_Try_catch;

public class Concepto6_try_and_cath_en_Selenium {
    public static void main(String[] args) {
        try {
            // Selenium intenta encontrar un elemento en la pagina
            System.out.println("Buscando elemento...");
            // driver.findElement(By.id("boton-pago")); // podria no existir
        } catch (Exception e) {
            System.out.println("Elemento no encontrado: " + e.getMessage());
        } finally {
            System.out.println("Cerrando navegador...");
            // driver.quit();
        }
    }
}
