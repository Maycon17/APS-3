//importação da biblioteca que permite efetuar a entrada de dados informadas pelo usuário
import javax.swing.JOptionPane;


public abstract class Obras {
	//Atributos da classe
	private String titulo, autor, editora, genero, sintese;
	private Data data;
	private int paginas;
	
	//Método construtor
	Obras()
	{
		//chamada dos metodos de declaração de estados dos atributos
		setTitulo();
		setGenero();
		setEditora();
		setAutor();
		setPaginas();
		setSintese();
		
		//chamando o método construtor da data para atribuir um estado para o atributo
		data = new Data();
	}
	
	protected String validacao(String valido, String campo)
	{
		while(valido.equals(""))
		{
			valido = JOptionPane.showInputDialog(null, "Favor digite um valor válido para " + campo);
		}
		
		return valido;
		
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo() {				
		this.titulo = validacao(JOptionPane.showInputDialog(null, "Digite o titulo da obra"), "titulo");
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor() {
		this.autor = validacao(JOptionPane.showInputDialog(null, "Digite o autor da obra"), "autor");
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora() {
		this.editora = validacao(JOptionPane.showInputDialog(null, "Digite o editora da obra"), "editora");
	}

	public String getData() {
		return data.toString();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero() {
		this.genero = validacao(JOptionPane.showInputDialog(null, "Digite o genero da obra"), "genero");
	}

	public String getSintese() {
		return sintese;
	}

	public void setSintese() {
		this.sintese = validacao(JOptionPane.showInputDialog(null, "Digite o sintese da obra"), "sintese");
	}

	public int getPaginas() {
		return paginas;
	}
	
	public void setPaginas() {		
			
		boolean val = true;
		
		while(val)
		{
			//recebendo o número de páginas da obra como tipo string
			String x = JOptionPane.showInputDialog(null, "Digite o número de páginas que a obra possuí");
			
			//Variavel de controle para saber quantas vezes ele detectou um caracter
			int cont = 0;
			
			//inicio do loop para verificar se todos os digitos são números
			for (int i = 0; i < x.length(); i++)
			{
				//caso aja um caracter será incorreto
				if(Character.isDigit(x.charAt(i)) == false)
				{
					JOptionPane.showMessageDialog(null, "Número de páginas inválido");
					//caso tenha um caracter incrementar 1
					cont ++;
					break;
				}
			}
			
			//verificar se há algum caracter no valor informado
			if(cont == 0)
			{
				//verificar se o valor numerico é maior que 0
				if(Integer.parseInt(x) > 0)
				{
					this.paginas = Integer.parseInt(x);
					val = false;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Número de páginas inválido");
				}
			}
		}
	}
}
