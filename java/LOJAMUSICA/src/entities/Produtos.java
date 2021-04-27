package entities;

public abstract class  Produtos {
	
	//atributos
	private String codigo;
	private String instrumento;
	private double valorUnidade;
	private int estoque;

	//construtores
	
	public Produtos(String codigo, String instrumento, double valorUnidade, int estoque) {
		super();
		this.codigo = codigo;
		this.instrumento = instrumento;
		this.valorUnidade = valorUnidade;
		this.estoque = estoque;
	}


	
	//encapsulamentos getters and setters
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public double getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
	//metodos
	public void addEstoque(int addEstoque)
	{
		
		estoque += addEstoque;
		
	}
	public void tiraEstoque(int tiraEstoque)
	{
		
		if(estoque >= tiraEstoque)
		{
			
			estoque -= tiraEstoque;
		}
		else
		{
			System.out.println("Não há estoque disponível.");
		}
	}
	
	
}
