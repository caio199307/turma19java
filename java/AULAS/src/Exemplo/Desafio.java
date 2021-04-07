//vou querer nome, ano nascimento, genero

package Exemplo;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome1,nome2;
		int ano1,ano2;
		int gen1,gen2;
		
			System.out.println("Cadastro do 1º aluno");
			System.out.println("Digite seu nome");
			nome1 = leia.next();
			System.out.println("Qual seu gênero?\n1 Masculino\n2 Feminino\n3 Outros");
			gen1 = leia.nextInt();
			System.out.println("Digite seu ano de nascimento ");
			ano1 = leia.nextInt();
			System.out.println("Cadastro efetuado com sucesso.");
			System.out.println("cadastro do 2º aluno");
			System.out.println("Digite seu nome");
			nome2 = leia.next();
			System.out.println("Qual seu gênero?\n1 Masculino\n2 Feminino\n3 Outros");
			gen2 = leia.nextInt();
			System.out.println("Digite seu ano de nascimento ");
			ano2 = leia.nextInt();
			System.out.println("Cadastro efetuado com sucesso.");
			
			if(ano1 > ano2)
			{
				System.out.println(nome1+" é mais novo que "+nome2);
			}
			else if(ano1 < ano2)
			{
				System.out.println(nome1+" é mais velho que "+nome2);
			}
			else
			{
				System.out.println(nome1+ " e "+nome2 +" tem a mesma idade");
			}
	}
	
}
