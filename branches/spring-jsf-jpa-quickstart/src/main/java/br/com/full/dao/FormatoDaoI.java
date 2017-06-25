package br.com.full.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Formato;

public interface FormatoDaoI  extends JpaRepository<Formato, Long>{

}
