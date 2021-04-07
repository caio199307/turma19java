package Application;

import Entity.Conta;

public class TesteProgramador {
	public static void main(String[] args) {
		Conta exemplo1 = new Conta(1,"111.111.111-11");
		Conta exemplo2 = new Conta(100,"xxx.xxx.xxx-xx");
		
		exemplo1.credito(1000.55);
		System.out.printf("Nome: %s\n",exemplo1.cpf);
		System.out.printf("Número da conta %d \n",exemplo1.numero);
		System.out.printf("Saldo: %f\n",exemplo1.saldo);
	}
}
