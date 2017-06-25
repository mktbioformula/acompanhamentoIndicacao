package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Carro;
import br.com.full.controle.CarroBCI;
import br.com.full.dao.CarroDaoI;

@Controller
public class CarroBC implements CarroBCI {

	@Autowired
	private CarroDaoI dao;

	@Override
	public void cadastrar(Carro c) {

		dao.save(c); 
		
	}

	@Override
	public List<Carro> select() {
		
		List<Carro> list =  dao.findKmByOrderByKmAsc();
		
		for (Carro carro : list) {
			System.out.println(carro.getNome()+" - "+carro.getPlaca()+" - "+carro.getKm());
		}
		
		return list;
	}
	
	

}
