package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Livro;
import dao.esp.LivroDaoI;
import util.HibernateUtil;

public class LivroDao implements LivroDaoI {

	public void ferrou(){
		
	}
	
	public void insert(Livro l) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(l);
		tx.commit();
		s.close();
	}

	public List<Livro> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		List<Livro> list = s.createCriteria(Livro.class).list();
		return list;
	}

}
