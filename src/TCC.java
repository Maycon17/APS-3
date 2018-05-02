
public class TCC extends Obras {
	private int paginas;
	private String instituicao, curso;
	
	TCC (String titulo, String autor, int paginas, String instituicao, String curso ,String editora, String genero, 
		String sintese, Data data)
	{
		super(titulo, autor, editora, sintese, genero, data);
		this.paginas = paginas;
		this.instituicao = instituicao;
		this.curso = curso;
		
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
