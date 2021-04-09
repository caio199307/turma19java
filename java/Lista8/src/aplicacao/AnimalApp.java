package aplicacao;

import entidades.cachorro;
import entidades.cavalo;
import entidades.preguica;

public class AnimalApp {

public static void main (String [] args) {
		
		
		cachorro dog = new cachorro("Bruce",3);
		dog.dadosCachorro();
		dog.correr();
		
	
		
		
		cavalo horse = new cavalo ("Spirit",2);
		horse.infocavalo();
		horse.correr();
		
		
		
		
		preguica p = new preguica ("Flash",2);
		p.infopreguica();
		p.subirArvore();
		
		
	}

}