package br.com.full.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.ClientePessoaJuridica;

public interface ClientePessoaJuridicaDaoI extends JpaRepository<ClientePessoaJuridica, Long> {

}
