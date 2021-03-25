package Exemplo;

import java.util.Scanner;

public class DiasAnosVida {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dias,dia,mes,ano;
		
		System.out.println("Digite quantos dias de vida você tem ");
		dias = leia.nextInt();
		
		ano = dias/365;
		mes = dias%365/30;
		dia = dias%365%30;
		System.out.println("você tem "+ano+" anos, "+mes+" meses e "+dia+" dias de vida.");
		
	}
}
