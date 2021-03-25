package Exemplo;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1,nota2,nota3,media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		media = ((2*nota1)+(3*nota2)+(5*nota3))/10;
		
		System.out.printf("sua média é de: %.2f",media);
		
	}
}
