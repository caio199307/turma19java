package Application;

import java.util.Scanner;

import Entity.Conta;

public class TesteConta {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Conta contajoao = new Conta();
		System.out.println("Digite o número da conta");
		contajoao.numero = leia.nextInt();
		System.out.println("Digite o CPF da conta");
		contajoao.cpf = leia.next();
		System.out.println("Digite o valor");
		double valor = leia.nextDouble();
		System.out.println("1 para credito e 2 para debito");
		char opcao = leia.next().charAt(0);
		if(opcao == '1')
		{
			contajoao.credito(valor);
		}
		else if (opcao == '2')
		{
			
		}
		
		
		contajoao.saldo = 100.2526;
		
		System.out.printf("Nome: %s\n",contajoao.cpf);
		System.out.printf("Número da conta %d \n",contajoao.numero);
		System.out.printf("Saldo: %f\n",contajoao.saldo);
	}
}
