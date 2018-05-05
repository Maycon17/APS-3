import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {
	//Atributos da classe
	private String data;

	//Método construtor
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
		//variavel de controle para a validação
		boolean val = true;
		
		//objeto e variavel para a solicitação dos dados
		Scanner entrada = new Scanner (System.in);
		String dat;
		
		//laço de repetição para efetuar a validação.
		while(val)
		{
			//solicitando a data de lançamento da obra
			System.out.println("Digite a data de lançamento da obra");
			dat = entrada.nextLine();
		
			//formatação de data
			Date data = null;
			String dataTexto = new String(dat);
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			
			//capturando um erro na inserção de data
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
