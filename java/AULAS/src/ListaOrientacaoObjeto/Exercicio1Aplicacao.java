package ListaOrientacaoObjeto;

import java.util.Scanner;

public class Exercicio1Aplicacao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Exercicio1Classe cliente1 = new Exercicio1Classe();
		Exercicio1Classe cliente2 = new Exercicio1Classe();
		
		System.out.println("Digite o nome do 1� cliente");
		cliente1.nome = leia.next();
		System.out.println("digite sua idade");
		cliente1.idade = leia.nextInt();
		System.out.println("Digite seu CPF");
		cliente1.cpf = leia.next();
		
		
		System.out.println("Digite o nome do 2� cliente");
		cliente2.nome = leia.next();
		System.out.println("digite sua idade");
		cliente2.idade = leia.nextInt();
		System.out.println("Digite seu CPF");
		cliente2.cpf = leia.next();
		
		System.out.printf("Informa��es dos clientes:\n1� %s - idade: %d - CPF: %s\n2� %s - idade: %d - CPF: %s",cliente1.nome,cliente1.idade,cliente1.cpf,cliente2.nome,cliente2.idade,cliente2.cpf);
		
	}
}
