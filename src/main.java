import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String menu;

        System.out.println("\nHola Elige opción:\n1. Ejercicio 1" + "\n2. Ejercicio 2\n" + "3. Ejercicio 3\n"
                + "4. Ejercicio 4\n" + "5. Ejercicio 5\n" + "6. Ejercicio 6\n" + "7. Ejercicio 7\n" + "0.- Salir");

        System.out.print("Elige una opcion: ");
        menu = teclado.nextLine();

        switch (menu) {
            case "1":
                ejercicio1(teclado);
                break;
            case "2":
                ejercicio2(teclado);
                break;
            case "3":
                ejercicio3(teclado);
                break;
            case "4":
                ejercicio4(teclado);
                break;
            case "5":
                ejercicio5(teclado);
                break;
            case "6":
                ejercicio6(teclado);
                break;
            case "7":
                ejercicio7(teclado);
                break;
            default:
                System.out.println("chau");
                break;
        }

    }

    static void ejercicio1(Scanner teclado) {
        int base, altura, r;

        System.out.println("\n>>Area de un triangulo\n");

        System.out.print("Ingresa la base: ");
        base = teclado.nextInt();
        System.out.print("Ingresa la altura: ");
        altura = teclado.nextInt();

        r = base * altura / 2;

        System.out.println("El area de triangulo es: " + r);
        main(null);
    }

    static void ejercicio2(Scanner teclado) {
        double PDolar, DMexicano;

        System.out.println("\n>>Convertidor de Pesos Mexicanos a Dolares\n");

        System.out.print("Ingresa el dinero en pesos: ");
        DMexicano = teclado.nextDouble();

        PDolar = 0.045 * DMexicano;

        System.out.println("Recibiras : " + PDolar + " Dolares");
        main(null);
    }

    static void ejercicio3(Scanner teclado) {
        int A_Actual, A_Nacimiento, r;

        System.out.println("\n>>Calcular edad de un personal\n");

        System.out.print("Ingresa el Año actual: ");
        A_Actual = teclado.nextInt();
        System.out.print("Ingresa el Año de Nacimiento: ");
        A_Nacimiento = teclado.nextInt();

        r = A_Actual - A_Nacimiento;

        System.out.println("El personal tiene: " + r);
        main(null);
    }

    static void ejercicio4(Scanner teclado) {
        double cobro, cobroHora, Horas;

        System.out.println("\n>>Cobro de Estacionamiento\n");

        System.out.println("Cuanto esta la hora:");
        cobroHora = teclado.nextDouble();
        System.out.println("Cuantas horas estuvo:");
        Horas = teclado.nextDouble();

        cobro = cobroHora * Horas;
        System.out.println("Tienes que cobrar: " + cobro);
        main(null);
    }

    static void ejercicio5(Scanner teclado) {
        double cobroP, cobroE, cobroPM, cobroM2;

        System.out.println("\n>>Pitura la brocha Gorda\n");

        System.out.print("Cuantos metros cuadrados vas a pintar:");
        cobroM2 = teclado.nextDouble();

        cobroP = cobroM2 * 14.43;
        cobroE = cobroM2 * 4.2;
        cobroPM = cobroM2 * 90;
        System.out.println(
                "Tienes que cobrar en : \n" + "PE: S/." + cobroP + "\nEUU: $." + cobroE + "\nMX: $." + cobroPM);
        main(null);
    }

    static void ejercicio6(Scanner teclado) {
        int a, b, aE, bE, r;

        System.out.println("\n>>Determinar la hipotenusa de un triangulo\n");

        System.out.print("Dame el valor a: ");
        a = teclado.nextInt();
        System.out.print("Dame el valor b: ");
        b = teclado.nextInt();

        aE = (int) Math.pow(a, 2);
        bE = (int) Math.pow(b, 2);

        r = aE + bE;

        System.out.println(r + " = " + aE + " + " + bE);
    }

    static void ejercicio7(Scanner teclado) {
        int cB, kpr, cpk;

        System.out.println("\n>La curva loca\n");

        System.out.print("Cuanto Km recoreras en total: ");
        kpr = teclado.nextInt();
        System.out.print("Costo por Km: ");
        cpk = teclado.nextInt();

        cB = kpr * cpk;

        System.out.println("El precio del boleto estara a : " + cB);
    }

}
