
public class Data {
	private int dia, mes, ano;

	Data (int dia, int mes, int ano)
	{
		setAno(ano);
		setMes(mes);
		setDia(dia);
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		
		if (ano % 4 == 0 || ano % 100 != 0 || ano % 400 == 0)
		{
			if (mes == 2)
			{
				if (dia >0 && dia <= 29)
				{
					this.dia = dia;
				}
			}
		}
		else
		{
			if (mes == 2)
			{
				if (dia >0 && dia <= 29)
				{
					this.dia = dia;
				}
			}
			else if (mes == 8 || mes == 10 || mes == 12 || mes % 2 != 0)
			{
				if (dia > 0 && dia <= 31)
				{
					this.dia = dia;
				}
			}
			else if (mes == 9 || mes == 11 || mes %2 == 0)
			{
				if (dia > 0 && dia <= 30)
				{
					this.dia = dia;
				}
			}
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		
		if (mes > 0 && mes <= 12)
		{
			this.mes = mes;
		}
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		
		if (ano <= 9999)
		{
			this.ano = ano;
		}
	}
	
}
