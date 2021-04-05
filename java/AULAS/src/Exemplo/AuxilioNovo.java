//se já receu antes, se recebe bolsa familia  e se é chefa de familia, receb 300 ou 600 e a cada 1 filho que ela 
//tenha recebe 50 reais.

package Exemplo;

import java.util.Scanner;

public class AuxilioNovo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao,opcao2 = 0,opcao3 = 0;
		int filhos;
		double auxilio300 = 300.00;
		double auxilio600 = 600.00;
		System.out.println("Bem vindo/a/e digite a quantidade de filhos que você possúi.");
		filhos = leia.nextInt();
		System.out.println("Bem vindo/a/e triagem do auxílio\nVocê já recebia o auxílio antes?\n 1 para Sim e 2 para Não.");
		opcao = leia.nextInt();
		if(opcao == 2) {
			System.out.println("Você não tem direito ao auxílio.");
		}
		else if (opcao == 1) {
			System.out.println("Parabéns, você tem direito ao auxilio\nVocê recebe bolsa familia? 1 para Sim e 2 para Não.");
			opcao2 = leia.nextInt();
			System.out.println("Você é chefa de familia? 1 para Sim e 2 para Nâo");
			opcao3 = leia.nextInt();
		}
		if (opcao2 == 1) {
			filhos = filhos * 50;
			auxilio300 = auxilio300 + filhos;
			System.out.printf("Parabens, você tem direito a R$ %.2f",auxilio300);
		}
		else if (opcao2 == 2 && opcao3 == 1 ) {
			filhos = filhos * 50;
			auxilio600 = auxilio600 + filhos;
			System.out.printf("Parabéns, você tem direito a R$ %.2f", auxilio600);
			
		}
		else if (opcao2 == 2 && opcao3 == 2) {
			filhos = filhos * 50;
			auxilio300 = auxilio300 + filhos;
			System.out.printf("Parabens, você tem direito a R$ %.2f",auxilio300);
		}
		else {
			System.out.println("Até logo.");
		}
		
		
	}

}
