package ListaLacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1;
		int contadorPar=0,contadorImpar=0;
		
		for(int x = 1; x <= 10 ; x++ )
		{
			System.out.println("Digite o "+x+"� n�mero");
			num1 = leia.nextInt();
			
			if(num1 % 2 == 0)
			{
				contadorPar++;
			}
			if(num1 % 2 == 1)
			{
				contadorImpar++;
			}
		}
		System.out.println(contadorPar+" s�o pares e "+contadorImpar+" s�o �mpares.");
		
	}

}
