package Dia3_Condicionals.Ejercicios;

public class EjercicioValidadorFormulario {
    public static void main(String[] args)
    {
        String nombre = "Kenny";
        String mail = "kenny@test.com";
        int edad = 35;
        boolean aceptaTermino = true;

        if(nombre.equals(""))
        {
            System.out.println("El nombre es obligatorio");
        }
        else if (!mail.contains("@"))
        {
            System.out.println("El email no es valido");
        }
        else if(edad<18)
        {
            System.out.println("Debes ser mayor de edad");
        }
        else if (aceptaTermino == false) {
            System.out.println("Debes aceptar los terminos");
        }
        else
        {
            System.out.println("Registro exitoso");
        }

    }
}
