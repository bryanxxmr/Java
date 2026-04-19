package Dia3_Condicionals.Ejercicios;

public class EjercicioURLSegura {
    public static void main(String[] args)
    {
        String url="google.com";
        if (url.startsWith("https://"))
        {
            System.out.println("URL Segura");
        }
        else if(url.startsWith("http://"))
        {
            System.out.println("URL no segura");
        }
        else
        {
            System.out.println("URL invalida");
        }
    }
}
