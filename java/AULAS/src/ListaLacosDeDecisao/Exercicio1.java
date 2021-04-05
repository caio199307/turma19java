package ListaLacosDeDecisao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1,num2,num3,maiorNum = 0,menorNum = 0;
		
		System.out.println("Digite o 1º número");
		num1 = leia.nextInt();
		System.out.println("Digite o 2º número");
		num2 = leia.nextInt();
		System.out.println("Digite o 3º número");
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3) 
		{
			maiorNum = num1;
		}
		else if (num2 > num1 && num2 > num3)
		{
			maiorNum = num2;
		}
		else
		{
			maiorNum = num3;
		}
		
		if (num1 < num2 && num1 < num3) 
		{
			menorNum = num1;
		}
		else if (num2 < num1 && num2 < num3)
		{
			menorNum = num2;
		}
		else
		{
			menorNum = num3;
		}
		
		
		System.out.println("O maior número é: "+maiorNum+" e o menor número é: "+menorNum);
	}

}
