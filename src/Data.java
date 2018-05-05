import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
		
		//objeto e variavel para a solicita��o dos dados
		Scanner entrada = new Scanner (System.in);
		String dat;
		
		//la�o de repeti��o para efetuar a valida��o.
		while(val)
		{
			//solicitando a data de lan�amento da obra
			System.out.println("Digite a data de lan�amento da obra");
			dat = entrada.nextLine();
		
			//formata��o de data
			Date data = null;
			String dataTexto = new String(dat);
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			
			//capturando um erro na inser��o de data
			try {
		     	format.setLenient(false);
		     	data = format.parse(dataTexto);
		     	this.data = dataTexto;
		     	val = false;
			} catch (ParseException e) {
		     	System.out.println("Data informada invalida.");
			}
		}
	}
	
}
