package estudo;

import java.util.Scanner;
import java.util.Locale;

public class treino15 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int distancia, tempo;

        distancia = entrada.nextInt();

        tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        entrada.close ();
    }
    
}