package bean;

import java.util.Calendar;

public abstract class Pessoa {
	public String nome;
	public String telefone;
	public Calendar nascimento;
	public Integer codigo;
	
	
	public void select(){
		System.out.println("busca pessoas no banco");
	}
	
	
}
