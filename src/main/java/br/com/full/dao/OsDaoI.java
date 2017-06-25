package br.com.full.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.OS;

public interface OsDaoI extends JpaRepository<OS, Long>{

}
