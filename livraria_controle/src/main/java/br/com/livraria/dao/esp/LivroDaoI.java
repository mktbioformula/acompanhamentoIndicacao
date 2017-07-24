package br.com.livraria.dao.esp;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.bean.Livro;

public interface LivroDaoI extends JpaRepository<Livro, Long> {

}
