public class HQs extends Obras {
	
	//M�todo construtor
	HQs ()
	{
		super();
		
		setPaginas();
	}
	
	@Override
	public String toString() {
		return "A HQ " + getTitulo() + " de g�nero "+ getGenero() +" possui " + getPaginas() + " p�ginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lan�ado em " + getData() + ". /n Sintese: " + getSintese();
	}
	
}
