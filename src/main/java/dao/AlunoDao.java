package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import bean.Aluno;
import bean.Curso;
import bean.Professor;

public class AlunoDao {

	public List<Aluno> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Aluno> l = s.createCriteria(Aluno.class).list();
		tx.commit();
		s.close();
		return l;

	}

}
