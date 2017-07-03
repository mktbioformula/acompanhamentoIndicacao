package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Genero;
import dao.esp.GeneroDaoI;
import util.HibernateUtil;

public class GeneroDao implements GeneroDaoI {

	public void ferrou(){
		
	}
	
	public void insert(Genero g) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(g);
		tx.commit();
		s.close();
	}

	public List<Genero> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Genero> list = s.createCriteria(Genero.class).list();
		return list;
	}

}
