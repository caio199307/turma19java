package entities;

public class Loja {
	//atributos
	private String nomeLoja;
	private String cnpj;
	
	
	
	
	//construtores
	public Loja(String nomeLoja, String cnpj) {
		super();
		this.nomeLoja = nomeLoja;
		this.cnpj = cnpj;
	}




	public String getNomeLoja() {
		return nomeLoja;
	}




	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}




	public String getCnpj() {
		return cnpj;
	}




	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
	
	
	
	
}
