public class Livro extends Obras {
	
	//Método construtor
	Livro()
	{
		super();		
	}

	@Override
	public String toString() {
		return "O Livro " + getTitulo() + " de gênero "+ getGenero() +" possui " + getPaginas() + " páginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lançado em " + getData() + ".\nSintese: " + getSintese();
	}
}
