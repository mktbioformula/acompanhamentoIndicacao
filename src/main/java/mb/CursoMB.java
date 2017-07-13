package mb;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Curso;
import bean.Professor;
import util.HibernateUtil;

@ManagedBean(name = "CursoMB")
public class CursoMB {

	
	public void teste(){
		Professor p = new Professor();
		p.setNome("João");
		
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		
		List<Curso> cursos = s.createCriteria(Curso.class).list();
		
		for (Curso curso : cursos) {
			
		}
		s.close();

		
		
		
		
	}
	
	
}



