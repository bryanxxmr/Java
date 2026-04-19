package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio3PDF {
    public static void main(String[] args) {
        String[] ambientes = {"local", "dev", "qa", "staging", "prod"};
        //Sin usar un bucle, imprime solo el primero, el del
        //medio y el ultimo usando su indice directamente.
        System.out.println("Primer ambiente: " + ambientes[0]);
        System.out.println("Ambiente del medio: " + ambientes[2]);
        System.out.println("Ultimo ambiente: " + ambientes[4]);
    }
}