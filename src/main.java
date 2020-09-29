import java.util.Scanner;

public class main {
    public static void main(final String[] args) {
        final Scanner teclado = new Scanner(System.in);

        String menu, nombre;

        System.out.print("Dime tu nombre: ");
        nombre = teclado.nextLine();

        System.out.println("\nHola " + nombre + " Elige opción:\n1. Ejercicio 1" + "\n2. Ejercicio 2\n"
                + "3. Ejercicio 3\n" + "4. Ejercicio 4\n" + "0.- Salir");
        menu = teclado.nextLine();

        switch (menu) {
            case "1":
                System.out.println("Hola " + nombre);
                ejercicio1();
                break;
            case "2":
                System.out.println("Hola " + nombre);
                ejercicio1();
                break;
            case "3":
                ejercicio1();
                break;
            case "4":
                ejercicio1();
                break;
            case "5":
                ejercicio1();
                break;
            case "6":
                ejercicio1();
                break;
            case "7":
                ejercicio1();
                break;
            default:
                System.out.println("chau");
                break;
        }

    }

    static void ejercicio1() {

    }

}
