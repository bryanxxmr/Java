package Dia6_Arrays.Ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] valores = {"smoke","regresion","integracion","unitaria","exploratorio"};

        for (String descripciones:valores)
        {
            String receptor = clasificarTipoPrueba(descripciones);
            System.out.println(descripciones + " -> " + receptor);
        }
    }
    public static String clasificarTipoPrueba(String descripcion)
    {
        if (descripcion.equals("smoke"))
        {
            return "Prueba rapida de funcionalidad basica";
        } else if (descripcion.equals("regresion")) {
            return "Prueba completa del sistema";
        } else if (descripcion.equals("integracion")) {
            return "Prueba entre modulos";
        } else if (descripcion.equals("unitaria")) {
            return "Prueba de un componente aislado";
        }
        else
        {
            return "Tipo de prueba desconocido";
        }
    }
}
