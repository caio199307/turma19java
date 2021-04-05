package ListaLacosDeDecisao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int infantil,juvenil,adulto;
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("infantil");
		}
		else if (idade >= 15 && idade <= 17 )
		{
			System.out.println("Juvenil");
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("adulto");
		}
		else
		{
			System.out.println("Você não se enquadra nas opções");
		}
	}

}
