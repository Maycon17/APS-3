public class Livro extends Obras {
	
	//M�todo construtor
	Livro()
	{
		super();		
	}

	@Override
	public String toString() {
		return "O Livro " + getTitulo() + " de g�nero "+ getGenero() +" possui " + getPaginas() + " p�ginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lan�ado em " + getData() + ".\nSintese: " + getSintese();
	}
}
