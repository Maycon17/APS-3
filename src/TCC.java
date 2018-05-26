import javax.swing.JOptionPane;

public class TCC extends Obras {
	private String instituicao, curso;
	
	//M�todo construtor
	TCC ()
	{
		super();
		
		setInstituicao();
		setCurso();
	}
	
	@Override
	public String toString() {
		return "O TCC com titulo " + getTitulo() + " de tema "+ getGenero() + " possui " + getPaginas() + " p�ginas. Foi escrito por " + getAutor() + 
				", para a instituicao "+ instituicao + " e lan�ado na em " + getData() + "para o curso de " + curso + ". /n S�ntese: " + getSintese();
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao() {
		this.instituicao = validacao(JOptionPane.showInputDialog(null, "Digite o nome da institui��o destinada do TCC"), "instituicao");
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso() {
		this.curso = validacao(JOptionPane.showInputDialog(null, "Digite o curso a qual o TCC foi desenvolvido"), "curso");
	}
}
