package estudo;

import java.util.Scanner;

public class treino08 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double salario = 0, vendas, total;

        nome = entrada.next();
        salario = entrada.nextDouble();
        vendas = entrada.nextDouble();

        total = salario + vendas * 0.15;

        System.out.println(nome);
        System.out.printf("TOTAL = R$ %.2f\n", total);

        entrada.close ();
    }
    
}