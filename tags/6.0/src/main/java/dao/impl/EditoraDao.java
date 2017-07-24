package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Editora;
import controle.esp.EditoraBCI;
import util.HibernateUtil;

public class EditoraDao implements EditoraBCI {

	public void inserir(Editora e) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session se = sf.openSession();
		Transaction t = se.beginTransaction();
		se.persist(e);
		t.commit();
		se.close();
		
	}

	public List<Editora> select() {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session se = sf.openSession();
		Transaction t = se.beginTransaction();
		List<Editora> lista = se.createCriteria(Editora.class).list();
		
		return null;
	}

}
