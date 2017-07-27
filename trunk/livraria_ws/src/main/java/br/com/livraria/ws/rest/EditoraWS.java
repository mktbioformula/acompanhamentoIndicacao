package br.com.livraria.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.livraria.bean.Editora;
import br.com.livraria.controle.esp.EditoraBCI;

@RestController
public class EditoraWS {

	@Autowired
	private EditoraBCI controle;

	@GetMapping("selecionar_editoras")
	public List<Editora> selecionarEditoras() {
		return this.controle.select();
	}

	@PostMapping("cadastrar_editora")
	public ResponseEntity<Editora> cadastrarEditora(@RequestBody Editora editora) {
		this.controle.inserir(editora);

		return new ResponseEntity<Editora>(editora, HttpStatus.OK);
	}
}
