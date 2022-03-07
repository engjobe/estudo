package estudo;

import java.io.IOException;
import java.util.Scanner;

public class treino14 {
    public static void main (String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

         double x1, x2, y1, y2, distancia;

        x1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        y2 = entrada.nextDouble();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(String.format("%.4f", distancia));

        entrada.close ();
    }
    
}