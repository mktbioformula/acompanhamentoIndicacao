package animais;

import controle_empresarial.Funcionario;

public class Veterinario {

	public void vacinar(Animal c){
		c.comer();
		System.out.println(c.nome+" animal vacinado");
	}
	
}




