import java.util.Scanner;

public class Videos extends Obras {
	//Atributos da classe
	private int duracao;
	private String midia;
	
	//Método construtor
	Videos ()
	{
		super();
		
//===================================Solicitando para o usuário a entrada de dados===================================		
		
		//Solicitando a duração do video
		Scanner entradaInt = new Scanner (System.in);
		int durac;
		
		System.out.println("Digite o tempo de duração do video");
		durac = entradaInt.nextInt();
		this.duracao = durac;
		
		//Solicitando o tipo de midia do video (fisica ou digital)
		Scanner entradaString = new Scanner (System.in);
		String mid;
		
		System.out.println("Digite o tipo de midia do video (fisíca ou digital");
		mid = entradaString.nextLine();
		this.midia = mid;
	}
	
	@Override
	public String toString() {
		return "O video " + getTitulo() + " de gênero "+ getGenero() +" possui um duração de " + duracao + ". Foi produzido por " + getAutor() + 
				", distribuido por "+ getEditora() + " e lançado em " + getData() +  ". Distribuido em mídia " + midia + ". /n Sintese: " + getSintese();
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
