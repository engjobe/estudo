package estudo;

import java.util.Scanner;
import java.util.Locale;

public class peso {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual seria o seu peso em outros mundos?\n");
        System.out.println("Digite o seu peso em Kg");
        double seuPeso = entrada.nextDouble();

        System.out.printf("Mercúrio: %.1f Kg\n", seuPeso * 0.37);
        System.out.printf("Vênus: %.1f Kg\n", seuPeso * 0.88);
        System.out.printf("Terra: %.1f Kg\n", seuPeso);
        System.out.printf("Lua: %.1f Kg\n", seuPeso * 0.1);
        System.out.printf("Marte: %.1f Kg\n", seuPeso * 0.38);
        System.out.printf("Júpiter: %.1f Kg\n", seuPeso * 2.64);
        System.out.printf("Saturno: %.1f Kg\n", seuPeso * 1.15);
        System.out.printf("Urano: %.1f Kg\n", seuPeso * 1.17);
        System.out.printf("Netuno: %.1f Kg\n", seuPeso * 1.18);
        System.out.printf("Plutao: %.1f Kg\n", seuPeso * 0.11);

        entrada.close ();
    }
}