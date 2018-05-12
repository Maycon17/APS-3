import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) 
	{
		//instanciando as variaveis
		String opcao, escolha, texto = "";
		int insert = 0;
		
		//instanciando o array de objetos para efetuar a inser��o do usu�rio
		Obras [] obra = new Obras [10];
		
		//instanciando um array auxiliar caso necess�rio
		Obras [] aux = new Obras [0];
		
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
//======================================================caso a op��o seja de inserir uma obra==============================================
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
							//====================================caso a op��o seja de inserir um livro===================================
							case 1:
								//verificando se o array encontra-se lotado
								if(insert == obra.length)
								{
									//se estiver cheio o c�digo ir� alocar no array aux o tamanho atual do array obra
									//e copiar o seu conteudo.
									aux = new Obras [obra.length];
									System.arraycopy(obra, 0, aux, 0, obra.length);
									
									//agora ir� ser efetuado o aumento do array incrementando mais 10 posi��es
									obra = new Obras [aux.length + 10];
									System.arraycopy(aux, 0, obra, 0, aux.length);
									
									//incrementado mais um no insert para trocar a posi��o de grava��o no array
									insert++;
								}
								
								obra[insert] = new Livro();
								
								System.out.println(obra[insert]);
								
								insert++;
								
								break;
								
							//======================================caso a op��o seja de inserir um HQ====================================
							case 2:
								if(insert == obra.length)
								{
									//se estiver cheio o c�digo ir� alocar no array aux o tamanho atual do array obra
									//e copiar o seu conteudo.
									aux = new Obras [obra.length];
									System.arraycopy(obra, 0, aux, 0, obra.length);
									
									//agora ir� ser efetuado o aumento do array incrementando mais 10 posi��es
									obra = new Obras [aux.length + 10];
									System.arraycopy(aux, 0, obra, 0, aux.length);
									
									//incrementado mais um no insert para trocar a posi��o de grava��o no array
									insert++;
								}
	
								obra[insert] = new HQs();
								
								insert++;
								break;
							
							//======================================caso a op��o seja de inserir um TCC===================================
							case 3:
								if(insert == obra.length)
								{
									//se estiver cheio o c�digo ir� alocar no array aux o tamanho atual do array obra
									//e copiar o seu conteudo.
									aux = new Obras [obra.length];
									System.arraycopy(obra, 0, aux, 0, obra.length);
									
									//agora ir� ser efetuado o aumento do array incrementando mais 10 posi��es
									obra = new Obras [aux.length + 10];
									System.arraycopy(aux, 0, obra, 0, aux.length);
									
									//incrementado mais um no insert para trocar a posi��o de grava��o no array
									insert++;
								}
	
								obra[insert] = new TCC();
								
								insert++;
								break;
						}
						
						//diminuindo o tamanho do array auxiliar para n�o ocupar muito espa�o na mem�ria
						aux = new Obras [1];
						
					}while(Integer.parseInt(opcao) != 4);
					
					break;
				
//==============================================caso a op��o seja de buscar uma obra=======================================================
				case 2:
					do
					{
						//painel de escolha de a��o
						opcao = JOptionPane.showInputDialog(null,"Escolha uma m�todo de procurar por uma obra j� cadastrada?\n"
								+ "1 - Pelo seu t�tulo \n"
								+ "2 - Pelo autor da obra \n"
								+ "3 - Pelo genero da obra \n"
								+ "4 - Para voltar \n");
						
						//chamada da fun��o de valida��o de op��es
						opcao = validacao(opcao, 4);
						
						switch(Integer.parseInt(opcao))
						{
						//========================================Buscando obras pelo seu titulo====================================
						case 1:
							escolha = JOptionPane.showInputDialog(null, "Digite o titulo que voc� busca.");
							
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
								JOptionPane.showMessageDialog(null, "N�o h� obras produzidas com este titulo");
							}
							
							texto = "";
							
							break;
							
						//========================================Buscando obras pelo seu autor====================================
						case 2:
							escolha = JOptionPane.showInputDialog(null, "Digite o nome do autor que voc� busca.");
							
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
								JOptionPane.showMessageDialog(null, "N�o h� obras produzidas por este autor");
							}
							
							texto = "";
							break;
							
						//========================================Buscando obras pelo seu genero====================================
						case 3:
							escolha = JOptionPane.showInputDialog(null, "Digite o genero que voc� busca.");
							
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
								JOptionPane.showMessageDialog(null, "N�o h� obras cadastradas com este genero");
							}
							
							texto = "";
							break;
						}
					}while(Integer.parseInt(opcao) != 4);
					break;
					
//==============================================caso a op��o seja de eliminar uma obra=====================================================
				case 3:
					break;
			}
		}while(Integer.parseInt(opcao) != 0);
	}
	
	//fun��o de valida��o de op��o escolhida
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