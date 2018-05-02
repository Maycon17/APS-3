
public class HQs extends Obras {
	private int paginas;
	
	HQs (String titulo, String autor,int paginas, String editora, String genero, String sintese, Data data)
	{
		super(titulo, autor, editora, sintese, genero, data);
		this.paginas = paginas;
	}
	
	@Override
	public String toString() {
		return "A HQ " + getTitulo() + " de g�nero "+ getGenero() +" possui " + paginas + " p�ginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lan�ado na em " + getData() + ". /n Sintese: " + getSintese();
	}
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	
}
