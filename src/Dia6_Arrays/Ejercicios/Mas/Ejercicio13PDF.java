package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio13PDF {
    public static void main(String[] args) {
        String[] roles = {"admin", "tester", "tester", "guest", "developer"};
        String[] entornos = {"prod", "qa", "prod", "staging", "qa"};

        for (int i=0; i<roles.length ; i++)
        {
            String recepcion = validarAcceso(roles[i],entornos[i]);
            System.out.println(roles[i]+ " + "+ entornos[i] + " -> " + recepcion);
        }
    }
    public static String validarAcceso(String rolcito, String entor)
    {
        if(rolcito.equals("admin"))
        {
            return "Acceso total permitido";
        }
        if (rolcito.equals("tester"))
        {
            if (entor.equals("qa") || entor.equals("staging"))
            {
                return "Acceso permitido";
            }
            if (entor.equals("prod"))
            {
                return "Acceso denegado - produccion restringida";
            }
        }
        if (rolcito.equals("guest"))
        {
            return "Acceso denegado";
        }
        else
        {
            return "Rol no reconocido";
        }
    }
}
