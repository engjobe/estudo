package estudo;

import java.util.Scanner;

public class treino13 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        float x = entrada.nextFloat();
        float y = entrada.nextFloat();

        float media = x / y;

        //System.out.println(media);
        System.out.printf("%.3f Km/l%n", media);

        entrada.close ();
    }
    
}