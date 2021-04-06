package ListaLacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pessoasMenos21=0,pessoasMais50=0;
		int idade=0;
		
		while (idade > -99)
		{
			System.out.println("Digite a idade");
			idade = leia.nextInt();
			
			if(idade < 21)
			{
				pessoasMenos21++;
			}
			if(idade > 50)
			{
				pessoasMais50++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é: "+pessoasMenos21);
		System.out.println("O total de pessoas com mais de 50 anos é: "+pessoasMais50);
	}

}
