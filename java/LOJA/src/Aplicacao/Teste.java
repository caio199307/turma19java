package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.Revista;
import Entidades.Roupa;

public class Teste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Produto prod1 = new Produto("CAMISA","XL001",100.25);
		Revista prod2 = new Revista("CRAUDIA","RR0023",25.50,"ABRIL");
		Roupa prod3 = new Roupa("KALÇA","XLQ001",90.50,"ZARA");
		
		prod2.incluirEstoque(10);
		prod3.incluirEstoque(0);
		prod1.setValorUnitario(80);
		prod1.incluirEstoque(20);
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+ " estoque "+prod1.getQtdeEstoque()+ " custo total "+10*prod1.getValorUnitario());
		prod1.tirarEstoque(10);
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+ " estoque "+prod1.getQtdeEstoque());
		System.out.println(prod2.getDescricao()+" "+prod2.getQtdeEstoque()+" "+prod2.getEditora());
		System.out.println(prod3.getDescricao()+" "+prod3.getQtdeEstoque());
	}
}
