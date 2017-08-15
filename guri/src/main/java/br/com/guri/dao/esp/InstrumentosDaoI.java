package br.com.guri.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guri.bean.Instrumentos;

public interface InstrumentosDaoI extends JpaRepository<Instrumentos, Long> {
	
	

}
