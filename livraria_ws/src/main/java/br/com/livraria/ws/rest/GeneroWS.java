package br.com.livraria.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.livraria.bean.Genero;
import br.com.livraria.controle.esp.GeneroBCI;

@RestController
public class GeneroWS {
	
	@Autowired
	private GeneroBCI controle;

	@GetMapping("selecionar_generos")
	private List<Genero> select() {
		return this.controle.select();
	}
	
	@PostMapping(value = "cadastrar_genero")
	public ResponseEntity<Genero> cadastrarGenero(@RequestBody Genero g) {
		this.controle.insert(g);
		return new ResponseEntity<Genero>(g, HttpStatus.OK);
	}

}
