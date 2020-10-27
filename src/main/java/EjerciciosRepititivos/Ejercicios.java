package EjerciciosRepititivos;

import java.util.Scanner;
import java.util.Random;

public class Ejercicios {

    static Scanner teclado = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        System.out.println("\n\n@Davichois");
        System.out.println("******** H O L A  B I E N V E N I D O ********");

        menuDeOpciones();
    }

    public static void menuDeOpciones() {
        int opcion;

        System.out.println(
                "\nMenu:\n[1] Definidor de Salario\n[2] El naufrago satisfecho\n[3] Indentificador de numeros ");
        System.out.print("\n=> ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                ejecicio1();
                preguntaUsuario();
                break;
            case 2:
                ejercicio2();
                preguntaUsuario();
                break;
            case 3:
                ejercicio3();
                preguntaUsuario();
                break;
            case 4:
                ejercicio4();
                preguntaUsuario();
                break;
            case 5:
                ejercicio5();
                preguntaUsuario();
                break;
            case 6:
                ejercicio6();
                preguntaUsuario();
                break;
            case 7:
                ejercicio7();
                preguntaUsuario();
                break;
            default:
                System.out.println("No es una Opcion, vuelve a intentarlo...");
                menuDeOpciones();
        }
    }

    public static void preguntaUsuario() {
        int pregunta;

        System.out.println("\nDeseas volver al menu:....");
        System.out.print("[1] SI\n[2] NO\n=>");
        pregunta = teclado.nextInt();

        if (pregunta == 1) {
            menuDeOpciones();
        } else if (pregunta == 2) {
            System.out.println("Gracias.....");
        } else {
            System.out.println("Esa opcion no existe... Vuelvelo a intentarlo");
            preguntaUsuario();
        }
    }

    public static void ejecicio1() {
        int salario;
        double bonus, salarioFinal = 0;

        System.out.print("\nDime tu salario: ");
        salario = teclado.nextInt();

        for (int i = 1; i <= 6; i++) {

            bonus = (salario * 0.10) * i;
            salarioFinal = salario + bonus;
            System.out.println("Año: " + i + " : " + salarioFinal);
        }

        System.out.println("Salario Final: " + salarioFinal);
    }

    public static void ejercicio2() {
        int hS = 0, hD = 0, hT = 0, pS, pD, pT, eP;
        double cP = 0.05, pagoFinal = 0, mT;

        System.out.println("El naufrago satisfecho\n");

        System.out.print("Cuantas Haburguesas Simples compraras: ");
        hS = teclado.nextInt();
        System.out.print("Cuantas Haburguesas Dobles compraras: ");
        hD = teclado.nextInt();
        System.out.print("Cuantas Haburguesas Triples compraras: ");
        hT = teclado.nextInt();

        pS = 20 * hS;
        pD = 25 * hD;
        pT = 28 * hT;

        System.out.print("\nElija un metodo de paga:\n[1]Tajeta\n[2]Efectivo\n=> ");
        eP = teclado.nextInt();

        if (eP == 1) {
            mT = (pS + pD + pT) * cP;
            pagoFinal = pS + pD + pT + mT;
        } else {
            pagoFinal = (pS + pD + pT);
        }

        System.out.println("Monto a pagar: " + pagoFinal);
    }

    public static void ejercicio3() {
        int pregunta, cero = 0, mayoresCero = 0, menoresCero = 0, n;

        System.out.println("Cuantos numeros quieres ingresar: ");
        n = teclado.nextInt();

        int numeros[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa un numero: ");
            pregunta = teclado.nextInt();
            numeros[i] = pregunta;
            if (numeros[i] == 0) {
                cero++;
            } else if (numeros[i] > 0) {
                mayoresCero++;
            } else if (numeros[i] < 0) {
                menoresCero++;
            }
        }
        System.out.println("\n\nNumeros igual a 0: " + cero);
        System.out.println("Numeros mayores a 0: " + mayoresCero);
        System.out.println("Numeros menores a 0: " + menoresCero);

    }

    public static void ejercicio4() {
        int pesos = 1, año = 365, multiplicador = 3, res = 0;
        System.out.println("Diarimente: ");
        for (int i = 1; i <= año; i++) {
            res = pesos * multiplicador;
            pesos = res;
            System.out.println(i + " : " + pesos);
        }
        System.out.println("En un año la persona ahorra: " + res);

    }

    public static void ejercicio5() {
        int articulos = 50, preciofactura, precio;
        double precioTotal = 0;

        precio = rnd.nextInt(7);
        preciofactura = precio * articulos;

        if (preciofactura >= 200) {
            // 15%
            precioTotal = preciofactura - (preciofactura * 0.15);
        } else if (preciofactura >= 100 && preciofactura < 200) {
            // 12%
            precioTotal = preciofactura - (preciofactura * 0.12);
        } else if (preciofactura > 0 && preciofactura < 100) {
            precioTotal = preciofactura - (preciofactura * 0.10);
        } else {
            System.out.println("Error");
        }
        System.out.println("Precio total: " + preciofactura);
        System.out.println("Precio total aplicando descuento : " + precioTotal);
    }

    public static void ejercicio6() {
        int alumnos, calificacion = 0, a = 0, d = 0;
        alumnos = rnd.nextInt(40);
        for (int i = 0; i < alumnos; i++) {
            calificacion = rnd.nextInt(20);
            if (calificacion >= 13) {
                a++;
            } else if (calificacion < 13) {
                d++;
            } else {
                System.out.println("error");
            }
        }

        System.out.println("La cantidad de aprobados es: " + a);
        System.out.println("La cantidad de desaprobados es: " + d);
    }

    public static void ejercicio7() {
        int cantidadM = 0, año;
        double sumaP, totalA = 0;

        cantidadM = rnd.nextInt(10);
        año = rnd.nextInt(10) - 0;

        for (int i = 1; i <= año; i++) {
            if (i > 0 && i <= 1) {
                cantidadM = cantidadM * 12;
                sumaP = cantidadM * 0.10;
                totalA = cantidadM + sumaP;
                System.out.println("Año" + " : " + "Total");
                System.out.println(i + "   : " + totalA);
                i++;
            } else {
                totalA = totalA + cantidadM;
                System.out.println(i + "   : " + totalA);
            }
        }
    }

}
