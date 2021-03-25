package Exemplo;

import java.util.Scanner;

public class EquaçãoLinear {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double x,y,ab,ac,ad,ae,ba,bb,bc,bd;
		
		System.out.println("digite valor de ab");
		ab = leia.nextDouble();
		System.out.println("digite valor de ac");
		ac = leia.nextDouble();
		System.out.println("digite valor de ad");
		ad = leia.nextDouble();
		System.out.println("digite valor de ae");
		ae = leia.nextDouble();
		System.out.println("digite valor de ba");
		ba = leia.nextDouble();
		System.out.println("digite valor de bb");
		bb = leia.nextDouble();
		System.out.println("digite valor de bc");
		bc = leia.nextDouble();
		System.out.println("digite valor de bd");
		bd = leia.nextDouble();
		
		x = (ab - ac)/(ad - ae);
		y = (ba - bb)/(bc - bd);
		
		System.out.println("o resultado da primeira equação é "+x+" e da segundo é "+y);
	}

}
