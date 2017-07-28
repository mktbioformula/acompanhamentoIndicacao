package br.com.livraria.view.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioControlador {

	@RequestMapping("/")
	public String index(){
		System.out.println("testando controlador");
		return "livro";
	}
	
}
