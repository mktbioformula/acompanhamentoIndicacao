package bean;

public class GerenteGeral extends Funcionario implements Gerenciador {

	@Override
	public void defineMetas() {
		System.out.println("Gerente Geral definindo metas");

	}

	

	@Override
	public void supervisionar() {
		System.out.println("Gerente Geral supervisionando");

	}

}
