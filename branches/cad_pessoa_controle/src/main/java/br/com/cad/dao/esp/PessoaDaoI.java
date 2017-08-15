package br.com.cad.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cad.bean.Pessoa;

public interface PessoaDaoI 
extends JpaRepository<Pessoa, Long> {

}
