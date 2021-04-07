//int numero, string cpf, double saldo, boolean ativa, metodo debitar void, metodo creditar void
package Entity;

public class Conta {

	private int numero=0;
	private String cpf="0";
	private double saldo;
	public boolean ativo;
	
	public Conta()
	{
		
	}
	public Conta(int numero,String cpf)
	{
		this.numero = numero;
		this.cpf = cpf;
		
	}
	public Conta(int numero,String cpf,  boolean ativo)
	{
		this.numero = numero;
		this.cpf = cpf;
		this.ativo = ativo;
	}
	public String getCpf()
	{
		return this.cpf;
	}
	public int getNumero()
	{
		return this.numero;
	}
	
	
	public void debito(double valor)
	{
		saldo -= valor;
	}
	public void credito(double valor)
	{
		saldo += valor;
	}
	
}
