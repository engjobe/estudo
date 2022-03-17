package estudo;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
		
		// Aqui iremos pegar o valor digitado no teclado
		Scanner entrada = new Scanner(System.in);
		// Aqui criei uma variável para receber o valor numérico
		int numero_tabuada;
		// Aqui vou mostrar a mensagem na tela
		System.out.println("Informe o valor para executar a tabuada");
		// Aqui vou atribuir o valor que digitei no teclado a variável 
		numero_tabuada =entrada.nextInt();
		
		// Criar o laço de repetição do nosso processo da tabuada 
		for(int contador=1; contador<=10; contador++) {
			System.out.println(contador+" x "+numero_tabuada+" = "+(contador*numero_tabuada));
		}	

        entrada.close();
	}
}