package Exemplo;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//linha, coluna
		int matrizQ[][] = new int[3][3];
		for (int linha=0; linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.printf("Digite o valor da linha %d coluna %d:",linha,coluna);
				matrizQ[linha][coluna] = leia.nextInt();
				
			}
		}
		for (int linha=0; linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
			System.out.print(matrizQ[linha][coluna]+ " ");
				
			}
			System.out.println();
		}
		
		
	}
}
