package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Emprestimo;
import bean.Genero;
import dao.esp.EmprestimoDaoI;
import util.HibernateUtil;

public class EmprestimoDao implements EmprestimoDaoI {

	public void insert(Emprestimo e) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(e);
		tx.commit();
		s.close();
		
	}

	public List<Emprestimo> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		List<Emprestimo> list = s.createCriteria(Emprestimo.class).list();
		
		return list;
	}

}
