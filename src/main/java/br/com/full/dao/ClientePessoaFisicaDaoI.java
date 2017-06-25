package br.com.full.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Cliente;
import br.com.full.bean.ClientePessoaFisica;

public interface ClientePessoaFisicaDaoI extends JpaRepository<ClientePessoaFisica, Long>{
	public List<ClientePessoaFisica> findByNome(String s);
}
