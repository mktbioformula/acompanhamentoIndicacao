package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Usuario;
import dao.esp.UsuarioDaoI;
import util.HibernateUtil;

public class UsuarioDao implements UsuarioDaoI {

	public void insert(Usuario l) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(l);
		tx.commit();
		s.close();		
	}

	public List<Usuario> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();		
		Session s = sf.openSession();
		List<Usuario> list = s.createCriteria(Usuario.class).list();
		return list;
	}

}
