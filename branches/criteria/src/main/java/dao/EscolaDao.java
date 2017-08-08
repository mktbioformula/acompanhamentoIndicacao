package dao;

import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import bean.Aluno;
import bean.Curso;
import bean.Escola;

public class EscolaDao {
	public void insert(Escola e) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(e);
		tx.commit();
		s.close();
	}

	
	
	
	public List<Curso> selectCursos(Escola e) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Curso> l = s.createCriteria(Curso.class)
				.createAlias("escola", "e")
				.add(Restrictions.eq("e.id", e.getId()))
				.list();
		tx.commit();
		s.close();
		return l;

	}
	
	
	public List<Escola> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Escola> l = s.createCriteria(Escola.class).list();
		tx.commit();
		s.close();
		return l;
	}
}
