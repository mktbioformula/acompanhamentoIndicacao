package interfaces;

public class Carro implements Motorizado, Seguranca {

	@Override
	public void acelera() {
		System.out.println("Carro acelerando");
	}

	@Override
	public void freia() {
		
	}

	@Override
	public void liga() {
		
	}

	@Override
	public void evitaColisoes() {
		
	}
	
}
