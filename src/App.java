import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String menu;

        System.out.println("\nHola Elige opción:\n1. Ejercicio 1" + "\n2. Ejercicio 2\n" + "3. Ejercicio 3\n"
                + "4. Ejercicio 4\n" + "5. Ejercicio 5\n" + "6. Ejercicio 6\n" + "7. Ejercicio 7\n" + "8. Ejercicio 8\n"
                + "9. Ejercicio 9\n" + "10. Ejercicio 10\n" + "11. Ejercicio 11\n" + "12. Ejercicio 12\n"
                + "13. Ejercicio 13\n" + "14. Ejercicio 14\n" + "0.- Salir");

        System.out.print("Elige una opcion: ");
        menu = teclado.nextLine();

        switch (menu) {
            case "1":
                ejercicio1();
                break;
            case "2":
                ejercicio2();
                break;
            case "3":
                ejercicio3();
                break;
            case "4":
                ejercicio4();
                break;
            case "5":
                ejercicio5();
                break;
            case "6":
                ejercicio6();
                break;
            case "7":
                ejercicio7();
                break;
            case "8":
                ejercicio8();
                break;
            case "9":
                ejercicio9();
                break;
            case "10":
                ejercicio10();
                break;
            case "11":
                ejercicio11();
                break;
            case "12":
                ejercicio12();
                break;
            default:
                System.out.println("chau");
                break;
        }
    }

    static void ejercicio1() {
        int edad;

        System.out.print("Dime la edad que tienes: ");
        edad = teclado.nextInt();

        if (teclado != null) {
            if (edad >= 18) {
                System.out.println("Tu si puedes votar");
            } else if (edad < 18 && edad >= 0) {
                System.out.println("Aun no puedes votar");
            } else if (edad < 0) {
                System.out.println("Esa no es una edad");
            }
        } else {
            System.out.println("Ingresa una edad no dejes el teclado vacio");
        }

    }

    static void ejercicio2() {
        double sueldo;
        int horasTrabajadas, pagoPorHora;

        pagoPorHora = 10;

        System.out.print("Cuantas horas has trabajado: ");
        horasTrabajadas = teclado.nextInt();

        if (teclado != null) {
            if (horasTrabajadas <= 40 && horasTrabajadas >= 1) {
                sueldo = horasTrabajadas * pagoPorHora;
                System.out.println("El sueldo es: " + sueldo);
            } else if (horasTrabajadas > 40) {
                sueldo = horasTrabajadas * pagoPorHora * 2;
                System.out.println("El sueldo es: " + sueldo);
            } else {
                System.out.println("Ingrese correctamente");
            }
        } else {
            System.out.println("Ingresa valores correctamente...");
        }

    }

    static void ejercicio3() {
        int precio;

        System.out.print("\nElige una opcion:\n1. $10.00 o menos" + "\n2. $11.00 a $100.00\n" + "3. $101.00 a $250.00\n"
                + "4. Mas de $251.00\n");
        precio = teclado.nextInt();

        switch (precio) {
            case 1:
                System.out.println("Tarjeta");
                break;
            case 2:
                System.out.println("Chocolate");
                break;
            case 3:
                System.out.println("Flores");
                break;
            case 4:
                System.out.println("Anillo");
                break;
            default:
                System.out.println("No hay product");
                break;
        }
    }

    static void ejercicio4() {
        int horas, cobroPrimario, cobroSecudario, cobroTerceario, cobroMayor, total;

        System.out.print("Cuantas horas utilizo de estacionamiento: ");
        horas = teclado.nextInt();

        if (horas <= 2 && horas >= 1) {
            cobroPrimario = 5;
            total = cobroPrimario * horas;
            System.out.println("Cobro es de $" + total);
        } else if (horas > 2 && horas <= 5) {
            cobroPrimario = 5;
            cobroSecudario = 4;
            total = (cobroSecudario * (horas - 2)) + (cobroPrimario * 2);
            System.out.println("Cobro es de $" + total);
        } else if (horas > 5 && horas <= 10) {
            cobroPrimario = 5;
            cobroSecudario = 4;
            cobroTerceario = 3;
            total = (cobroTerceario * (horas - 5)) + (cobroPrimario * 2) + (cobroSecudario * 3);
            System.out.println("Cobro es de $" + total);
        } else {
            cobroPrimario = 5;
            cobroSecudario = 4;
            cobroTerceario = 3;
            cobroMayor = 2;
            total = (cobroMayor * (horas - 10)) + (cobroPrimario * 2) + (cobroSecudario * 3) + (cobroTerceario * 5);
            System.out.println("Cobro es de $" + total);
        }
    }

    static void ejercicio5() {
        String n1, n2, n3;
        int e1, e2, e3;

        System.out.print("1p. Ingresa tu nombre: ");
        n1 = teclado.next();
        System.out.print("1p. Ingresa tu edad: ");
        e1 = teclado.nextInt();
        System.out.print("2p. Ingresa tu nombre: ");
        n2 = teclado.next();
        System.out.print("2p. Ingresa tu edad: ");
        e2 = teclado.nextInt();
        System.out.print("3p. Ingresa tu nombre: ");
        n3 = teclado.next();
        System.out.print("3p. Ingresa tu edad: ");
        e3 = teclado.nextInt();

        if (e1 < e2 && e1 < e3) {
            System.out.println(n1 + "=" + e1);
        } else if (e2 < e1 && e2 < e3) {
            System.out.println(n2 + "=" + e2);
        } else if (e3 < e2 && e3 < e1) {
            System.out.println(n3 + "=" + e3);
        }
    }

    static void ejercicio6() {
        float precio, res;

        System.out.print("Dime el precio del articulo: ");
        precio = teclado.nextFloat();

        if (precio >= 200) {
            res = precio / 15;
            System.out.println("El precio a pagar es: " + res);
        } else if (precio < 200 && precio > 100) {
            res = precio / 12;
            System.out.println("El precio a pagar es: " + res);
        } else if (precio < 100 && precio >= 1) {
            res = precio / 10;
            System.out.println("El precio a pagar es: " + res);
        } else {
            System.out.println("error");
        }
    }

    static void ejercicio7() {
        int edad;
        double promedio;

        System.out.print("Dime tu edad: ");
        edad = teclado.nextInt();

        System.out.print("Dime el promedio: ");
        promedio = teclado.nextDouble();

        if (edad > 18) {
            if (promedio >= 9) {
                System.out.println("La beca es de $2000.00");
            } else if (promedio >= 7.5 && promedio < 9) {
                System.out.println("La beca es de $1000.00");
            } else if (promedio < 7.5 && promedio >= 6) {
                System.out.println("La beca es de $500.00");
            } else {
                System.out.println("Esta es una carta de incitacion a los estudiantes...");
            }
        } else if (edad <= 18 && edad >= 1) {
            if (promedio >= 9) {
                System.out.println("La beca es de $3000.00");
            } else if (promedio < 9 && promedio >= 8) {
                System.out.println("La beca es de $2000.00");
            } else if (promedio < 8 && promedio >= 6) {
                System.out.println("Esta es una carta de incitacion a los estudiantes...");
            }
        } else {
            System.out.println("Ingresa una edad correcta....");
        }
    }

    static void ejercicio8() {
        int años, elecion, sueldo, res;

        System.out.println("Elige una de las opciones:\n 1. Por antiguedad \n 2. Por sueldo ");
        elecion = teclado.nextInt();

        switch (elecion) {
            case 1:
                System.out.print("Cuantos años vas en la empresa: ");
                años = teclado.nextInt();
                System.out.println("Cuanto recibes de sueldo: ");
                sueldo = teclado.nextInt();

                if (años > 2 && años <= 5) {
                    // 20%
                    res = sueldo / 80;
                    System.out.println("El bono a recibir es de " + res);
                } else if (años > 5) {
                    // 30%
                    res = sueldo / 70;
                    System.out.println("El bono a recibir es de " + res);
                } else {
                    System.out.println("No Hay bono para ti");
                }
                break;
            case 2:
                System.out.print("Cuantos años vas en la empresa: ");
                años = teclado.nextInt();
                System.out.println("Cuanto recibes de sueldo: ");
                sueldo = teclado.nextInt();
                if (sueldo < 1000 && sueldo >= 1) {
                    // 25%
                    res = sueldo / 75;
                    System.out.println("El bono a recibir es de " + res);
                } else if (sueldo > 1000 && sueldo <= 3500) {
                    // 15%
                    res = sueldo / 85;
                    System.out.println("El bono a recibir es de " + res);
                } else if (sueldo > 3500) {
                    // 10%
                    res = sueldo / 90;
                    System.out.println("El bono a recibir es de " + res);
                } else {
                    System.out.println("No Hay bono para ti");
                }
                break;

            default:
                System.out.println(" No hay nada para ti err");
                break;
        }
    }

    static void ejercicio9() {
        int tipoPoliza, edad, costoPoliza, costoBase;
        String nombre;
        boolean bA, uL, pE;

        System.out.print("Elige una de las opciones:\n1. Poliza A \n2. Poliza B \n");
        tipoPoliza = teclado.nextInt();

        System.out.print("Dame tu nombre: ");
        nombre = teclado.next();
        System.out.print("Cuantos años tienes: ");
        edad = teclado.nextInt();

        System.out.println(" ");
        System.out.println("Ingrese true = si y false = no....");
        System.out.println(" ");

        System.out.print("Consumes alcohol: ");
        bA = teclado.nextBoolean();
        System.out.print("Usas lentes: ");
        uL = teclado.nextBoolean();
        System.out.print("Padeses alguna emfermedad: ");
        pE = teclado.nextBoolean();

        // proceso
        if (tipoPoliza == 1) {
            costoBase = 1200;
        } else {
            costoBase = 950;
        }
        if (bA == true) {
            costoBase += (costoBase * 0.10);
        }
        if (uL == true) {
            costoBase += (costoBase * 0.05);
        }
        if (pE == true) {
            costoBase += (costoBase * 0.05);
        }
        if (edad > 40) {
            costoBase += (costoBase * 0.20);
        } else {
            costoBase += (costoBase * 0.10);
        }
        costoPoliza = costoBase;
        // Datos de salida
        System.out.println("Hola " + nombre + " el costo de la poliza a pagar es: " + costoPoliza);

    }

    static void ejercicio10() {
        int km, cobro, eleccion;

        System.out.println("Cuanto cobras por recorrido: ");
        km = teclado.nextInt();

        System.out.println("A donde iras en estas vaciones: \n 1. Mexico\n 2. P.V\n  3. Acapulco\n  4. Cancun \n ");
        eleccion = teclado.nextInt();

        if (eleccion == 1) {
            cobro = (km * 750) * 2;
            System.out.println("Precio a pagar " + cobro);
        } else if (eleccion == 2) {
            cobro = (km * 800) * 2;
            System.out.println("Precio a pagar " + cobro);
        } else if (eleccion == 3) {
            cobro = (km * 1200) * 2;
            System.out.println("Precio a pagar " + cobro);
        } else if (eleccion == 4) {
            cobro = (km * 1800) * 2;
            System.out.println("Precio a pagar " + cobro);
        }
    }

    static void ejercicio11() {
        int año;

        System.out.println("Cuantos años vas trabajando: ");
        año = teclado.nextInt();

        if (año == 1) {
            System.out.println("Se le dara $100");
        } else if (año >= 2 && año <= 5) {
            System.out.println("se les dara $200");
        } else if (año > 5) {
            System.out.println("se les dara $1000");
        } else {
            System.out.println("ingrese bien el año");
        }
    }

    static void ejercicio12() {
        int horasT, cobro, pHora;

        System.out.println("Cuanto es el pago por hora: ");
        pHora = teclado.nextInt();

        System.out.println("Cuantas horas has trabajado: ");
        horasT = teclado.nextInt();

        if (horasT < 41 && horasT >= 1) {
            cobro = pHora * horasT;
            System.out.println("El pago a recibir es: " + cobro);
        } else if (horasT >= 41 && horasT <= 45) {
            cobro = (pHora * horasT) * 2;
            System.out.println("El pago a recibir es: " + cobro);
        } else if (horasT >= 46 && horasT <= 50) {
            cobro = (pHora * horasT) * 3;
            System.out.println("El pago a recibir es: " + cobro);
        } else if (horasT > 50) {
            System.out.println("Trabajar mas de 50H no esta permitido...");
        } else {
            System.out.println("Ingrese bien las horas de trabajo... ");
        }

    }
}