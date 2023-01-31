package modulo_10.heranca;

public class Diretor extends Pessoa 
{

/* 	=================   Atributos: ========================================================================================*/
	private int registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	
/* 	=======================================================================================================================*/
	
	
	
	
/* 	=================   Métodos getters and setters: ======================================================================*/
	public int getRegistroEducacao() 
	{
		return registroEducacao;
	}
	
	public void setRegistroEducacao(int registroEducacao) 
	{
		this.registroEducacao = registroEducacao;
	}
	
	
	public int getTempoDirecao() 
	{
		return tempoDirecao;
	}
	
	public void setTempoDirecao(int tempoDirecao) 
	{
		this.tempoDirecao = tempoDirecao;
	}
	
	
	public String getTitulacao() 
	{
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) 
	{
		this.titulacao = titulacao;
	}
	
	
/* 	=======================================================================================================================*/
	
}
