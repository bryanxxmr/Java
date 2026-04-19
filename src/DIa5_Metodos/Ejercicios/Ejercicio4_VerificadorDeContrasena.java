package DIa5_Metodos.Ejercicios;

public class Ejercicio4_VerificadorDeContrasena {
    public static void main(String[] args) {
        String mensaje = verificarPassword("MiClav");
        System.out.println(mensaje);
    }

    public static String verificarPassword(String contrasena)
    {
        if (contrasena.length()>=8)
        {
             return "Contraseña válida";
        }
        else {
            return "Contraseña muy corta";
        }
    }
}
