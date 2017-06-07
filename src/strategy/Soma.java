package strategy;

public class Soma implements Strategy {

	@Override
	public Integer calc(Integer a, Integer b) {
		return a+b;
	}

}
