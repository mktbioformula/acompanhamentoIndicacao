package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Filial;
import dao.esp.FilialDaoI;
import util.HibernateUtil;

public class FilialDao implements FilialDaoI{

	public void insert(Filial cFilial) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(cFilial);
		tx.commit();
		s.close();
		
	}

	public List<Filial> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Filial> list = s.createCriteria(Filial.class).list();
		return list;

	}
	

}
