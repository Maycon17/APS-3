public class HQs extends Obras {
	
	//Método construtor
	HQs ()
	{
		super();
	}
	
	@Override
	public String toString() {
		return "A HQ com titulo " + getTitulo() + " de gênero "+ getGenero() +" possui " + getPaginas() + " páginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lançado em " + getData() + ". /n Sintese: " + getSintese();
	}
	
}
