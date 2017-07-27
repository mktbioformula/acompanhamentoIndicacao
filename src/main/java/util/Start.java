package util;

import controle.ws.EditoraWSCliente;

public class Start {
	public static void main(String[] args) {
		EditoraWSCliente editoraCliente = new EditoraWSCliente();

		
		editoraCliente.select();
		System.out.println("-------------------");
		editoraCliente.insert();
		System.out.println("-------------------");
		editoraCliente.select();

	}
}
