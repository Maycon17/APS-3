import javax.swing.JOptionPane;

public class HQs extends Obras {

	private String editora;
	
	//Método construtor
	HQs ()
	{
		super();
		
		setEditora();
	}
	
	@Override
	public String toString() {
		return "A HQ com titulo " + getTitulo() + " de gênero "+ getGenero() +" possui " + getPaginas() + " páginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lançado em " + getData() + ". /n Síntese: " + getSintese();
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora() {
		this.editora = validacao(JOptionPane.showInputDialog(null, "Digite o editora da obra"), "editora");
	}
}
