package br.com.livraria.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.livraria.ws.bean.Usuario;
import br.com.livraria.ws.controle.UsuarioBCI;

@RestController
public class UsuarioWS {

	@Autowired
	private UsuarioBCI controle;
	
	@GetMapping("/select_usuarios")
	public List<Usuario> selectUsuarios(){
		return controle.select();
	}
	
	
	@PostMapping("/insert_usuario")
	public ResponseEntity insertUser(@RequestBody Usuario u){
		this.controle.insert(u);
		return new ResponseEntity(u, HttpStatus.OK);
	}
	
	
	
}
