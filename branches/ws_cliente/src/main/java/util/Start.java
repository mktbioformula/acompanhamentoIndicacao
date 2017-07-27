package util;

import controle.ws.GeneroWSCliente;

public class Start {
	public static void main(String[] args) {
		GeneroWSCliente editoraCliente = new GeneroWSCliente();

		
		editoraCliente.select();
		System.out.println("-------------------");
		editoraCliente.insert();
		System.out.println("-------------------");
		editoraCliente.select();

	}
}
