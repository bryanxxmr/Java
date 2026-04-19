package Dia6_Arrays;

public class Acceder_modificar_medir_Arrays {
    public static void main(String[] args) {
        String[] navegadores = {"chrome","firefox","safari"};

        System.out.println(navegadores[0]);     //chrome
        System.out.println(navegadores[1]);     //firefox

        //editar la variable del elemento que se encuentra en el indice
        navegadores[1] = "edge";    //modificar
        System.out.println(navegadores[1]);     //edge

        System.out.println(navegadores.length); //3
    }
}
