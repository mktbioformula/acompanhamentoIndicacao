package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Raca;
import util.HibernateUtil;

public class RacaDao {
	
	public void insert(Raca cRaca) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(cRaca);
		tx.commit();
		s.close();
		
	}

	public List<Raca> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Raca> list = s.createCriteria(Raca.class).list();
		return list;

	}
	

}
