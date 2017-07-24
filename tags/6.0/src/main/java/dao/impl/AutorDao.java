package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Autor;
import dao.esp.AutorDaoI;
import util.HibernateUtil;

public class AutorDao implements AutorDaoI {

	public void insert(Autor a) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(a);
		tx.commit();
		s.close();
	}

	public List<Autor> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		List<Autor> list = s.createCriteria(Autor.class).list();
		return list;
	}
	

}
