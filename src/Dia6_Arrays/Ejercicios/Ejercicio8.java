package Dia6_Arrays.Ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
        String[] roles = {"admin", "tester", "tester", "guest", "developer"};
        String[] entornos = {"prod", "qa", "prod", "staging", "qa"};

        for (int i = 0; i < roles.length; i++) {
            String resultado = validarAcceso(roles[i], entornos[i]);
            System.out.println(roles[i] + " + " + entornos[i] + " → " + resultado);
        }
    }
    public static String validarAcceso(String rolcito, String entor)
    {
        if (rolcito.equals("admin"))
        {
            return "Acceso total permitido";
        }
        else if (rolcito.equals("tester"))
        {
            if (entor.equals("qa") || entor.equals("staging")) {
                return "Acceso permitido";
            }
            else
            {
                return "Acceso denegado - produccion restringida";
            }
        }
        else if (rolcito.equals("guest")) {
            return "Acceso denegado";
        }
        else
        {
            return "Rol no reconocido";
        }
    }
}
