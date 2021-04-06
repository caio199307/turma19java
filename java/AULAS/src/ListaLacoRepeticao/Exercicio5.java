package ListaLacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1;
		int contador;
		int soma=0;
		do
		{
			System.out.println("Digite um número");
			num1 = leia.nextInt();
			soma = soma + num1;
		}while(num1 != 0);
		
		System.out.println("A soma dos números digitados é: "+soma);
	}
}
