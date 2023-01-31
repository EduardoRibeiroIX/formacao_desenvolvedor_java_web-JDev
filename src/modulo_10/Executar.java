package modulo_10;


import modulo_10.heranca.Aluno;


public class Executar 
{

	public static void main(String[] args) 
	{
		
		Aluno aluno1 = new Aluno();
		aluno1.adicionarDisciplina("PHP");
		aluno1.adicionarDisciplina("Java");
		aluno1.adicionarDisciplina("flexbox");
		
		System.out.println(aluno1.getDisciplinas());
		
		aluno1.removerDisciplina("php");
		aluno1.removerDisciplina("java");
		aluno1.removerDisciplina("flexbox");
		System.out.println(aluno1.getDisciplinas());
		
	}

}
