package DIa5_Metodos;

public class Metodo_ConParametrosEnteros {
    public static void main (String[] args)
    {
        sumar(6,9);
        sumar(10,20);
    }

    public static void sumar(int numero1, int numero2)
    {
        int resultado = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    }
}
