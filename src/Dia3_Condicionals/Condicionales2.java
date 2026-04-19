package Dia3_Condicionals;

public class Condicionales2 {
    public static void main(String[] args) {
        // Datos de prueba (como en Selenium real)
        String usuario = "admin";
        String password = "1234";
        int intentos = 2;
        boolean cuentaBloqueada = false;

        // Primer condicional: validar credenciales
        if (usuario.equals("admin") && password.equals("1234")) {
            System.out.println("Login exitoso. Bienvenido " + usuario);
        } else {
            System.out.println("Usuario o contrasena incorrectos");
        }

        // Segundo condicional: validar intentos
        if (intentos >= 3) {
            System.out.println("Cuenta bloqueada por muchos intentos");
        } else {
            System.out.println("Te quedan " + (3 - intentos) + " intentos");
        }

        // Tercer condicional: estado de la cuenta
        if (cuentaBloqueada) {
            System.out.println("ALERTA: la cuenta esta bloqueada");
        } else {
            System.out.println("La cuenta esta activa");
        }
    }
}
