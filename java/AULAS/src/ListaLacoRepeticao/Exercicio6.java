package ListaLacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1=0;
		double media;
		double contador=0;
		double multiplosParaSomar=0;
		do
		{
			System.out.println("Digite um n�mero");
			num1 = leia.nextDouble();
			
			if(num1 % 3 == 0)
			{
				multiplosParaSomar += num1;
				contador++;
			}
			
			
		}while(num1 != 0);
		media = multiplosParaSomar / contador;
		System.out.printf("\nDos n�meros digitados %.2f eram multiplos de 3\n",contador);
		System.out.printf("A m�dia dos n�meros digitados que s�o multiplos de 3 � de %.2f",media);
	}
}
