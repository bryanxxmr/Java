package Dia3_Condicionals.Ejercicios;

public class EjercicioSimuladorDePruebasAutomatizadas {
    public static void main(String[] args) {
        String tituloEsperado = "Bienvenido a MiApp";
        String tituloActual = "Error 404";
        String urlEsperada = "https://miapp.com/home";
        String urlActual = "https://miapp.com/error";
        boolean botonLogoutVisible = false;

        boolean pruebaPaso = true;

        if (!tituloActual.equals(tituloEsperado)) {
            pruebaPaso = false;
        }
        if (!urlActual.equals(urlEsperada)) {
            pruebaPaso = false;
        }
        if (!botonLogoutVisible) {
            pruebaPaso = false;
        }

        if (pruebaPaso) {
            System.out.println("PRUEBA EXITOSA");
            System.out.println("- Titulo correcto");
            System.out.println("- URL correcta");
            System.out.println("- Boton logout visible");
        } else {
            System.out.println("PRUEBA FALLIDA");

            if (!tituloActual.equals(tituloEsperado)) {
                System.out.println("- Titulo esperado: " + tituloEsperado + " - Titulo actual: " + tituloActual);
            }
            if (!urlActual.equals(urlEsperada)) {
                System.out.println("- URL esperada: " + urlEsperada + " - URL actual: " + urlActual);
            }
            if (!botonLogoutVisible) {
                System.out.println("- Boton logout NO visible");
            }
        }
    }
}