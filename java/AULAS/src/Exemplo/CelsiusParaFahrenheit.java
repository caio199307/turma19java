package Exemplo;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double celcius;
		double calculo;
		
		System.out.println("Digite a temperatura em Celsius portiolli ");
		celcius = leia.nextDouble();
		
		calculo = (celcius*9/5)+32;
		
		System.out.println(celcius +" Graus celcius portiolli em fahrenheit é "+calculo);
		
		
	}
}
