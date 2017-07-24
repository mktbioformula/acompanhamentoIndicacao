package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Editora;

public interface EditoraDaoI extends JpaRepository<Editora, Long>{

}
