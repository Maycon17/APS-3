
public class Videos extends Obras {
	private int duracao;
	private String midia;
	
	Videos (String titulo, String autor, int duracao, String midia, String editora, String genero, String sintese, Data data)
	{
		super(titulo, autor, editora, sintese, genero, data);
		this.duracao = duracao;
		this.midia = midia;
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
