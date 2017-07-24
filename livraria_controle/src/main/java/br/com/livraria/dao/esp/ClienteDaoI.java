package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Cliente;

public interface ClienteDaoI extends JpaRepository<Cliente, Long>{

}
