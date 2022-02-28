package estudo;

import java.util.Scanner;

public class treino07 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, hora;
        double valor, salario;

        numero = entrada.nextInt();
        hora = entrada.nextInt();
        valor = entrada.nextDouble();

        salario = hora * valor;

        System.out.println("NUMBER = " + numero);
        System.out.println(String.format("SALARY = U$ %.2f", salario));

        entrada.close ();
    }
    
}