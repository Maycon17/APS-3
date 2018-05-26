import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Data {
	//Atributos da classe
	private String data;

	//M�todo construtor
	Data ()
	{		
		setData();
	}

	@Override
	public String toString() {
		return data;
	}

	public String getData() {
		return data;
	}

	public void setData() {
		//variavel de controle para a valida��o
		boolean val = true;
		
		//la�o de repeti��o para efetuar a valida��o.
		while(val)
		{
			//solicitando a data de lan�amento da obra
		
			//formata��o de data
			Date data = null;
			String dataTexto = new String(JOptionPane.showInputDialog(null, "Digite a data de lan�amento da obra (dd/MM/yyyy)"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			
			//capturando um erro na inser��o de data
			try {
		     	format.setLenient(false);
		     	data = format.parse(dataTexto);
		     	this.data = dataTexto;
		     	val = false;
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "Data informada invalida.");
			}
		}
	}
	
}
