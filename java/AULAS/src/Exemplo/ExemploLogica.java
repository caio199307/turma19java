package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploLogica {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int numero;
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		parImpar(numero);
		
		System.out.println("Fim de programa");
		linha();
	}
	
	public static void parImpar(int numero) {
		if(numero%2==0 && numero > 0 || numero ==0)  {
			System.out.println("Número par");
			linha();
		}
		else if (numero%2==1 && numero > 0) {
			System.out.println("Número ímpar");
			linha();
		}
		
	}
	public static void linha() {
		System.out.println("-------------------------------------------------");
	}
}
