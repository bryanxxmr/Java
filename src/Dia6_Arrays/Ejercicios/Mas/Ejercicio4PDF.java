package Dia6_Arrays.Ejercicios.Mas;

public class Ejercicio4PDF {
    //Crea un array con {"pendiente", "pendiente", "pendiente", "pendiente"}. Cambia el indice 1 a 'en progreso' y
    //el indice 3 a 'completado'. Luego recorre el array e imprime todos.

    public static void main(String[] args) {
        String[] estados = {"pendiente", "pendiente", "pendiente", "pendiente"};

        estados[1] = "en progreso";
        estados[3] = "completado";

        for (int i = 0; i<estados.length; i++)
        {
            System.out.println("Estado " +  i + ": " + estados[i]);
        }
    }
}
