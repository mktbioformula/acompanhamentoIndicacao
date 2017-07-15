package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Disciplina;
import dao.esp.DisciplinaDaoI;
import util.HibernateUtil;

public class DisciplinaDao implements DisciplinaDaoI {

	@Override
	public void insert(Disciplina disciplina) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(disciplina);
		transaction.commit();
		session.close();
	}

	@Override
	public void update(Disciplina disciplina) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(disciplina);
		transaction.commit();
		session.close();
	}

	@Override
	public void delete(Disciplina disciplina) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(disciplina);
		transaction.commit();
		session.close();
	}

	@Override
	public List<Disciplina> select() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Disciplina> list = session.createCriteria(Disciplina.class).list();
		session.close();
		return list;
	}

}
