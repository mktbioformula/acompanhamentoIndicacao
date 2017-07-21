package br.com.escola.dao.esp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.escola.bean.Disciplina;

public interface DisciplinaDaoI extends JpaRepository<Disciplina, Long>{

	public List<Disciplina> findByCargaHorariaLessThanAndNomeContaining(Integer i, String s);
	
}
