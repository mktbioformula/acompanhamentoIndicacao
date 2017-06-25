package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.OS;
import br.com.full.controle.OSBCI;
import br.com.full.dao.OsDaoI;

@Controller
public class OSBC implements OSBCI {

	@Autowired
	private OsDaoI dao;

	public void insert(OS os) {
		dao.save(os);
	}

	public List<OS> select() {
		return dao.findAll();
	}

	public void update(OS os) {
		dao.save(os);
	}

	public void delete(OS os) {
		dao.delete(os);
	}
}
