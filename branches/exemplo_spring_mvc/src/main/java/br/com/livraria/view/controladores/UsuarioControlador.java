package br.com.livraria.view.controladores;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.bean.Autor;
import br.com.livraria.controle.esp.AutorBCI;

@Controller
public class UsuarioControlador {

	@Autowired
	private AutorBCI controle;

	private List<Autor> list;

	@PostConstruct
	public void init() {
		this.list = controle.select();
	}

	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println("testando controlador");
		ModelAndView mv = new ModelAndView("livro");
		mv.addObject("list", this.list);

		return mv;
	}

	@RequestMapping("/cad_autor")
	public ModelAndView cadAutor(Autor a) {
		controle.insert(a);
		this.init();
		ModelAndView mv = new ModelAndView("livro");
		mv.addObject("list", this.list);
		return mv;
	}

}
