package estudo;

import java.io.IOException;
import java.util.Scanner;

public class treino09 {
    public static void main (String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        double c = entrada.nextDouble();

        int d = entrada.nextInt();
        int e = entrada.nextInt();
        double f = entrada.nextDouble();
        
        double resultado = (b*c)+(e*f);

        System.out.println("código das peças: " + a + " e " + d);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);
        
        entrada.close ();
    }
    
}