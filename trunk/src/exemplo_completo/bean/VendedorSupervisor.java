package exemplo_completo.bean;

public class VendedorSupervisor extends Funcionario{

	public void calcComissao(){
		super.calcComissao();
		this.comissao = this.comissao+50;
	}
	
	
}
