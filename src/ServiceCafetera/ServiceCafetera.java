package ServiceCafetera;

import EntCafetera.EntidadesCafetera;
import java.util.Scanner;

public class ServiceCafetera {

    EntidadesCafetera cafetera = new EntidadesCafetera();
    Scanner leer = new Scanner(System.in);

    public boolean Menu(boolean a) {

        int op;
        int capacidadMaxima;
        int vaciar = 0;
        int contenidoAcutal = 0;

        System.out.println("Cuanto es la capacidad maxima de la cafetera");
        capacidadMaxima = leer.nextInt();

        do {
            System.out.println("Cantidad Actual " + cafetera.getCantidadActual() + "ml de cafe");
            System.out.println("***********************");
            System.out.println("*                     *");
            System.out.println("* Elija una opción:   *");
            System.out.println("* 1 - Llenar cafetera *");
            System.out.println("* 2 - Servir taza     *");
            System.out.println("* 3 - Vaciar cafetera *");
            System.out.println("* 4 - Agregar cafe    *");
            System.out.println("* 5 - Salir           *");
            System.out.println("*                     *");
            System.out.println("***********************");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    cafetera.setCantidadActual(capacidadMaxima);

                    System.out.println("La cafetera ha sido llenada");

                    break;
                case 2:
                    System.out.println("Indique la capacidad de la taza que desea servir");
                    int taza = leer.nextInt();

                    if (taza > cafetera.getCantidadActual()) {

                        System.out.println("La taza no pudo llenarse porque la cantidad actual de cafe no alcanza como para llenarla.\nPara terminar de llenarla falta : " + (taza - cafetera.getCantidadActual()) + "ml");
                    } else {

                        cafetera.setCantidadActual(servirTaza(taza, cafetera.getCantidadActual()));
                        System.out.println("La taza fue llenada.");
                    }
                    break;
                case 3:
                    cafetera.setCantidadActual(vaciar);

                    System.out.println("La cafetera fue vaciada.");
                    break;
                case 4:
                    System.out.println("Cuanto cafe desea agregar?:");

                    int agregar = leer.nextInt();

                    if (capacidadMaxima < agregar + cafetera.getCantidadActual()) {

                        cafetera.setCantidadActual(capacidadMaxima);
                        System.out.println("Lo sentimos pero la cafetera se lleno solamente hasta su capacidad maxima que es : " + capacidadMaxima + "ml");
                    } else {

                        cafetera.setCantidadActual(agregarCafe(agregar, cafetera.getCantidadActual()));
                        System.out.println("Se agrego a la cafetera");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Numero no valido");
            }

        } while (op != 5);
        return a = true;
    }

// SERVIR UNA TAZA
    public int servirTaza(int a, int b) {
        // cantidad actual de cafe a y capacidad de la taza b
        return b - a;
    }
// VACIAR CAFETERA

    public int vaciar(int a, int b) {
        return a * 0;
    }

// RELLENAR CAFETERA
    // cantidad actual de cafe a y agregacion del cafe b
    public int agregarCafe(int a, int b) {
        return b + a;
    }

}
