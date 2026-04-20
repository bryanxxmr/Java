package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio12PDF {
    public static void main(String[] args) {
        String[] arreglo = {"smoke","regresion", "integracion", "unitaria", "exploratorio"};

        for (int i=0 ; i<arreglo.length ; i++)
        {
            String recepcion = clasificarTipoPrueba(arreglo[i]);
            System.out.println(arreglo[i] + " -> " + recepcion);
        }
    }

    public static String clasificarTipoPrueba(String valor)
    {
        if(valor.equals("smoke"))
        {
            return "Prueba rapida de funcionalidad basica";
        }
        else if (valor.equals("regresion")) {
            return "Prueba completa del sistema";
        }
        else if (valor.equals("integracion"))
        {
            return "Prueba entre modulos";
        }
        else if (valor.equals("unitaria")) {
            return "Prueba de un componente aislado";
        }
        else
        {
            return "Tipo de prueba desconocido";
        }
    }
}