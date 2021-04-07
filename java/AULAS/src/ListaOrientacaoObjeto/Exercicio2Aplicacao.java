package ListaOrientacaoObjeto;

import java.util.Scanner;

public class Exercicio2Aplicacao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        Exercicio2Classe Modelo1 = new Exercicio2Classe();

        System.out.println("Escreva o nome da sua companhia de avião: ");
        Modelo1.nomeCompanhia = leia.next();
        System.out.println("Escreva o número do seu assento: ");
        Modelo1.numeroAssento = leia.nextInt();
        System.out.println("Qual a classe do seu voo: ");
        Modelo1.classe = leia.next();

        System.out.printf("A companhia de avião é: %s",Modelo1.nomeCompanhia);
        System.out.printf("\nO numero do assento é: %d",Modelo1.numeroAssento);
        System.out.printf("\nSua classe no voo é: %s",Modelo1.classe);
	}
}
