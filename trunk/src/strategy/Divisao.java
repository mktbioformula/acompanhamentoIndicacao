package strategy;

public class Divisao implements Strategy {

	@Override
	public Integer calc(Integer a, Integer b) {
		return a/b;
	}

}
