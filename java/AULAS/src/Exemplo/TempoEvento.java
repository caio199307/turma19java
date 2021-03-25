package Exemplo;

import java.util.Scanner;

public class TempoEvento {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int horas,minutos,segundos,eventoSegundos;
		
		System.out.println("Digite o tempo do evento em segundos ");
		eventoSegundos = leia.nextInt();
		
		horas = eventoSegundos/3600;
		minutos = eventoSegundos%3600/60;
		segundos = eventoSegundos%3600%60;
		System.out.println("o evento teve "+horas+" horas "+minutos+" minutos e "+segundos+" segundos");
		
		
				
	}
}
