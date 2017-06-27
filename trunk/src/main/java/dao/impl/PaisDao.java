package dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Pais;
import dao.esp.PaisDaoI;
import util.HibernateUtil;

public class PaisDao implements PaisDaoI {
	
	public void insert(Pais p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(p);
		tx.commit();
		s.close();
	}

	public List<Pais> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Pais> list = s.createCriteria(Pais.class).list();
		return list;
	}


}
