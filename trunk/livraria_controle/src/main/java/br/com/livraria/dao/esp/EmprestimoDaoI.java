package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Emprestimo;

public interface EmprestimoDaoI extends JpaRepository<Emprestimo, Long>{

}
