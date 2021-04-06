package Exemplo;

import java.util.Scanner;

public class HabitantesLacoPara {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final double HABITANTES = 2; //Palavra final mostra que é uma constante, e as letras maiúsculas reforçam isso.
		double salario = 0.00;
		double numeroFilhos = 0.00;
		double totalFilhos = 0.00;
		double mediaSalario = 0.00;
		double totalSalario = 0.00; //dentro do laço
		double mediaFilhos = 0.00;
		double maiorSalario = 0.00;
		double percentualPessoasSalarioAte100 = 0.00;
		double contadorPessoasSalario100 = 0.00;
		
		for(int x=1;x<=HABITANTES;x++)
		{
			System.out.print("Informe o salário do habitante "+x+" R$");
			salario = leia.nextDouble();
			System.out.println("Informe a quantidade de filhos do habitante "+x);
			numeroFilhos = leia.nextDouble();
			totalSalario =  totalSalario + salario; //totalSalario += salario"
			totalFilhos += numeroFilhos;
			if(salario > maiorSalario)
			{
				maiorSalario = salario;
			}
			if(salario <= 100)
			{
				contadorPessoasSalario100++;
			}
		}
		mediaSalario = totalSalario/HABITANTES;
		mediaFilhos = totalFilhos/HABITANTES;
		percentualPessoasSalarioAte100 = ((contadorPessoasSalario100 / HABITANTES)*100);
		//contar pessoas que ganham até 100 / pelos habitantes e depois * por 100
		System.out.printf("\nMédia de filhos é: %.2f",mediaFilhos);
		System.out.printf("\nO percentual de pessoas que ganham até R$100 é: %.2f",percentualPessoasSalarioAte100);
		System.out.printf("\nO maior salário é de R$%.2f",maiorSalario);
		System.out.printf("\nO total dos salários é de R$%.2f",totalSalario);
		System.out.printf("\nMédia de salários é: R$%.2f",mediaSalario);
	}
}
