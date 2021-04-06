package Exemplo;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomes[] = new String[3];//nomes[0],nomes[1] e nomes[2]
		String apostolos[] = {"LUCAS","MATEUS","JUDAS","MARCOS","PEDRO"}; 
		String nome1,nome2,nome3;
		
		nome1 = "JOAO";
		nomes[0] = "PAULO";
		nome2 = "MARIA";
		nomes[1] = "MADALENA";
		nome3 = "PEDRO";
		nomes[2] = "RITA";
		//System.out.println(nomes[0]);
		
		for(int x = 0; x < apostolos.length; x++)
		{
			System.out.println(apostolos[x]);
		}
				
	}
}
