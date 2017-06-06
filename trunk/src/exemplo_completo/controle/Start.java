package exemplo_completo.controle;

import exemplo_completo.bean.GerenteDeVendas;
import exemplo_completo.bean.Vendedor;
import exemplo_completo.bean.VendedorExterno;

public class Start {

	public static void main(String[] args) {
		VendedorExterno ve = new VendedorExterno();
		ve.nome = "João da Silva";
		ve.salario = 2500.00;
		ve.vendas = 100000.00;
		
		Vendedor v = new Vendedor();
		v.nome = "Alberto dos Santos";
		v.salario = 1300.00;
		v.vendas = 50000.00;
		
		GerenteDeVendas gv = new GerenteDeVendas();
		gv.nome = "Andreia de Sousa";
		gv.salario = 5000.00;
		gv.vendas = 45000.00;
		
		
		Controle gp = new Controle();
		
		gp.gerarPagamentos(ve);
		gp.gerarPagamentos(v);
		gp.gerarPagamentos(gv);
		gp.definirMetasDaEmpresa(gv);
		
		
		
	}
}



