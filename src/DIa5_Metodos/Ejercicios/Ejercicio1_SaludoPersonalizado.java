    package DIa5_Metodos.Ejercicios;

    public class Ejercicio1_SaludoPersonalizado {
        public static void main(String[] args) {
            saludarUsuario("Kenny", "QA");
            saludarUsuario("Ana", "Developer");
            saludarUsuario("Carlos", "Manager");
        }

        public static void saludarUsuario (String nombre, String rol){

            System.out.println("Hola " + nombre + ", bienvenido! Tu rol es: " + rol );
        }
    }
