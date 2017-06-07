package strategy;

public class Multiplicacao implements Strategy {

	@Override
	public Integer calc(Integer a, Integer b) {
		return a*b;
	}

}
