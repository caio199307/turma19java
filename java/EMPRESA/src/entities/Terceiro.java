package entities;

public class Terceiro extends Funcionario {
	//atributos
	private double Adicional;

	
	//construtores
	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		Adicional = adicional;
	}

	//encapsulamento
	public double getAdicional() {
		return Adicional;
	}

	public void setAdicional(double adicional) {
		Adicional = adicional;
	}
	
	
	//metodos
	@Override
	public double salario()
	{
		return (horasTrabalhadas * valorHora)+Adicional;
	}

}
