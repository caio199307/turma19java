package entidades;

public class preguica extends Animal {
	
public preguica(String nome, int idade) {
	super(nome, idade);
}


public void subirArvore()
{
	System.out.println("Preguiça subindo nas arvores");
}

public void infopreguica() {
	
	
	System.out.println("shssss");
	System.out.println("Nome da preguica "+getNome());
	System.out.println("Idade "+getIdade());
	
	
	
}
}