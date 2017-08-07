package controle;

import java.util.ArrayList;
import java.util.List;

import bean.Aluno;
import bean.Curso;
import bean.Escola;
import bean.Professor;
import dao.EscolaDao;

public class Controle {

	public static void carregaDados() {
		List<Aluno> alunosC1 = new ArrayList<Aluno>();
		List<Aluno> alunosC2 = new ArrayList<Aluno>();
		List<Aluno> alunosC3 = new ArrayList<Aluno>();
		List<Aluno> alunosC4 = new ArrayList<Aluno>();
		List<Aluno> alunosC5 = new ArrayList<Aluno>();
		

		Aluno a1 = new Aluno();
		a1.setNome("Julia");

		Aluno a2 = new Aluno();
		a2.setNome("Andreia");

		Aluno a3 = new Aluno();
		a3.setNome("Thiago");

		Aluno a4 = new Aluno();
		a4.setNome("Manuela");

		Aluno a5 = new Aluno();
		a5.setNome("Sofia");

		Aluno a6 = new Aluno();
		a6.setNome("Isabella");

		Aluno a7 = new Aluno();
		a7.setNome("Arthur");

		Aluno a8 = new Aluno();
		a8.setNome("Guilherme");

		Aluno a9 = new Aluno();
		a9.setNome("Davi");

		Aluno a10 = new Aluno();
		a10.setNome("Maria Eduarda");
		
		
		Aluno a11 = new Aluno();
		a11.setNome("Luciana de Sousa");
		
		
		Aluno a12 = new Aluno();
		a12.setNome("Fernanda Nascimento");
		
		
		Aluno a13 = new Aluno();
		a13.setNome("Andreia Rodrigues");
		
		
		Aluno a14 = new Aluno();
		a14.setNome("Luana Ferreira");

		Aluno a15 = new Aluno();
		a15.setNome("Thiago Fernandes");

		alunosC1.add(a1);
		alunosC1.add(a2);
		alunosC1.add(a3);
		alunosC1.add(a4);
		alunosC1.add(a5);
		alunosC1.add(a6);
		alunosC1.add(a7);
		alunosC1.add(a8);
		alunosC1.add(a9);
		alunosC1.add(a10);
		alunosC1.add(a15);
		alunosC1.add(a14);
		alunosC1.add(a13);
		

		alunosC2.add(a1);
		alunosC2.add(a2);
		alunosC2.add(a3);
		alunosC2.add(a4);
		alunosC2.add(a5);
		alunosC2.add(a6);
		alunosC2.add(a11);
		alunosC2.add(a12);

		alunosC3.add(a7);
		alunosC3.add(a8);
		alunosC3.add(a9);
		alunosC3.add(a10);
		alunosC3.add(a1);
		alunosC3.add(a2);
		alunosC3.add(a3);
		alunosC3.add(a11);
		alunosC3.add(a15);

		alunosC4.add(a6);
		alunosC4.add(a7);
		alunosC4.add(a8);
		alunosC4.add(a9);
		alunosC4.add(a9);
		alunosC4.add(a11);
		alunosC4.add(a12);
		alunosC4.add(a13);
		alunosC4.add(a14);
		
		
		
		alunosC5.add(a10);
		alunosC5.add(a11);
		alunosC5.add(a12);
		alunosC5.add(a13);
		alunosC5.add(a14);
		alunosC5.add(a15);

		Professor p1 = new Professor();
		p1.setNome("Kathy Sierra");

		Professor p2 = new Professor();
		p2.setNome("Richard Stallman");

		Professor p3 = new Professor();
		p3.setNome("Guido van Rossum");

		Professor p4 = new Professor();
		p4.setNome("Larry Ellison");

		Professor p5 = new Professor();
		p5.setNome("Mlon Musk");
		
		
		Curso c1 = new Curso();
		c1.setNome("Java");
		c1.setAlunos(alunosC1);
		c1.setProfessor(p1);

		Curso c2 = new Curso();
		c2.setNome("Linux");
		c2.setAlunos(alunosC2);
		c2.setProfessor(p2);

		Curso c3 = new Curso();
		c3.setNome("Python");
		c3.setAlunos(alunosC3);
		c3.setProfessor(p3);

		Curso c4 = new Curso();
		c4.setNome("Oracle 11G");
		c4.setAlunos(alunosC4);
		c4.setProfessor(p4);
		
		
		
		Curso c5 = new Curso();
		c5.setNome("Zeraneo a Vida");
		c5.setAlunos(alunosC5);
		c5.setProfessor(p5);

		Escola e = new Escola();
		c1.setEscola(e);
		c2.setEscola(e);
		c3.setEscola(e);
		c4.setEscola(e);
		c5.setEscola(e);

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		cursos.add(c5);

		e.setNome("Escola de T.I.");
		e.setCursos(cursos);

		EscolaDao ed = new EscolaDao();
		ed.insert(e);
	}

}
