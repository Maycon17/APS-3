//importa��o da biblioteca que permite efetuar a entrada de dados informadas pelo usu�rio
import javax.swing.JOptionPane;


public abstract class Obras {
	//Atributos da classe
	private String titulo, autor, editora, genero, sintese;
	private Data data;
	private int paginas;
	
	//M�todo construtor
	Obras()
	{
		//chamada dos metodos de declara��o de estados dos atributos
		setTitulo();
		setGenero();
		setEditora();
		setAutor();
		setPaginas();
		setSintese();
		
		//chamando o m�todo construtor da data para atribuir um estado para o atributo
		data = new Data();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo() {
		this.titulo = JOptionPane.showInputDialog(null, "Digite o titulo da obra");
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor() {
		this.autor = JOptionPane.showInputDialog(null, "Digite o(a) autor da obra");
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora() {
		this.editora = JOptionPane.showInputDialog(null, "Digite a editora da obra");
	}

	public String getData() {
		return data.toString();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero() {
		this.genero = JOptionPane.showInputDialog(null, "Digite o genero da obra");
	}

	public String getSintese() {
		return sintese;
	}

	public void setSintese() {
		this.sintese = JOptionPane.showInputDialog(null, "Digite a sintese da obra");
	}

	public int getPaginas() {
		return paginas;
	}
	
	public void setPaginas() {		
			
		boolean val = true;
		
		while(val)
		{
			//recebendo o n�mero de p�ginas do livro como tipo string
			String x = JOptionPane.showInputDialog(null, "Digite o n�mero de p�ginas que o livro possu�");
			
			//Variavel de controle para saber quantas vezes ele detectou um caracter
			int cont = 0;
			
			//inicio do loop para verificar se todos os digitos s�o n�meros
			for (int i = 0; i < x.length(); i++)
			{
				//caso aja um caracter ser� incorreto
				if(Character.isDigit(x.charAt(i)) == false)
				{
					JOptionPane.showMessageDialog(null, "N�mero de p�ginas inv�lido");
					//caso tenha um caracter incrementar 1
					cont ++;
					break;
				}
			}
			
			//verificar se h� algum caracter no valor informado
			if(cont == 0)
			{
				//verificar se o valor numerico � maior que 0
				if(Integer.parseInt(x) > 0)
				{
					this.paginas = Integer.parseInt(x);
					val = false;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "N�mero de p�ginas inv�lido");
				}
			}
		}
	}
}
