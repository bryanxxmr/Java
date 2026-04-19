package Dia3_Condicionals.Ejercicios;

public class EjercicioSistemaLogin {
    public static void main (String[] args)
    {
        String usuarioIngresado = "kenny";
        String passwordIngresado = "incorrecto";
        String usuarioCorrecto ="kenny";
        String passwordCorrecto =  "qa2026";
        int intentosPrevios=0;
        if (intentosPrevios>=3)
        {
            System.out.println("Cuenta bloqueada. Contacte soporte");
        }
        else if (!usuarioIngresado.equals(usuarioCorrecto))
        {
            System.out.println("Usuario no encontrado");
        }
        else if(usuarioIngresado.equals(usuarioCorrecto)&&!passwordIngresado.equals(passwordCorrecto))
        {
            System.out.println("Password incorrecto. Intentos restantes: " + (3-intentosPrevios-1));
        }
        else
        {
            System.out.println("Login exitoso. Bienvenido " + usuarioIngresado);
        }
    }
}
