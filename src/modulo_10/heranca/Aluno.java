package modulo_10.heranca;


/* 	=================   Importações: ==========================================================================================*/
import java.util.ArrayList;
import java.util.List;


/* 	=======================================================================================================================*/


public class Aluno extends Pessoa
{
/* 	=================   Atributos: ========================================================================================*/
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<String> disciplinas = new ArrayList<String>();
	
	
/* 	=======================================================================================================================*/
	
	
	
	
/* 	=================   Métodos: ==========================================================================================*/
	public void removerDisciplina(String disciplina)
	{
		
		for (int i = 0; i < getDisciplinas().size(); i++)
		{
			
			if (disciplina.equalsIgnoreCase(getDisciplinas().get(i)))
			{
				getDisciplinas().remove(i);
				setDisciplinas(getDisciplinas());
			}
			
		}
		
	}
	
	
	public void adicionarDisciplina(String disciplina)
	{
		getDisciplinas().add(disciplina);
		setDisciplinas(getDisciplinas());
	}
	
	
/* 	=======================================================================================================================*/
	
	
	
	
/* 	=================   Métodos getters and setters: ======================================================================*/
	public String getDataMatricula() 
	{
		return dataMatricula;
	}
	
	public void setDataMatricula(String dataMatricula) 
	{
		this.dataMatricula = dataMatricula;
	}
	
	
	public String getNomeEscola() 
	{
		return nomeEscola;
	}
	
	public void setNomeEscola(String nomeEscola) 
	{
		this.nomeEscola = nomeEscola;
	}
	
	
	public String getSerieMatriculado() 
	{
		return serieMatriculado;
	}
	
	public void setSerieMatriculado(String serieMatriculado) 
	{
		this.serieMatriculado = serieMatriculado;
	}
	
	
	public List<String> getDisciplinas() 
	{
		return disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) 
	{
		this.disciplinas = disciplinas;
	}
	
	
/* 	=======================================================================================================================*/
	
}
