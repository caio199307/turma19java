package Exemplo;

import java.util.Scanner;

public class IdadeCalculo {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a; 
		int b;
		int soma;
		System.out.println("digite o valor 1 ");
		a = leia.nextInt();
		System.out.println("digite o valor 2 ");	
		b = leia.nextInt();
		
		soma = a + b;
		System.out.println("a soma dos valores é "+soma);
		
		
		
	}
}
