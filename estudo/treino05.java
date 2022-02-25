package estudo;

import java.util.Scanner;

public class treino05 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, media;

        //System.out.println("Digite a nota A:");
        a = entrada.nextDouble();

        //System.out.println("Digite a nota B:");
        b = entrada.nextDouble();

        media = (a * 3.5 + b * 7.5) / 11;

        System.out.println(String.format("MEDIA = %.5f", media));

        entrada.close ();
    }
    
}