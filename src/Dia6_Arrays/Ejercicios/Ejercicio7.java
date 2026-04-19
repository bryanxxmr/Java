package Dia6_Arrays.Ejercicios;

public class Ejercicio7
{
    public static void main(String[] args) {
        String[] basedatos={"mysql","mongodb","postgresql","redis","sqlite"};

        for (String tipobd : basedatos)
        {
            String bd = clasificarBaseDatos(tipobd);
            System.out.println(tipobd + " → " + bd);
        }
    }
    public static String clasificarBaseDatos(String tipo)
    {
        if(tipo.equals("mysql"))
        {
            return "Base de datos relacional de Oracle";
        } else if (tipo.equals("mongodb")) {
            return "Base de datos NoSQL";
        } else if (tipo.equals("postgresql")) {
            return "Base de datos relacional open source";
        } else if (tipo.equals("redis")) {
            return "Base de datos en memoria";
        }
        else
        {
            return "Base de datos no reconocida";
        }
    }
}
