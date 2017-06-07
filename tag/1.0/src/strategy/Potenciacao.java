package strategy;

public class Potenciacao implements Strategy {

	@Override
	public Integer calc(Integer a, Integer b) {
		Integer i = (int) Math.pow(a, b);
		return i;
	}

}
