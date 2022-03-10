package estudo;

import java.util.Scanner;
import java.util.Locale;

public class treino17 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int valor = entrada.nextInt();
       
        int horas = valor / 3600;
        int restoHoras = valor % 3600;
       
        int minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;
       
        int segundos = restoMinutos;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        entrada.close ();
    }
    
}