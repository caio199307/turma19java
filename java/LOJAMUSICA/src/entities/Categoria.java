package entities;

public class  Categoria extends Produtos{
	private String marca;

	
	
	public Categoria(String codigo, String instrumento, double valorUnidade, int estoque, String marca) {
		super(codigo, instrumento, valorUnidade, estoque);
		this.marca = marca;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

	}