package guia3java_ejercicio6;

import EntCafetera.EntidadesCafetera;
import ServiceCafetera.ServiceCafetera;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean z = false;
        EntidadesCafetera B = new EntidadesCafetera();
        ServiceCafetera sc = new ServiceCafetera();
        z = sc.Menu(z);
        if (z == true) {
            System.out.println("Programa finalizado");

        }

    }
}
