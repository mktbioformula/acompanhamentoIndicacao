package br.com.cad.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cad.bean.Perfil;

public interface PerfilDaoI 
extends JpaRepository<Perfil, Long>{

}
