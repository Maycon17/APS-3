import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) 
	{
		//cria��o do objeto livro
		Livro l = new Livro();
		
		//teste de impress�o
		System.out.println(l.toString());
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