package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Cerveja;
import dao.esp.CervejaDaoI;
import util.HibernateUtil;

public class CervejaDao implements CervejaDaoI {

	public void insert(Cerveja c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(c);
		tx.commit();
		s.close();
	}

	public List<Cerveja> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Cerveja> list = s.createCriteria(Cerveja.class).list();
		return list;
	}

	
}
