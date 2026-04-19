package DIa5_Metodos.Ejercicios;

public class Ejercicio3_ElMásInteresant {
    public static void main(String[] args) {
        String resultado1=validarUrl("https://google.com");
        System.out.println("https://google.com -> " + resultado1);

        String resultado2=validarUrl("http://miapp.com");
        System.out.println("http://miapp.com -> " + resultado2);

        String resultado3 = validarUrl("ftp://archivo.com");
        System.out.println("ftp://archivo.com -> " + resultado3);
    }

    public static String validarUrl(String url)
    {
        if (url.startsWith("https://")) {
            return "URL segura";          // entrega el texto
        } else if (url.startsWith("http://")) {
            return "URL no segura";       // entrega el texto
        } else {
            return "URL invalida";        // entrega el texto
        }

    }
}
