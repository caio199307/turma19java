package Exemplo;

import java.util.Scanner;

public class AnosDiasVida {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ano,mes,dia,diasVida;
		
		System.out.println("Digite quantos anos você tem: ");
		ano = leia.nextInt();
		System.out.println("digite quando meses você tem: ");
		mes = leia.nextInt();
		System.out.println("digite quantos dias você tem: ");
		dia = leia.nextInt();
				
				diasVida = ((ano*365)+mes*30)+dia;
		System.out.println("você tem: "+diasVida+" dias de vida.");
		
	}

}
