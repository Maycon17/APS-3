import javax.swing.JOptionPane;

public class Livro extends Obras {
	
	private String editora;
	
	//M�todo construtor
	Livro()
	{
		super();

		setEditora();
	}

	@Override
	public String toString() {
		return "O Livro " + getTitulo() + " de g�nero "+ getGenero() +" possui " + getPaginas() + " p�ginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lan�ado em " + getData() + ".\nS�ntese: " + getSintese();
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora() {
		this.editora = validacao(JOptionPane.showInputDialog(null, "Digite o editora da obra"), "editora");
	}
	
	
}
