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
			System.out.println("Digite um número");
			num1 = leia.nextDouble();
			
			if(num1 % 3 == 0)
			{
				multiplosParaSomar += num1;
				contador++;
			}
			
			
		}while(num1 != 0);
		media = multiplosParaSomar / contador;
		System.out.printf("\nDos números digitados %.2f eram multiplos de 3\n",contador);
		System.out.printf("A média dos números digitados que são multiplos de 3 é de %.2f",media);
	}
}
