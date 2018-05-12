import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) 
	{
		//instanciando as variaveis
		String opcao, escolha, texto = "";
		int insert = 0;
		
		//instanciando o array de objetos para efetuar a inserção do usuário
		Obras [] obra = new Obras [10];
		
		//instanciando um array auxiliar caso necessário
		Obras [] aux = new Obras [0];
		
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
//======================================================caso a opção seja de inserir uma obra==============================================
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
							//====================================caso a opção seja de inserir um livro===================================
							case 1:
								//verificando se o array encontra-se lotado
								if(insert == obra.length)
								{
									//se estiver cheio o código irá alocar no array aux o tamanho atual do array obra
									//e copiar o seu conteudo.
									aux = new Obras [obra.length];
									System.arraycopy(obra, 0, aux, 0, obra.length);
									
									//agora irá ser efetuado o aumento do array incrementando mais 10 posições
									obra = new Obras [aux.length + 10];
									System.arraycopy(aux, 0, obra, 0, aux.length);
									
									//incrementado mais um no insert para trocar a posição de gravação no array
									insert++;
								}
								
								obra[insert] = new Livro();
								
								System.out.println(obra[insert]);
								
								insert++;
								
								break;
								
							//======================================caso a opção seja de inserir um HQ====================================
							case 2:
								if(insert == obra.length)
								{
									//se estiver cheio o código irá alocar no array aux o tamanho atual do array obra
									//e copiar o seu conteudo.
									aux = new Obras [obra.length];
									System.arraycopy(obra, 0, aux, 0, obra.length);
									
									//agora irá ser efetuado o aumento do array incrementando mais 10 posições
									obra = new Obras [aux.length + 10];
									System.arraycopy(aux, 0, obra, 0, aux.length);
									
									//incrementado mais um no insert para trocar a posição de gravação no array
									insert++;
								}
	
								obra[insert] = new HQs();
								
								insert++;
								break;
							
							//======================================caso a opção seja de inserir um TCC===================================
							case 3:
								if(insert == obra.length)
								{
									//se estiver cheio o código irá alocar no array aux o tamanho atual do array obra
									//e copiar o seu conteudo.
									aux = new Obras [obra.length];
									System.arraycopy(obra, 0, aux, 0, obra.length);
									
									//agora irá ser efetuado o aumento do array incrementando mais 10 posições
									obra = new Obras [aux.length + 10];
									System.arraycopy(aux, 0, obra, 0, aux.length);
									
									//incrementado mais um no insert para trocar a posição de gravação no array
									insert++;
								}
	
								obra[insert] = new TCC();
								
								insert++;
								break;
						}
						
						//diminuindo o tamanho do array auxiliar para não ocupar muito espaço na memória
						aux = new Obras [1];
						
					}while(Integer.parseInt(opcao) != 4);
					
					break;
				
//==============================================caso a opção seja de buscar uma obra=======================================================
				case 2:
					do
					{
						//painel de escolha de ação
						opcao = JOptionPane.showInputDialog(null,"Escolha uma método de procurar por uma obra já cadastrada?\n"
								+ "1 - Pelo seu título \n"
								+ "2 - Pelo autor da obra \n"
								+ "3 - Pelo genero da obra \n"
								+ "4 - Para voltar \n");
						
						//chamada da função de validação de opções
						opcao = validacao(opcao, 4);
						
						switch(Integer.parseInt(opcao))
						{
						//========================================Buscando obras pelo seu titulo====================================
						case 1:
							escolha = JOptionPane.showInputDialog(null, "Digite o titulo que você busca.");
							
							for(int i = 0; i < insert; i++)
							{
								if(escolha.equalsIgnoreCase(obra[i].getTitulo()))
								{
									texto += obra[i].toString() + "\n";
								}
							}
							
							if(texto != "")
							{
								JOptionPane.showMessageDialog(null, texto);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Não há obras produzidas com este titulo");
							}
							
							texto = "";
							
							break;
							
						//========================================Buscando obras pelo seu autor====================================
						case 2:
							escolha = JOptionPane.showInputDialog(null, "Digite o nome do autor que você busca.");
							
							for(int i = 0; i < insert; i++)
							{
								if(escolha.equalsIgnoreCase(obra[i].getAutor()))
								{
									texto += obra[i].toString() + "\n";
								}
							}
							
							if(texto != "")
							{
								JOptionPane.showMessageDialog(null, texto);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Não há obras produzidas por este autor");
							}
							
							texto = "";
							break;
							
						//========================================Buscando obras pelo seu genero====================================
						case 3:
							escolha = JOptionPane.showInputDialog(null, "Digite o genero que você busca.");
							
							for(int i = 0; i < insert; i++)
							{								
								if(escolha.equalsIgnoreCase(obra[i].getGenero()))
								{
									texto += obra[i].toString() + "\n";
								}
							}
							
							if(texto != "")
							{
								JOptionPane.showMessageDialog(null, texto);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Não há obras cadastradas com este genero");
							}
							
							texto = "";
							break;
						}
					}while(Integer.parseInt(opcao) != 4);
					break;
					
//==============================================caso a opção seja de eliminar uma obra=====================================================
				case 3:
					break;
			}
		}while(Integer.parseInt(opcao) != 0);
	}
	
	//função de validação de opção escolhida
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