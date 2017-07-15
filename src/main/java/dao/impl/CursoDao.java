package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import bean.Curso;
import bean.Disciplina;
import bean.Turma;
import dao.esp.CursoDaoI;
import util.HibernateUtil;

public class CursoDao implements CursoDaoI {

	@Override
	public void insert(Curso curso) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(curso);
		transaction.commit();
		session.close();
	}

	@Override
	public void update(Curso curso) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(curso);
		transaction.commit();
		session.close();
	}

	@Override
	public void delete(Curso curso) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(curso);
		transaction.commit();
		session.close();
	}

	@Override
	public List<Curso> select() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Curso> list = session.createCriteria(Curso.class).list();
		session.close();
		return list;
	}
	
	@Override
	public Curso findById(Curso curso) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Curso c = (Curso) session.createCriteria(Curso.class)
				.add(Restrictions.idEq(curso.getId())).uniqueResult();
		c.setTurmas(this.selectTurmas(curso));
		c.setDisciplinas(this.selectDisciplinas(curso));
		session.close();
		return c;
	}
	
	public List<Turma> selectTurmas(Curso curso) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Turma> turmas = session.createCriteria(Turma.class)
				.createAlias("curso", "c")
				.add(Restrictions.eq("curso.id", curso.getId()))
				.list();
		session.close();
		return turmas;
	}
	
	private List<Disciplina> selectDisciplinas(Curso curso) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Disciplina> disciplinas = session.createCriteria(Disciplina.class)
				.createAlias("cursos", "c")
				.add(Restrictions.eq("curso.id", curso.getId()))
				.list();
		session.close();
		return disciplinas;
	}

}
