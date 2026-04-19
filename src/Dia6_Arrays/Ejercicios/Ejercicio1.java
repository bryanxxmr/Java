package Dia6_Arrays.Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] url = {"https://qa-app.com/login","https://qa-app.com/registro",
                "https://qa-app.com/dashboard","https://qa-app.com/logout"};

        for (int i = 0; i < url.length; i++)
        {
            System.out.println("URL " + (i+1) + ": " + url[i]);
        }
    }
}
