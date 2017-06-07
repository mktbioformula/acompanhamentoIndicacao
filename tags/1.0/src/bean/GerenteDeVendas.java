package bean;

public class GerenteDeVendas extends Funcionario implements Gerenciador, Contratador {

	@Override
	public void calcComissao() {
		this.comissao = this.vendas * 0.05;
	}

	@Override
	public void defineMetas() {
		System.out.println("Gerente de vendas definindo metas");

	}

	@Override
	public void contratar() {
		System.out.println("Gerente de vendas contratando");

	}

	@Override
	public void supervisionar() {
		System.out.println("Gerente de vendas supervisionando");

	}
}
