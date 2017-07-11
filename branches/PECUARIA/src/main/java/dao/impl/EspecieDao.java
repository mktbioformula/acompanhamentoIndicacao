package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Especie;
import util.HibernateUtil;

public class EspecieDao {
	public void insert(Especie cEspecie) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(cEspecie);
		tx.commit();
		s.close();
		
	}

	public List<Especie> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Especie> list = s.createCriteria(Especie.class).list();
		return list;

	}
	

}
