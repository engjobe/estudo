package estudo;

import java.util.Scanner;

public class treino13 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x = entrada.nextDouble();
        double y = entrada.nextDouble();

        double media = x / y;

        System.out.printf("%.3f km/l\n", media);

        entrada.close ();
    }
    
}