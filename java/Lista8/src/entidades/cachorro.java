package entidades;

public class cachorro extends Animal {
	
	public cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void correr() 
	{
		System.out.println("O cachorro está correndo!!");
	}
	public void dadosCachorro() {
		
		
		System.out.println(" CACHORRO ");
		System.out.println("Nome do cachorro "+getNome());
		System.out.println("Idade "+getIdade());
		
	}

}