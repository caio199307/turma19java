package ListaOrientacaoObjeto;

import java.util.Scanner;

public class Exercicio2Aplicacao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        Exercicio2Classe Modelo1 = new Exercicio2Classe();

        System.out.println("Escreva o nome da sua companhia de avi�o: ");
        Modelo1.nomeCompanhia = leia.next();
        System.out.println("Escreva o n�mero do seu assento: ");
        Modelo1.numeroAssento = leia.nextInt();
        System.out.println("Qual a classe do seu voo: ");
        Modelo1.classe = leia.next();

        System.out.printf("A companhia de avi�o �: %s",Modelo1.nomeCompanhia);
        System.out.printf("\nO numero do assento �: %d",Modelo1.numeroAssento);
        System.out.printf("\nSua classe no voo �: %s",Modelo1.classe);
	}
}
