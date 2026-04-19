package Dia3_Condicionals;

public class Condicionales6 {
    public static void main(String[] args)
    {
        String usuarioIngresado = "kenny";
        String passwordIngresado = "qa2026";
        String usuarioCorrecto = "kenny";
        String passwordCorrecto = "qa2026";
        if (usuarioIngresado.equals(usuarioCorrecto))
        {
            if (passwordIngresado.equals(passwordCorrecto))
            {
                System.out.println("Login Exitoso");
            }
            else {
                System.out.println("Password incorrecto");
            }
        }
        else
        {
            System.out.println("Usuario no existe");
        }
    }
}
