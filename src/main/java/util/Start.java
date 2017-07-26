package util;

import controle.ws.UsuarioWS;

public class Start {
	public static void main(String[] args) {
		UsuarioWS user = new UsuarioWS();

		
		user.select();
		System.out.println("-------------------");
		user.insert();
		System.out.println("-------------------");
		user.select();
	

	}
}
