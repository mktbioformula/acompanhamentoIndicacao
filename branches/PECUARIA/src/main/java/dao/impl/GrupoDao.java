package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Grupo;
import util.HibernateUtil;

public class GrupoDao {
	
	public void insert(Grupo cGrupo) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(cGrupo);
		tx.commit();
		s.close();
		
	}

	public List<Grupo> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Grupo> list = s.createCriteria(Grupo.class).list();
		return list;

	}
	

}
