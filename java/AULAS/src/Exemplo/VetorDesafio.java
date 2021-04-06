//nome de 4 pessoas vetor
//nota das 4 pessoas vetor
//nota é int entre 1 a 10
//dpeois mostrar o nome a nota e se a pessoa teve nota até 5, coloque "ainda não", se foi acima de 5, coloque "Muito bem"

package Exemplo;

import java.util.Scanner;

public class VetorDesafio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String pessoas[] = new String[4];
		Double notas[] = new Double[4];
		
		for(int x = 0 ; x < pessoas.length; x++)
		{
			System.out.println("Digite o seu nome:");
			pessoas[x] = leia.next();
			System.out.println("Digite a nota");
			notas[x] = leia.nextDouble();
		}
		for(int x = 0 ; x < pessoas.length; x++)
		{
			if(notas[x]<=5)
			{
			System.out.printf("%s, sua nota foi %.2f e não passou\n",pessoas[x],notas[x]);
			}
			else
			{
				System.out.printf("%s, sua nota foi %.2f e foi aprovado\n",pessoas[x],notas[x]);
			}
		}
		
	}
}
