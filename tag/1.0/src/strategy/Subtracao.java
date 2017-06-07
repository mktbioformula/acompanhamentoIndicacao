package strategy;

public class Subtracao implements Strategy {

	@Override
	public Integer calc(Integer a, Integer b) {
		return a-b;
	}

}
