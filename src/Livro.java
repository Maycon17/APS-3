import javax.swing.JOptionPane;

public class Livro extends Obras {
	
	private String editora;
	
	//Método construtor
	Livro()
	{
		super();

		setEditora();
	}

	@Override
	public String toString() {
		return "O Livro " + getTitulo() + " de gênero "+ getGenero() +" possui " + getPaginas() + " páginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lançado em " + getData() + ".\nSíntese: " + getSintese();
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora() {
		this.editora = validacao(JOptionPane.showInputDialog(null, "Digite o editora da obra"), "editora");
	}
	
	
}
