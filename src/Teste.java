import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) 
	{
		//instanciando a variavel para a escolha de ações
		String opcao;
		
		//laço para efetuar a escolha de ações
		do
		{
			//painel de escolha de ação
			opcao = JOptionPane.showInputDialog(null,"Selecione uma das opções?\n"
					+ "1 - Inserir uma nova obra \n"
					+ "2 - Buscar por uma obra \n"
					+ "3 - Deletar uma obra");
			
			//validação se o dado informado pelo usuário é realmente um número
			for (int i = 0; i < opcao.length(); i++)
			{
				//verificando se há um caracter será incorreto ou diferente das opções
				if(Character.isDigit(opcao.charAt(i)) == false || Integer.parseInt(opcao) > 3)
				{
					JOptionPane.showMessageDialog(null, "Opção inválida");
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
		//criação do objeto livro
		Livro l = new Livro();
		
		//teste de impressão
		JOptionPane.showMessageDialog(null,l.toString());*/
	}
}

//Exemplo de solicitação de dado por janela de interação
//String nome = JOptionPane.showInputDialog(null, "Entre com o nome do produto");

//Exemplo de solicitação de dado via console
/*
 * Scanner entrada = new Scanner (System.in);
 * String dat;
 * System.out.println("Digite a data de lançamento da obra");
 * dat = entrada.nextLine();
 */