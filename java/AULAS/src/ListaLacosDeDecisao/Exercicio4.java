package ListaLacosDeDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num1;
		double raiz,elevado;
		System.out.println("Digite um número");
		num1 = leia.nextInt();
		
		if(num1 %2 == 0)
		{
			raiz = Math.sqrt(num1);
			System.out.printf("A raíz quadrada do número par é: %.2f",raiz);
		}
		else if (num1 %2 ==1)
		{
			elevado = Math.pow(num1, 2);
			System.out.printf("O número ímpar elevado ao quadrado é: %.2f",elevado);
		}
		else
		{
			System.out.println("Você não digitou um número valido.");
		}
	}

}
