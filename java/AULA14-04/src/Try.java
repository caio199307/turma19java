import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int nota=0;
		int aux=0;
		String situacao = "";
		String nomes[] = new String[3];
		try
		{
		System.out.println("Digite a posi��o no vetor de 0 a 2");
		aux = leia.nextInt();
		
		System.out.println("Digite o nome");
		nomes[aux] = leia.next();
		System.out.println("Digite a nota");
		nota = leia.nextInt();
		

		if (nota<=5)
		{
			situacao= "ainda n�o";
			System.out.println("");
		}
		else
		{
			situacao = "pode seguir para o pr�ximo n�vel.";
		}
		

		System.out.printf("oi %s sua situa��o � %s\n",nomes[aux],situacao);
		}
		catch(InputMismatchException erro)
		{
			System.out.println("Voc� n�o digitou um n�mero valido");
		}
		catch(ArrayIndexOutOfBoundsException erro)
		{
			System.out.println("voc� digitou um tamanho de vetor que n�o existe");
		}
		System.out.println("fim de programa");
	}
}
