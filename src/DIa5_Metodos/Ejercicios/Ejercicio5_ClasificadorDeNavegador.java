package DIa5_Metodos.Ejercicios;

public class Ejercicio5_ClasificadorDeNavegador {
    public static void main(String[] args) {
        String mensajenavegador = clasificarNavegador("safari");
        System.out.println(mensajenavegador);
    }
    public static String clasificarNavegador(String navegador)
    {
        if (navegador.equals("chrome")){
            return "Navegador principal de pruebas";
        }
        else if (navegador.equals("firefox"))
        {
            return "Navegador secundario de pruebas";
        }
        else if (navegador.equals("safari")) {
            return "Solo disponible en Mac";
        }
        else
        {
            return "Navegador no soportado";
        }
    }
}
