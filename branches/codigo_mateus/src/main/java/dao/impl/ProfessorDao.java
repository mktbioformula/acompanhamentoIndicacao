package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Professor;
import dao.esp.ProfessorDaoI;
import util.HibernateUtil;

public class ProfessorDao implements ProfessorDaoI {

	@Override
	public void insert(Professor professor) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(professor);
		transaction.commit();
		session.close();
	}

	@Override
	public void update(Professor professor) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(professor);
		transaction.commit();
		session.close();
	}

	@Override
	public void delete(Professor professor) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(professor);
		transaction.commit();
		session.close();
	}

	@Override
	public List<Professor> select() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Professor> list = session.createCriteria(Professor.class).list();
		session.close();
		return list;
	}

}
