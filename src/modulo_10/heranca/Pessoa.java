package modulo_10.heranca;



public abstract class Pessoa 
{
/* 	=================   Atributos: ========================================================================================*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private long registroGeral;
	private long cpf;
	private String nomeMae;
	private String nomePai;

	
/* 	=======================================================================================================================*/
	

	
	
/* 	=================   Métodos: ==========================================================================================*/
	public boolean maiorDeIdade(Pessoa objeto)
	{
		return (objeto.getIdade() >= 18);
	}
	
	
/* 	=======================================================================================================================*/

	
	
	
/* 	=================   Métodos getters and setters: ======================================================================*/
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	
	public int getIdade() 
	{
		return idade;
	}
	
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	
	
	public String getDataNascimento() 
	{
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) 
	{
		this.dataNascimento = dataNascimento;
	}
	
	
	public long getRegistroGeral() 
	{
		return registroGeral;
	}
	public void setRegistroGeral(long registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	public long getCpf() 
	{
		return cpf;
	}
	
	
	public void setCpf(long cpf) 
	{
		this.cpf = cpf;
	}
	
	public String getNomeMae() 
	{
		return nomeMae;
	}
	
	
	public void setNomeMae(String nomeMae) 
	{
		this.nomeMae = nomeMae;
	}
	
	public String getNomePai() 
	{
		return nomePai;
	}
	
	public void setNomePai(String nomePai) 
	{
		this.nomePai = nomePai;
	}

	
/* 	=======================================================================================================================*/

}
