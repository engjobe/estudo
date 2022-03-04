package estudo;

import java.util.Scanner;

public class treino10 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio, volume;

        raio = entrada.nextDouble();

        //volume = (4.0/3) * 3.14159 * raio * raio * raio;
        volume = (4.0 / 3) * 3.14159 * Math.pow(raio, 3.0);

        System.out.printf("VOLUME = %.3f\n", volume);

        entrada.close ();
    }
    
}