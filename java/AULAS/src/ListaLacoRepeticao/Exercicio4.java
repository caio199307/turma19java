package ListaLacoRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int pessoasCalmas =0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasMais40Anos = 0;
		int pessoasCalmasMenos18Anos = 0;
		int idade=0;
		char sexo=0;
		char opcao=0;
		int contador =0;
		System.out.print("Você deseja fazer a pesquisa? 'S' ou 'N'");
		char continua = leia.next().toUpperCase().charAt(0);
		while(continua == 'S' && contador <= 3)
		{
			System.out.print("informe sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite 1 para fem, 2 para masc e 3 para outros");
			sexo = leia.next().charAt(0);
			System.out.print("Digite:\n1 se calmo\n2 se nervoso\n3 se agressivo");
			opcao = leia.next().charAt(0);
			
			if(contador != 3)
			{
			System.out.print("Você deseja fazer a pesquisa? 'S' ou 'N'");
			continua = leia.next().toUpperCase().charAt(0);
			}
			contador++;
		
		if(opcao == '1')
		{
			pessoasCalmas++;
		}
		if (sexo == '1' && opcao == '2')
		{
			mulheresNervosas++;
		}
		if(sexo == '2' && opcao == '3')
		{
			homensAgressivos++;
		}
		if(sexo == '3' && opcao == '1')
		{
			outrosCalmos++;
		}
		if (opcao == '2' && idade >=40)
		{
			pessoasNervosasMais40Anos++;
		}
		if(opcao == '1' && idade <= 18)
		{
			pessoasCalmasMenos18Anos++;
		}
		}
		System.out.println("pessoas calmas " +pessoasCalmas); 
		System.out.println("mulheres nervosas "+mulheresNervosas); 
		System.out.println("homens agressivos "+homensAgressivos );
		System.out.println("outros calmos "+outrosCalmos); 
		System.out.println("pessoas nervosas com mais de 40 anos "+pessoasNervosasMais40Anos); 
		System.out.println("pessoas calmas com menos de 18 anos "+pessoasCalmasMenos18Anos); 
		System.out.println("fim do programa");
	}
}