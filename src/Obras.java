//importação da biblioteca que permite efetuar a entrada de dados informadas pelo usuário
import java.util.Scanner;

public abstract class Obras {
	//Atributos da classe
	private String titulo, autor, editora, genero, sintese;
	private Data data;
	
	//Método construtor
	Obras()
	{
//==============================Criação dos objetos para a entrada de dados do usuário==============================
		Scanner entradaString = new Scanner (System.in); 
		String entrada [] = new String [6];		
		
//=============================Laço de repetição para solicitar os dados para o usuário ============================
		for (int i = 0; i <= entrada.length; i ++)
		{
			switch (i)
			{
				//solicitando o titulo da obra
				case 0:
					System.out.println("Digite o titulo da obra");
					entrada [i] = entradaString.nextLine();
					this.titulo = entrada [i];
					break;
				
				//solicitando o autor da obra
				case 1:
					System.out.println("Digite o(a) autor da obra");
					entrada [i] = entradaString.nextLine();
					this.autor = entrada [i];
					break;
				
				//solicitando a editora da obra
				case 2:
					System.out.println("Digite a editora da obra");
					entrada [i] = entradaString.nextLine();
					this.editora = entrada [i];
					break;
				
				//solicitando o genero da obra
				case 3:
					System.out.println("Digite o genero da obra");
					entrada [i] = entradaString.nextLine();
					this.genero = entrada [i];
					break;
				
				//solicitando a sintese da obra
				case 4:
					System.out.println("Digite a sintese da obra");
					entrada [i] = entradaString.nextLine();
					this.sintese = entrada [i];
					break;
				
				//solictando a data de lançamento da obra
				case 5:
					System.out.println("Digite a data de lançamento da obra");
					entrada [i] = entradaString.nextLine();
					this.data = new Data (entrada [i]);
					break;
					
			}
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getData() {
		return data.toString();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSintese() {
		return sintese;
	}

	public void setSintese(String sintese) {
		this.sintese = sintese;
	}
}
