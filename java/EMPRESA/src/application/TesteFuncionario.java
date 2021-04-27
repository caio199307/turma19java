package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;


public class TesteFuncionario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("CADASTRO DE FUNCIONARIOS - PAGAMENTOS");
		System.out.println("Quantos funcionários serão cadastrador: ");
		int qtde = leia.nextInt();
		
		for(int x = 1;x<=qtde;x++)
		{
			System.out.printf("Funcionario %s\n",x);
			System.out.print("Digite 1 - Funcionário ou 2 - terceiro: ");
			char tipo = leia.next().charAt(0);
			System.out.print("Digite a matricula: ");
			String matricula = leia.next();
			System.out.print("Digite o nome: ");
			String nome = leia.next();
			System.out.print("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.print("Digite o valor por hora: ");
			double valorHora = leia.nextDouble();
			
			if(tipo == '2')
			{
				System.out.print("Digite o valor do adicional: ");
				double Adicional = leia.nextDouble();
				
				lista.add(new Terceiro(matricula,nome,horasTrabalhadas,valorHora,Adicional));
			}
			else
			{
				lista.add(new Funcionario(matricula,nome,horasTrabalhadas,valorHora));
			}
		}
		System.out.println("Folha de pagamento");
		for (Funcionario func: lista)
		{
			System.out.println(func.getNome()+"Salário R$ "+func.salario());
		}
		System.out.println("Fim de programa");
	}
}
