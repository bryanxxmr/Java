package Dia6_Arrays.Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        String[] prioridad = {"alta","media","baja","critica"};

        for (String prio : prioridad)
        {
            String clasifica =clasificarPrioridad(prio);
            System.out.println(prio + " → " + clasifica);
        }
    }

    public static String clasificarPrioridad(String clasificacion)
    {
        if(clasificacion.equals("alta"))
        {
            return "Atender en 2 horas";
        }
        else if (clasificacion.equals("media")) {
            return "Atender en 1 dia";
        }
        else if (clasificacion.equals("baja")) {
            return "Atender en 1 semana";
        } else if (clasificacion.equals("critica")) {
            return "Atender AHORA";
        }
        else
        {
            return "Prioridad no reconocida";
        }
    }
}
