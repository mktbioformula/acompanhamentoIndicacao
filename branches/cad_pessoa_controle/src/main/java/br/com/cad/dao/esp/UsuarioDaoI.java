package br.com.cad.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cad.bean.Usuario;

public interface UsuarioDaoI 
extends JpaRepository<Usuario, Long> {

}
