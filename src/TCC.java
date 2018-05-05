import java.util.Scanner;

public class TCC extends Obras {
	private String instituicao, curso;
	
	//Método construtor
	TCC ()
	{
		super();
		
//===================================Solicitando para o usuário a entrada de dados===================================
		
		//Solicitando para o usuário a instituição e o curso do TCC
		Scanner entradaString = new Scanner (System.in);
		String inst;
		String course;
		
		System.out.println("Digite a instituição de ensino que foi destinado o TCC");
		inst = entradaString.nextLine();
		this.instituicao = inst;
		
		System.out.println("Digite o curso que o TCC foi destinado");
		course = entradaString.nextLine();
		this.curso = course;
	}
	
	@Override
	public String toString() {
		return "O TCC " + getTitulo() + " com o tema "+ getGenero() + " possui " + getPaginas() + " páginas. Foi escrito por " + getAutor() + 
				", para a instituicao "+ instituicao + " e lançado na em " + getData() + "para o curso de " + curso + ". /n Sintese: " + getSintese();
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
