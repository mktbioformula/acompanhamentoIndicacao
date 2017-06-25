package br.com.full.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Vendedor;

public interface VendedorDaoI extends JpaRepository<Vendedor, Long> {

}
