import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) 
	{
		//instanciando a variavel para a escolha de ações
		String opcao;
		
		//instanciando o array de objetos para efetuar a inserção do usuário
		Obras [] obra = new Obras [10];
		
		//laço para efetuar a escolha de ações
		do
		{
			//painel de escolha de ação
			opcao = JOptionPane.showInputDialog(null,"Selecione uma das opções?\n"
					+ "1 - Inserir uma nova obra \n"
					+ "2 - Buscar por uma obra \n"
					+ "3 - Deletar uma obra \n"
					+ "0 - Para sair");
			
			//chamada da função de validação de opções passando a opção e o valor máximo permitido
			opcao = validacao (opcao, 3);
			
			//ação para cada opção escolhida
			switch(Integer.parseInt(opcao))
			{
				case 1:
					//laço para efetuar a escolha de ações
					do
					{
						//painel de escolha de ação
						opcao = JOptionPane.showInputDialog(null,"Qual o tipo de obra que você deseja inserir?\n"
								+ "1 - Inserir um livro \n"
								+ "2 - Inserir uma HQ \n"
								+ "3 - Inserir um TCC \n"
								+ "4 - Para voltar \n");
						
						//chamada da função de validação de opções
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
		
		
		
		/*=========================================ÁREA DE TESTES============================================
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
		//validação se o dado informado pelo usuário é realmente um número
		for (int i = 0; i < opcao.length(); i++)
		{
			//verificando se há um caracter será incorreto ou diferente das opções
			if(Character.isDigit(opcao.charAt(i)) == false || Integer.parseInt(opcao) > max)
			{
				JOptionPane.showMessageDialog(null, "Opção inválida");
				//caso tenha um caracter altera a opcao para incorreta
				opcao = "40";
				break;
			}
		}
		
		return opcao;
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