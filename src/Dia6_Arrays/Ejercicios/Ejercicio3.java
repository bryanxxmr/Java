package Dia6_Arrays.Ejercicios;

public class Ejercicio3 {
    public static void main(String[] args)
    {
        String[] usuarios = {"admin","tester","developer","manager","guest"};
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < usuarios.length ; i++)
        {
            if (usuarios[i].equals("tester"))
            {
                encontrado = true;
                posicion = i;
            }
        }
        if (encontrado)
        {
            System.out.println("Usuario encontrado en posicion: " + posicion);
        }
        else
        {
            System.out.println("Usuario no encontrado");
        }
    }
}
