package ListaLacosDeDecisao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Digite o 1� n�mero");
		num1 = leia.nextInt();
		System.out.println("Digite o 2� n�mero");
		num2 = leia.nextInt();
		System.out.println("Digite o 3� n�mero");
		num3 = leia.nextInt();
		
		if(num1 < num2)
		{
			if(num2 < num3)
			{
				System.out.println(num1+"-"+num2+"-"+num3);
			}
			else if(num1 < num3)
			{
				System.out.println(num1+"-" + num3 +"-"+ num2);
			}
		}
		if(num2 < num1)
		{
			if(num1 < num3)
			{
				System.out.println(num2+"-" + num1 +"-"+ num3);
			}
			else if(num2 < num3)
			{
				System.out.println(num2+"-" + num3 +"-"+ num1);
			}
		}
		if(num3 < num2)
		{
			if(num2 < num1)
			{
				System.out.println(num3+"-" + num2 +"-"+ num1);
			}
			else if(num3 < num1)
			{
				System.out.println(num3+"-" + num1 +"-"+ num2);
			}
		}
	}

}
