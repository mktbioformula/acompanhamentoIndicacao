package dao;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import bean.Aluno;
import bean.Curso;
import bean.Professor;

public class CursoDao {

	public void insert(Professor p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(p);
		tx.commit();
		s.close();
	}
	
	
	public Curso select(Professor p){

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Curso c = (Curso) s.createCriteria(Curso.class)
				.createAlias("professor", "p")
				.add(Restrictions.eq("p.nome", p.getNome()))
				.uniqueResult();
		s.close();
		sf.close();
		return c;
	}

	public Curso select(String nome){

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Curso c = (Curso) s.createCriteria(Curso.class)
				.add(Restrictions.eq("nome", nome))
				.uniqueResult();
		s.close();
		sf.close();
		return c;
	}
	
	
	public List<Curso> selectComProfessores() {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		List<Curso> ls = s.createCriteria(Curso.class)
				.setFetchMode("professor", FetchMode.JOIN)
				.list();
		s.close();
		sf.close();
		return ls;
	}

	public List<Curso> selectSemProfessores() {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		List<Curso> ls = s.createCriteria(Curso.class).list();
		s.close();
		sf.close();
		return ls;
	}

}
