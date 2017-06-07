package controle;

public class Pessoa {
	public String nome;
	public int idade;
	public String endereco;
	public char sexo;
	
	public void andar(){
		System.out.println(this.nome+" andando");
	}
	
	public void dormir(){
		System.out.println("Pessoa Dormindo");
	}
	
	public void trabalhar(){
		System.out.println("Pessoa trabalhando");
	}
	
}
