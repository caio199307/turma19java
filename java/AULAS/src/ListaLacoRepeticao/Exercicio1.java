package ListaLacoRepeticao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1000;x<1999;x++)
		{
			if(x%11 == 5)
			{
				System.out.println(x + " ");
			}
		}
	}
}
