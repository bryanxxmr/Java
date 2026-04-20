package Dia6_Arrays.Ejercicios.Mas;

public class BonusPDF {
    public static void main(String[] args) {
        String[]  pruebas    = {"Login", "Registro", "Busqueda", "Pago", "Logout"};
        boolean[] resultados = {true,    false,      true,       false,  true};
        int totalpasaron = 0;
        int totalfallaron = 0;
        for (int i = 0 ; i<pruebas.length; i++)
        {
            String capturador = estadoPrueba(resultados[i]);
            if (resultados[i])
            {
                totalpasaron = totalpasaron + 1;
                System.out.println(pruebas[i] + " -> "+ capturador);
            }
            else
            {
                totalfallaron = totalfallaron + 1;
                System.out.println(pruebas[i] + " -> " + capturador);
            }
        }
        System.out.println("----------------------------");
        System.out.println("Total PASO: "+ totalpasaron);
        System.out.println("Total FALLO: "+ totalfallaron);
        System.out.println("Porcentaje de exito: "+ ((totalpasaron*100)/pruebas.length)+"%");
    }
    private static String estadoPrueba(boolean valor) {
        if (valor)
        {
            return "PASO";
        }
        else
        {
            return "FALLO";
        }
    }
}
