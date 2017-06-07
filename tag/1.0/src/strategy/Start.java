package strategy;

public class Start {
	public static void main(String[] args) {
		Strategy calc = new Multiplicacao();
		Integer i =calc.calc(5, 5);

		System.out.println(i);
		
		calc = new Soma();
		i =calc.calc(5, 5);
		
		
		System.out.println(i);
	}
}
