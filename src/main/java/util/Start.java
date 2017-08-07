package util;

import java.util.List;

import bean.Aluno;
import bean.Curso;
import bean.Professor;
import controle.Controle;
import dao.AlunoDao;
import dao.CursoDao;

public class Start {
	public static void main(String[] args) {

		//Controle.carregaDados();

		CursoDao cd = new CursoDao();
		AlunoDao ad = new AlunoDao();
		
		Aluno l = ad.selectNg("Thiago");
		
		System.out.println(l.getId());
		
		
		
	}

}
