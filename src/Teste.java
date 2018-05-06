import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) 
	{
		//instanciando a variavel para a escolha de a��es
		String opcao;
		
		//instanciando o array de objetos para efetuar a inser��o do usu�rio
		Obras [] obra = new Obras [10];
		
		//la�o para efetuar a escolha de a��es
		do
		{
			//painel de escolha de a��o
			opcao = JOptionPane.showInputDialog(null,"Selecione uma das op��es?\n"
					+ "1 - Inserir uma nova obra \n"
					+ "2 - Buscar por uma obra \n"
					+ "3 - Deletar uma obra \n"
					+ "0 - Para sair");
			
			//chamada da fun��o de valida��o de op��es passando a op��o e o valor m�ximo permitido
			opcao = validacao (opcao, 3);
			
			//a��o para cada op��o escolhida
			switch(Integer.parseInt(opcao))
			{
				case 1:
					//la�o para efetuar a escolha de a��es
					do
					{
						//painel de escolha de a��o
						opcao = JOptionPane.showInputDialog(null,"Qual o tipo de obra que voc� deseja inserir?\n"
								+ "1 - Inserir um livro \n"
								+ "2 - Inserir uma HQ \n"
								+ "3 - Inserir um TCC \n"
								+ "4 - Para voltar \n");
						
						//chamada da fun��o de valida��o de op��es
						opcao = validacao(opcao, 4);
						
						switch(Integer.parseInt(opcao))
						{
						case 1:
							
							break;
							
						case 2:
							
							break;
							
						case 3:
							
							break;
						}
						
					}while(Integer.parseInt(opcao) != 4);
					
					break;
					
				case 2:
					
					break;
					
				case 3:
					
					break;
			}
		}while(Integer.parseInt(opcao) != 0);
		
		
		
		/*=========================================�REA DE TESTES============================================
		 * obra[1] = new Livro();
		
		String teste = (String) obra[1].getTitulo();
		
		System.out.println(teste);
		
		if(teste == "a")
		{
			System.out.println("Deu certo");
		}
		else
		{
			System.out.println("lixo");
		}*/
	}
	
	public static String validacao (String opcao, int max)
	{
		//valida��o se o dado informado pelo usu�rio � realmente um n�mero
		for (int i = 0; i < opcao.length(); i++)
		{
			//verificando se h� um caracter ser� incorreto ou diferente das op��es
			if(Character.isDigit(opcao.charAt(i)) == false || Integer.parseInt(opcao) > max)
			{
				JOptionPane.showMessageDialog(null, "Op��o inv�lida");
				//caso tenha um caracter altera a opcao para incorreta
				opcao = "40";
				break;
			}
		}
		
		return opcao;
	}
}

//Exemplo de solicita��o de dado por janela de intera��o
//String nome = JOptionPane.showInputDialog(null, "Entre com o nome do produto");

//Exemplo de solicita��o de dado via console
/*
 * Scanner entrada = new Scanner (System.in);
 * String dat;
 * System.out.println("Digite a data de lan�amento da obra");
 * dat = entrada.nextLine();
 */