package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio11PDF {
    public static void main(String[] args) {
        String[] nivel = {"critica", "alta", "media", "baja", "urgente"};

        for (int i = 0; i<nivel.length ; i++)
        {
            String recepcion = clasificarPrioridad(nivel[i]);
            System.out.println(nivel[i] + " -> " + recepcion);
        }
    }
    public static String clasificarPrioridad(String nivel)
    {
        if (nivel.equals("critica"))
        {
            return "Atender AHORA - parar todo";
        }
        else if (nivel.equals("alta")) {
            return "Atender en 2 horas";
        }
        else if (nivel.equals("media"))
        {
            return "Atender en 1 dia";
        }
        else if (nivel.equals("baja")) {
            return "Atender en 1 semana";
        }
        else
        {
            return "Prioridad no reconocida";
        }
    }
}
