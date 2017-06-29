package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Lingua;
import bean.Pais;
import dao.esp.LinguaDaoI;
import util.HibernateUtil;

public class LinguaDao implements LinguaDaoI {


	public void insert(Lingua p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(p);
		tx.commit();
		s.close();
	}

	public List<Lingua> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Lingua> list = s.createCriteria(Lingua.class).list();
		return list;
	}

}
