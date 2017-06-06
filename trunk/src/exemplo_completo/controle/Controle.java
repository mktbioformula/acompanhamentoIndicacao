package exemplo_completo.controle;

import exemplo_completo.bean.Funcionario;
import exemplo_completo.bean.Gerenciador;

public class Controle {

	public void definirMetasDaEmpresa(Gerenciador g){
		g.defineMetas();
	}
	
	
	
	public void gerarPagamentos(Funcionario f){
		f.calcComissao();
		System.out.println("--------------------------------");
		System.out.println(f.nome);
		f.salario = f.salario+f.comissao;
		System.out.println(f.salario);
		System.out.println("--------------------------------");
	}
	
}
