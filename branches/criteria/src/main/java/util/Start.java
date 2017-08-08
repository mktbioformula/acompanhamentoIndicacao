package util;

import java.util.List;

import bean.Aluno;
import bean.Curso;
import bean.Escola;
import bean.Professor;
import controle.Controle;
import dao.AlunoDao;
import dao.CursoDao;
import dao.EscolaDao;

public class Start {
	public static void main(String[] args) {

		// Controle.carregaDados();

		EscolaDao ed = new EscolaDao();

		List<Escola> escolas = ed.select();
		for (Escola escola : escolas) {
			escola.setCursos(ed.selectCursos(escola));

			System.out.println("-------------( Escola )------------");
			System.out.println(escola.getNome());
			List<Curso> cs = escola.getCursos();
			System.out.println("-------------( Cursos )------------");
			for (Curso curso : cs) {
				System.out.println(curso.getNome());
			}
			System.out.println("-----------------------------------");
		}

	}

}
