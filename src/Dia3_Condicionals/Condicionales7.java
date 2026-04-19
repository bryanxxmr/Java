package Dia3_Condicionals;

public class Condicionales7 {
    public static void main (String[] args)
    {
        String usuarioIngresado = "kenny";
        String passwordIngresado = "qa2026";
        String usuarioCorrecto = "kenny";
        String passwordCorrecto = "qa2026";
        if (usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto)) {
            System.out.println("Login exitoso");
        } else if (usuarioIngresado.equals(usuarioCorrecto)) {
            System.out.println("Password incorrecto");
        } else {
            System.out.println("Usuario no existe");
        }
    }
}
