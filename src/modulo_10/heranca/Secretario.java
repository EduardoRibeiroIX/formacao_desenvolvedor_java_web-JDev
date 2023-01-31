package modulo_10.heranca;

import modulo_10.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso
{
/* 	=================   Atributos: ========================================================================================*/
	private int registro;
	private String nivelCargo;
	private int esperiencia;
	
	
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
	
	
/* 	=======================================================================================================================*/

	
	
	
/* 	=================   Métodos de interfaces: ======================================================================*/
	@Override
	public boolean autenticar(String usuario, String senha) {
		return (usuario.equals("admin") && senha.equals("admin"));
	}

	
/* 	=======================================================================================================================*/

	
	
}
