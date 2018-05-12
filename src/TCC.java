import javax.swing.JOptionPane;

public class TCC extends Obras {
	private String instituicao, curso;
	
	//Método construtor
	TCC ()
	{
		super();
		
		setInstituicao();
		setCurso();
	}
	
	@Override
	public String toString() {
		return "O TCC com titulo " + getTitulo() + " de tema "+ getGenero() + " possui " + getPaginas() + " páginas. Foi escrito por " + getAutor() + 
				", para a instituicao "+ instituicao + " e lançado na em " + getData() + "para o curso de " + curso + ". /n Sintese: " + getSintese();
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao() {
		this.instituicao = validacao(JOptionPane.showInputDialog(null, "Digite o titulo da obra"), "instituicao");
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso() {
		this.curso = validacao(JOptionPane.showInputDialog(null, "Digite o titulo da obra"), "curso");
	}
}
