package dao;





import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import bean.Pessoa;
import util.HibernateUtil;

public class PessoaDao {

	public void gravar(Pessoa p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(p);
		tx.commit();
		s.close();
	}
	
	
	public void update(Pessoa p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(p);
		tx.commit();
		s.close();
	}
	
	public void delete(Pessoa p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(p);
		tx.commit();
		s.close();
	}
	
	
	public List<Pessoa> select(Pessoa p){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		List<Pessoa> retorno =
				s.createCriteria(Pessoa.class)
				.add(Restrictions.ilike("nome", p.getNome()))
				.list();
		
		return retorno;
		
	}

}
















