package br.com.full.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Papel;

public interface PapelDaoI  extends JpaRepository<Papel, Long>{

}
