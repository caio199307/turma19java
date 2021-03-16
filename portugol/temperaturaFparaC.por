programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		
	real temperaturaF
	real temperaturaC 
	cadeia nome
	
	
	

	escreva("digite seu nome ")
	leia (nome)
	escreva("digite a temperatura em Fahrenheint ")
	leia (temperaturaF)
	
	temperaturaC = Mat.arredondar( ((temperaturaF - 32) / 1.8), 2)

	escreva("Olá ",nome," a temperatura em Celsius é de ",(temperaturaC))
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */