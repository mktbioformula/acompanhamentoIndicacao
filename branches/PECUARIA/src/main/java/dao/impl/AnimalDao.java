package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Animal;
import dao.esp.AnimalDaoI;
import util.HibernateUtil;

public class AnimalDao implements AnimalDaoI {

	public void insert(Animal cAnimal) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(cAnimal);
		tx.commit();
		s.close();
	}

	public List<Animal> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Animal> list = s.createCriteria(Animal.class).list();
		return list;
	}
	
}
