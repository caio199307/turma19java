package Exemplo;

import java.util.Scanner;

public class leandro1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double notas[] = new double[5];
		double media=0;
	
		for(int x=0;x<5;x++)
		{
			System.out.printf("Digite a nota  %d: ",(x+1));
			
			notas[x] = leia.nextDouble();
			media = media + notas[x];
		}
	media = media/5;
	System.out.println("a media é "+media);
	}
}
