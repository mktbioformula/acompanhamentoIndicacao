package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Aluno;
import dao.esp.AlunoDaoI;
import util.HibernateUtil;

public class AlunoDao implements AlunoDaoI {

	@Override
	public void insert(Aluno aluno) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(aluno);
		transaction.commit();
		session.close();
	}

	@Override
	public void update(Aluno aluno) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(aluno);
		transaction.commit();
		session.close();
	}

	@Override
	public void delete(Aluno aluno) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(aluno);
		transaction.commit();
		session.close();
	}

	@Override
	public List<Aluno> select() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Aluno> list = session.createCriteria(Aluno.class).list();
		session.close();
		return list;
	}

	@Override
	public List<Aluno> selectMatriculados() {
		return null;
	}

}
