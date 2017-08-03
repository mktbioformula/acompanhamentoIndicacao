package br.com.relatorio.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.relatorio.bean.Pessoa;
import br.com.relatorio.dao.esp.PessoaDaoI;
import br.com.relatorio.util.HibernateUtil;

public class PessoaDao implements PessoaDaoI {

	public void insert(Pessoa pessoa) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(pessoa);
		tx.commit();
		s.close();
	}

	public List<Pessoa> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Pessoa> list = s.createCriteria(Pessoa.class).list();
		return list;
	}

}
