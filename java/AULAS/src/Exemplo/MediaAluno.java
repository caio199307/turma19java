package Exemplo;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nota1,nota2,nota3,media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("Digite a segunda: ");
		nota2 = leia.nextInt();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextInt();
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("sua média é de: "+media);
		
	}
}
