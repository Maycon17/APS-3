import java.util.Scanner;

public class Livro extends Obras {
	//Atributos da classe
	private int paginas;
	
	//M�todo construtor
	Livro()
	{
		super();
		
		//Solicitando para o usu�rio o n�mero de p�ginas da obra
		Scanner entrada = new Scanner (System.in);
		int pag;
		
		System.out.println("Digite o n�mero de p�ginas que o livro possu�:");
		pag = entrada.nextInt();
		this.paginas = pag;
	}

	@Override
	public String toString() {
		return "O Livro " + getTitulo() + " de g�nero "+ getGenero() +" possui " + paginas + " p�ginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lan�ado em " + getData() + ".\nSintese: " + getSintese();
	}
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
		
	}
}
