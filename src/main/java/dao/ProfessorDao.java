package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import bean.Professor;

public class ProfessorDao {
	
	public void insert(Professor p){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(p);
		tx.commit();
		
	}
	
	public List<Professor> select(){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Professor> l = s.createCriteria(Professor.class).list();
		tx.commit();
		s.close();
		return l;

	}
	
	public List<Professor> select(String nome){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Professor> l = s.createCriteria(Professor.class)
				.add(Restrictions.like("nome", nome)).list();
		tx.commit();
		s.close();
		return l;

	}

}
