package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Lote;
import util.HibernateUtil;

public class LoteDao {
	
	public void insert(Lote cLote) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(cLote);
		tx.commit();
		s.close();
		
	}

	public List<Lote> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Lote> list = s.createCriteria(Lote.class).list();
		return list;

	}
	

}
