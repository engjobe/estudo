package estudo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.io.IOException;

public class formataVariavel {
    public static void main(String[] args) throws IOException {

		//double dval = 29.56891;
		double dval;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor desejado");
		dval= teclado.nextDouble();
		
		System.out.println("O valor da variável é "+dval);
		String format="0.00";
		NumberFormat formatter = new DecimalFormat(format);
		String valorFinal = formatter.format(dval);
		System.out.println("O novo valor formatado é "+ valorFinal);

        teclado.close();

	}
}