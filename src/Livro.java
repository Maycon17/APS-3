import java.util.Scanner;

public class Livro extends Obras {
	//Atributos da classe
	private int paginas;
	
	//Método construtor
	Livro()
	{
		super();
		
		//Solicitando para o usuário o número de páginas da obra
		Scanner entrada = new Scanner (System.in);
		int pag;
		
		System.out.println("Digite o número de páginas que o livro possuí:");
		pag = entrada.nextInt();
		this.paginas = pag;
	}

	@Override
	public String toString() {
		return "O Livro " + getTitulo() + " de gênero "+ getGenero() +" possui " + paginas + " páginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lançado em " + getData() + ".\nSintese: " + getSintese();
	}
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
		
	}
}
