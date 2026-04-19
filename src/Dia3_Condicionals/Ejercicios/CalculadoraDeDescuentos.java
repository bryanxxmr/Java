package Dia3_Condicionals.Ejercicios;

public class CalculadoraDeDescuentos {
    public static void main(String[] args)
    {
        double totalCompra = 100.00;
        boolean clienteVip = true;
        int cantidadProductoComprados = 2;

        if(clienteVip ==  true && totalCompra>100)
        {

            System.out.println("total original " + totalCompra);
            System.out.println("porcentaje de descuento aplicado es 20%");
            System.out.println("El total final: " + (totalCompra-(totalCompra*20/100)));

        }
        else if(clienteVip ==  true && totalCompra<=100)
        {
            System.out.println("total original " + totalCompra);
            System.out.println("porcentaje de descuento aplicado es 10%");
            System.out.println("El total final: " + (totalCompra-(totalCompra*10/100)));
        }
        else if(clienteVip ==  false && cantidadProductoComprados>10)
        {
            System.out.println("total original " + totalCompra);
            System.out.println("porcentaje de descuento aplicado es 15%");
            System.out.println("El total final: " + (totalCompra-(totalCompra*15/100)));
        }
        else
        {
            System.out.println("total original " + totalCompra);
            System.out.println("porcentaje de descuento aplicado es 0%");
            System.out.println("El total final: " + (totalCompra));
        }
    }
}
