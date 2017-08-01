package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Usuario;

public interface UsuarioDaoI extends JpaRepository<Usuario, Long> {

}
