package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Curral;
import util.HibernateUtil;

public class CurralDao {
	
	public void insert(Curral cCurral) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(cCurral);
		tx.commit();
		s.close();
		
	}

	public List<Curral> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Curral> list = s.createCriteria(Curral.class).list();
		return list;

	}
	

}
