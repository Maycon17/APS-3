import java.util.Scanner;

public class TCC extends Obras {
	//Atributos da classe
	private int paginas;
	private String instituicao, curso;
	
	//M�todo construtor
	TCC ()
	{
		super();
		
//===================================Solicitando para o usu�rio a entrada de dados===================================
		
		//Solicitando para o usu�rio o n�mero de p�ginas da obra
		Scanner entrada = new Scanner (System.in);
		int pag;
		
		System.out.println("Digite o n�mero de p�ginas que o TCC possu�:");
		pag = entrada.nextInt();
		this.paginas = pag;
		
		
		//Solicitando para o usu�rio a institui��o e o curso do TCC
		Scanner entradaString = new Scanner (System.in);
		String inst;
		String course;
		
		System.out.println("Digite a institui��o de ensino que foi destinado o TCC");
		inst = entradaString.nextLine();
		this.instituicao = inst;
		
		System.out.println("Digite o curso que o TCC foi destinado");
		course = entradaString.nextLine();
		this.curso = course;
	}
	
	@Override
	public String toString() {
		return "O TCC " + getTitulo() + " com o tema "+ getGenero() + " possui " + paginas + " p�ginas. Foi escrito por " + getAutor() + 
				", para a instituicao "+ instituicao + " e lan�ado na em " + getData() + "para o curso de " + curso + ". /n Sintese: " + getSintese();
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
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
