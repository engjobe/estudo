package estudo;

import java.util.Scanner;
import java.util.Locale;

public class peso {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu peso em Kg");
        double peso = entrada.nextDouble();

        System.out.printf("Mercúrio: %.1f Kg\n", peso * 0.37);
        System.out.printf("Vênus: %.1f Kg\n", peso * 0.88);
        System.out.printf("Terra: %.1f Kg\n", peso);
        System.out.printf("Lua: %.1f Kg\n", peso * 0.1);
        System.out.printf("Marte: %.1f Kg\n", peso * 0.38);
        System.out.printf("Júpiter: %.1f Kg\n", peso * 2.64);
        System.out.printf("Saturno: %.1f Kg\n", peso * 1.15);
        System.out.printf("Urano: %.1f Kg\n", peso * 1.17);
        System.out.printf("Netuno: %.1f Kg\n", peso * 1.18);
        System.out.printf("Plutao: %.1f Kg\n", peso * 0.11);

        entrada.close ();
    }
}