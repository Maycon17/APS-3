import java.util.Scanner;

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
		return "O TCC " + getTitulo() + " com o tema "+ getGenero() + " possui " + getPaginas() + " páginas. Foi escrito por " + getAutor() + 
				", para a instituicao "+ instituicao + " e lançado na em " + getData() + "para o curso de " + curso + ". /n Sintese: " + getSintese();
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao() {
		this.instituicao = JOptionPane.showInputDialog(null, "Digite o nome da innstituição que este TCC foi designado");
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso() {
		this.curso = JOptionPane.showInputDialog(null, "Digite o curso que este TCC foi designado");
	}
}
