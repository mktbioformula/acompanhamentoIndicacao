package dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Pessoa;
import util.HibernateUtil;

public class PessoaDao {
	
	public boolean insert(Pessoa p){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(p);
		tx.commit();
		s.close();
		return true;
	}
	
	public void delete(Pessoa p){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(p);
		tx.commit();
		s.close();
	}
	
	public void update(Pessoa p){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(p);
		tx.commit();
		s.close();
	}
	
	public List<Pessoa> select(){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		List<Pessoa> l = s.createCriteria(Pessoa.class).list();
		return l;
	}
	
}







