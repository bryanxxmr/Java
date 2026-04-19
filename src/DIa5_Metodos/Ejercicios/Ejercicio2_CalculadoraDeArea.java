package DIa5_Metodos.Ejercicios;

public class Ejercicio2_CalculadoraDeArea {
    public static void main(String[] args) {
        double area1 = calcularAreaRectangulo (10, 5);
        System.out.println("Area del rectangulo 1: " + area1);

        double area2 = calcularAreaRectangulo (50.5, 5);
        System.out.println("Area del rectangulo 2: " + area2);

        double area3 = calcularAreaRectangulo (20.6, 5);
        System.out.println("Area del rectangulo 3: " + area3);
    }

    public static double calcularAreaRectangulo(double base, double altura)
    {
        return base * altura;
    }
}
