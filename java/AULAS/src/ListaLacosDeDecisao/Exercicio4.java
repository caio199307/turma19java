package ListaLacosDeDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num1;
		double raiz,elevado;
		System.out.println("Digite um n�mero");
		num1 = leia.nextInt();
		
		if(num1 %2 == 0)
		{
			raiz = Math.sqrt(num1);
			System.out.printf("A ra�z quadrada do n�mero par �: %.2f",raiz);
		}
		else if (num1 %2 ==1)
		{
			elevado = Math.pow(num1, 2);
			System.out.printf("O n�mero �mpar elevado ao quadrado �: %.2f",elevado);
		}
		else
		{
			System.out.println("Voc� n�o digitou um n�mero valido.");
		}
	}

}
