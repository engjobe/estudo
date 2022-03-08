package estudo;

import java.util.Scanner;
import java.util.Locale;

public class treino16 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int tempo, velocidade;
        double kilometro, litro;

        tempo = entrada.nextInt();
        velocidade = entrada.nextInt();

        kilometro = tempo * velocidade;
        litro = (kilometro) / 12;

        System.out.printf("%.3f", litro);

        entrada.close ();
    }
    
}