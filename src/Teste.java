import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) 
	{
		//criação do objeto livro
		Livro l = new Livro();
		
		//teste de impressão
		System.out.println(l.toString());
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