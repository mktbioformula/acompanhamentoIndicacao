package animais;

import java.io.Serializable;

public abstract class Animal implements Serializable{
	public String nome;
	
	public void comer() {
		System.out.println("Animal comendo");
	}

	public void dormir() {

	}
}
