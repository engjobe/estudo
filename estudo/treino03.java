package estudo;

import java.util.Scanner;

public class treino03 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, x;
        a = entrada.nextInt();
        b = entrada.nextInt();

        x = a + b;

        System.out.println("X = " + x);

        entrada.close ();
    }
 
}