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

	
	public Aluno selectNg(String nome) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Aluno l = (Aluno) s.getNamedQuery("selectAlunos")
				.setParameter("nome", nome)
				.uniqueResult();
		tx.commit();
		s.close();
		return l;

	}
	
	
	public List<Aluno> select(Curso c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Aluno> l = s.createCriteria(Aluno.class)
				.createAlias("cursos", "cs")
				.add(Restrictions.eq("cs.nome", c.getNome()))
				.list();
		tx.commit();
		s.close();
		return l;

	}

}
