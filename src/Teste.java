import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) 
	{
		//instanciando a variavel para a escolha de a��es
		String opcao;
		
		//la�o para efetuar a escolha de a��es
		do
		{
			//painel de escolha de a��o
			opcao = JOptionPane.showInputDialog(null,"Selecione uma das op��es?\n"
					+ "1 - Inserir uma nova obra \n"
					+ "2 - Buscar por uma obra \n"
					+ "3 - Deletar uma obra");
			
			//valida��o se o dado informado pelo usu�rio � realmente um n�mero
			for (int i = 0; i < opcao.length(); i++)
			{
				//verificando se h� um caracter ser� incorreto ou diferente das op��es
				if(Character.isDigit(opcao.charAt(i)) == false || Integer.parseInt(opcao) > 3)
				{
					JOptionPane.showMessageDialog(null, "Op��o inv�lida");
					//caso tenha um caracter altera a opcao para incorreta
					opcao = "4";
					break;
				}
			}
			
			switch(Integer.parseInt(opcao))
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			}
			
			
		}while(Integer.parseInt(opcao) != 0);
		
		/*
		//cria��o do objeto livro
		Livro l = new Livro();
		
		//teste de impress�o
		JOptionPane.showMessageDialog(null,l.toString());*/
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