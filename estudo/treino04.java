package estudo;

import java.util.Scanner;

public class treino04 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, area;

        raio = entrada.nextDouble();

        area = 3.14159 * (raio * raio);

        System.out.println(String.format("A=%.4f", area));  

        entrada.close ();
    }
    
}