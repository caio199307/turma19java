package Exemplo;
import java.util.Scanner;
public class Potenciação1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valor1,valor2,valor3,R,S,D;
		double a;
		System.out.println("Digite o primeiro valor");
		valor1 = leia.nextDouble();
		System.out.println("digite o segundo valor");
		valor2 = leia.nextDouble();
		System.out.println("digite o terceiro valor");
		valor3 = leia.nextDouble();
		R = (valor1+valor2);
		R = Math.pow(R, 2);
		S = (valor2+valor3);
		S = Math.pow(S, 2);
		System.out.println("potencia dos valores 1 e 2 somados é "+R);
		System.out.println("a potencia dos valores 2 e 3 somados é "+S);
		D = (R+S)/2;
		System.out.println("o resultado das duas potencias dividido por 2 é "+D);	
	}
}
