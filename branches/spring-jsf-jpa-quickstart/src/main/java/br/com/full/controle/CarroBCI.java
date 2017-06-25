package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Carro;

public interface CarroBCI {
	public void cadastrar(Carro c);
	public List<Carro> select();
}
