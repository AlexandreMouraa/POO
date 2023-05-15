public class Elevador 
{
	
	private int numero;
	private double limitePeso;
	private int qtdeAndares;
	private boolean ligado;
	private int andar;
	
	public Elevador(int num, double limite, int qtde) 
	{
		this.numero = num;
		this.limitePeso = limite;
		this.qtdeAndares = qtde;
		this.ligado = false;
		this.andar = 1;		
	}
	
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	public double getLimitePeso() 
	{
		return limitePeso;
	}
	
	public void setLimitePeso(double limitePeso) 
	{
		this.limitePeso = limitePeso;
	}
	
	public int getQtdeAndares() 
	{
		return qtdeAndares;
	}
	
	public void setQtdeAndares(int qtdeAndares) 
	{
		this.qtdeAndares = qtdeAndares;
	}
	
	public boolean isLigado() 
	{
		return ligado;
	}
	
	public void ligar() 
	{
		System.out.println("Ligando elevador " + numero);
		this.ligado = true;
	}
	
	public void desligar() 
	{
		System.out.println("Desligando elevador " +  numero);
		this.ligado = false;
	}
	
	public void subir(int andares) 
	{
		System.out.println("O elevador "+ numero + " vai subir " + andares + " andares");
		if (ligado) 
		{
			this.andar = this.andar + andares;
			if (this.andar > qtdeAndares) 
			{
				this.andar = this.qtdeAndares;
			}
		} else 
		{
			System.out.println("O elevador "+ numero + " não subiu pois estava desligado");
		}
	}
	
	public void descer(int andares) 
	{
		System.out.println("O elevador "+ numero + " vai descer " + andares + " andares");
		if (ligado) 
		{
			this.andar = this.andar - andares;
			if (this.andar < 1) 
			{
				this.andar = 1;
			}
		} 
		else 
		{
			System.out.println("O elevador "+ numero + " não desceu pois estava desligado");
		}
	}
	
	@Override
	public String toString() 
	{
		String status;
		if (ligado) 
		{
			status = "Ligado";
		} 
		else 
		{
			status = "Desligado";
		}
		return "\nDados do Elevador " + this.numero  + ": " + status + " - parado no " + andar + "o. andar - Total de andares = " + qtdeAndares + " capacidade = " + limitePeso + "kg";
	}
	
	public String igual(Elevador elevadorX) 
	{
		if ((this.numero == elevadorX.numero) && (this.qtdeAndares == elevadorX.qtdeAndares)) 
		{
			return "iguais";
		} 
		else 
		{
			return "diferentes";
		}		
	}
}