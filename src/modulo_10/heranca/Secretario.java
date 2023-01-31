package modulo_10.heranca;

import modulo_10.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso
{
/* 	=================   Atributos: ========================================================================================*/
	private int registro;
	private String nivelCargo;
	private int esperiencia;
	private String usuario;
	private String senha;
	
	
/* 	=======================================================================================================================*/
	
	
	
	
/* 	=================   Métodos getters and setters: ======================================================================*/
	public int getRegistro() 
	{
		return registro;
	}
	
	public void setRegistro(int registro) 
	{
		this.registro = registro;
	}
	
	
	public String getNivelCargo()
	{
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) 
	{
		this.nivelCargo = nivelCargo;
	}
	
	
	public int getEsperiencia() 
	{
		return esperiencia;
	}
	public void setEsperiencia(int esperiencia) 
	{
		this.esperiencia = esperiencia;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
/* 	=======================================================================================================================*/

	
	
	
/* 	=================   Métodos de interfaces: ======================================================================*/
	@Override
	public boolean autenticar() {
		return (getUsuario().equals("admin") && getSenha().equals("admin"));
	}

	
/* 	=======================================================================================================================*/

	
	
}
