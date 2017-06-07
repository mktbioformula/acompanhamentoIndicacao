package controle_empresarial;

public class Gerente extends Funcionario implements GeradorDeRelatorios {
	
	@Override
	public void imprimirRelatorio(){
		
	}
	
	
	@Override //Relatorios
	public void gerarRelatorio(){
		System.out.println("gera relatórios");
	}
	
	
}
