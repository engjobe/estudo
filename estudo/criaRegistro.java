package estudo;

import java.util.Scanner;

public class criaRegistro {
    public static void main(String[] args) {

		String[] produtos = new String[5];
		Scanner entrada = new Scanner(System.in);
		
		for(int contador=0; contador<5; contador++) {
		    System.out.println("Insira o "+contador+" º, produto:" );
		    produtos[contador]=entrada.next();
		}
		
		// Laço de Repetição 
		int contagem=1;
		for(int retorno=0; retorno<5; retorno++) {
			System.out.println(contagem+"-"+produtos[retorno]);
			contagem++;
		}

        entrada.close();

	}
}