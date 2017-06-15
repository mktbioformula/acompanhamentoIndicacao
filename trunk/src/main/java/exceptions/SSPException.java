package exceptions;

import java.io.PrintStream;

public class SSPException extends Exception {

	public void prender(){
		System.out.println("vc esta preso");
	}
	
	public void codigoPenal(){
		System.out.println("171");
	}
	
	@Override
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
		System.out.println("Pessoa com problemas com a justiça brasileira");
	}
	
}
