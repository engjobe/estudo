package estudo;

import java.util.Scanner;
import java.util.Locale;

public class treino13 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double x = entrada.nextDouble();
        double y = entrada.nextDouble();

        double media = x / y;

        System.out.printf("%.3f Km/l\n", media);

        entrada.close ();
    }
    
}