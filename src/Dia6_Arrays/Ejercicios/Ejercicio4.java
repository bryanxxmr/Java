package Dia6_Arrays.Ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] entornos = {"dev", "staging", "prod", "qa", "local"};

        for (String entorno : entornos) {
            String resultado = clasificarEntorno(entorno);
            System.out.println(entorno + " → " + resultado);
        }
    }

    public static String clasificarEntorno(String entorno) {
        if (entorno.equals("dev")) {
            return "Entorno de desarrollo - pruebas libres";
        } else if (entorno.equals("qa")) {
            return "Entorno de calidad - pruebas formales";
        } else if (entorno.equals("staging")) {
            return "Entorno de pre-produccion";
        } else if (entorno.equals("prod")) {
            return "PRODUCCION - cuidado!";
        } else {
            return "Entorno desconocido";
        }
    }
}