package Exemplo;
import java.util.Scanner;
public class DistanciaRaiz {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double x1,x2,y1,y2,P1,P2,D;
		
		System.out.println("Valor de x1");
		x1 = leia.nextDouble();
		System.out.println("Valor de x2");
		x2 = leia.nextDouble();
		System.out.println("Valor de y1");
		y1 = leia.nextDouble();
		System.out.println("Valor de y2");
		y2 = leia.nextDouble();
		
		P1 = x1-x2;
		P1 = Math.pow(P1, 2);
		
		P2 = y1-y2;
		P2 = Math.pow(P2, 2);
		
		D = Math.pow(P1 + P2, 0.5);
	
		System.out.printf("primeira equa��o: "+P1+" segunda equa��o: "+P2+" e a raiz quadrada �: %.2f",D);	
	}

}
