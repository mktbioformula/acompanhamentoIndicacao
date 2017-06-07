package controle_empresarial;

public abstract class Funcionario {
	public String tipoFuncionario;
	public String nome;
	public int codigo;
	public double salario;
	
	
	public void trabalhar(){
		System.out.println(
				this.tipoFuncionario+" trabalhando...");
	}
	
}




