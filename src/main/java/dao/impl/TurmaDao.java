package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Turma;
import dao.esp.TurmaDaoI;
import util.HibernateUtil;

public class TurmaDao implements TurmaDaoI {

	@Override
	public void insert(Turma turma) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(turma);
		transaction.commit();
		session.close();
	}

	@Override
	public void update(Turma turma) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(turma);
		transaction.commit();
		session.close();
	}

	@Override
	public void delete(Turma turma) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(turma);
		transaction.commit();
		session.close();
	}

	@Override
	public List<Turma> select() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Turma> list = session.createCriteria(Turma.class).list();
		session.close();
		return list;
	}

}
