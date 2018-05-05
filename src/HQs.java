import java.util.Scanner;

public class HQs extends Obras {
	//Atributos da classe
	private int paginas;
	
	//Método construtor
	HQs ()
	{
		super();
		
		//Solicitando para o usuário o número de páginas da obra
		Scanner entrada = new Scanner (System.in);
		int pag;
		
		System.out.println("Digite o número de páginas que a HQ possuí:");
		pag = entrada.nextInt();
		this.paginas = pag;
	}
	
	@Override
	public String toString() {
		return "A HQ " + getTitulo() + " de gênero "+ getGenero() +" possui " + paginas + " páginas. Foi escrito pelo autor " + getAutor() + 
				", distribuido pela editora "+ getEditora() + " e lançado em " + getData() + ". /n Sintese: " + getSintese();
	}
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
}
