package br.com.full.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.full.bean.Carro;
import br.com.full.controle.CarroBCI;

@ManagedBean(name = "ControleMB")
public class ControleMB extends SpringBeanAutowiringSupport {

	@Autowired
	private CarroBCI controle;
	
	private String teste;
	
	
	public String getTeste() {
		return teste;
	}


	public void setTeste(String teste) {
		this.teste = teste;
	}

	public void listar(){
		controle.select();
	}

	public void cadastrarCarros(){
		Carro c1 = new Carro();
		c1.setPlaca("AAA-1114");
		c1.setNome("Gol Bola");
		
		
		Carro c2 = new Carro();
		c2.setPlaca("HJA-1213");
		c2.setNome("Fusca");
		
		
		Carro c3 = new Carro();
		c3.setPlaca("WQA-1125");
		c2.setNome("Corsa");
		
		Carro c4 = new Carro();
		c4.setPlaca("UIO-8851");
		c4.setNome("Pálio");
		
		Carro c5 = new Carro();
		c5.setPlaca("UFG-6511");
		c5.setNome("Chevete");
		
		controle.cadastrar(c1);
		controle.cadastrar(c2);
		controle.cadastrar(c3);
		controle.cadastrar(c4);
		controle.cadastrar(c5);
	}
}
