import java.util.Scanner;

public class Videos extends Obras {
	//Atributos da classe
	private int duracao;
	private String midia;
	
	//M�todo construtor
	Videos ()
	{
		super();
		
//===================================Solicitando para o usu�rio a entrada de dados===================================		
		
		//Solicitando a dura��o do video
		Scanner entradaInt = new Scanner (System.in);
		int durac;
		
		System.out.println("Digite o tempo de dura��o do video");
		durac = entradaInt.nextInt();
		this.duracao = durac;
		
		//Solicitando o tipo de midia do video (fisica ou digital)
		Scanner entradaString = new Scanner (System.in);
		String mid;
		
		System.out.println("Digite o tipo de midia do video (fis�ca ou digital");
		mid = entradaString.nextLine();
		this.midia = mid;
	}
	
	@Override
	public String toString() {
		return "O video " + getTitulo() + " de g�nero "+ getGenero() +" possui um dura��o de " + duracao + ". Foi produzido por " + getAutor() + 
				", distribuido por "+ getEditora() + " e lan�ado em " + getData() +  ". Distribuido em m�dia " + midia + ". /n Sintese: " + getSintese();
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}
}
