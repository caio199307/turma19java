//se j� receu antes, se recebe bolsa familia  e se � chefa de familia, receb 300 ou 600 e a cada 1 filho que ela 
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
		System.out.println("Bem vindo/a/e digite a quantidade de filhos que voc� poss�i.");
		filhos = leia.nextInt();
		System.out.println("Bem vindo/a/e triagem do aux�lio\nVoc� j� recebia o aux�lio antes?\n 1 para Sim e 2 para N�o.");
		opcao = leia.nextInt();
		if(opcao == 2) {
			System.out.println("Voc� n�o tem direito ao aux�lio.");
		}
		else if (opcao == 1) {
			System.out.println("Parab�ns, voc� tem direito ao auxilio\nVoc� recebe bolsa familia? 1 para Sim e 2 para N�o.");
			opcao2 = leia.nextInt();
			System.out.println("Voc� � chefa de familia? 1 para Sim e 2 para N�o");
			opcao3 = leia.nextInt();
		}
		if (opcao2 == 1) {
			filhos = filhos * 50;
			auxilio300 = auxilio300 + filhos;
			System.out.printf("Parabens, voc� tem direito a R$ %.2f",auxilio300);
		}
		else if (opcao2 == 2 && opcao3 == 1 ) {
			filhos = filhos * 50;
			auxilio600 = auxilio600 + filhos;
			System.out.printf("Parab�ns, voc� tem direito a R$ %.2f", auxilio600);
			
		}
		else if (opcao2 == 2 && opcao3 == 2) {
			filhos = filhos * 50;
			auxilio300 = auxilio300 + filhos;
			System.out.printf("Parabens, voc� tem direito a R$ %.2f",auxilio300);
		}
		else {
			System.out.println("At� logo.");
		}
		
		
	}

}
