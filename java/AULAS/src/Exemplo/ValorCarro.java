package Exemplo;
import java.util.Scanner;
public class ValorCarro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double distribuicao,imposto,custoFabrica,custoConsumidor;
		System.out.println("Digite o custo de fábrica do veículo ");
		custoFabrica = leia.nextDouble();
		distribuicao = custoFabrica*0.28;
		imposto = custoFabrica*0.45;
		custoConsumidor = custoFabrica+distribuicao+imposto;
		System.out.println("O custo do veículo ao consumidor será de: "+custoConsumidor);	
		}
}


