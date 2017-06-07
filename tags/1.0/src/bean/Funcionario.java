package bean;

public abstract class Funcionario extends Pessoa {

	public Double salario;
	public String cargo;
	public Double vendas;
	public Double comissao;
	
	public void calcComissao(){
		this.comissao = this.vendas*0.01;
	}
	
	
}
