package br.com.full.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Carro;
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
public interface CarroDaoI extends JpaRepository<Carro, Long> {
	
	public List<Carro> findKmByOrderByKmAsc();
	
	public List<Carro> findByNomeAndKmLessThan(String nome, Integer km);
	
	public List<Carro> findByPlacaAndNome(String placa, String nome);

	public List<Carro> findByPlacaOrNome(String placa, String nome);
	
	public List<Carro> findByPlaca(String placa);
	
	public List<Carro> findByNome(String nome);
	
	public List<Carro> findByKmLessThan(Integer km);
	
	public List<Carro> findByKmGreaterThan(Integer km);
	
	
}