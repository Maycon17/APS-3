
public abstract class Obras {
	private String titulo, autor, editora, genero, sintese;
	private Data data;
	
	Obras (String titulo, String autor, String editora, String sintese ,String genero, Data data)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.data = data;
		this.genero = genero;
		this.sintese = sintese;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSintese() {
		return sintese;
	}

	public void setSintese(String sintese) {
		this.sintese = sintese;
	}
	
	
}
