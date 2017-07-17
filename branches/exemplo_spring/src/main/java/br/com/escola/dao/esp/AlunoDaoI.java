package br.com.escola.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.escola.bean.Aluno;

public interface AlunoDaoI extends JpaRepository<Aluno, Long>  {
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

}
