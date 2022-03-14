package estudo;

import java.util.Scanner;
import java.util.Locale;

public class treino19 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int idade = entrada.nextInt();
        int atual = idade;
        int anos = atual / 365;
        atual = atual - anos * 365;
        int meses = atual / 30;
        atual = atual - meses * 30;
        int dias = atual;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        entrada.close ();
    }
} 