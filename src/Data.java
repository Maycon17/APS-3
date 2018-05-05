import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Data {
	//Atributos da classe
	private String data;

	//Método construtor
	Data (String d)
	{		
		setData(d);
	}

	@Override
	public String toString() {
		return data;
	}

	public String getData() {
		return data;
	}

	public void setData(String d) {
		
		//formatação de data
		Date data = null;
		String dataTexto = new String(d);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		//capturando um erro na inserção de data
		try {
	     	format.setLenient(false);
	     	data = format.parse(dataTexto);
	     	this.data = dataTexto;
		} catch (ParseException e) {
		     	JOptionPane.showMessageDialog(null,"Data informada incorreta","AVISO",JOptionPane.WARNING_MESSAGE);
		}
	}
	
}
