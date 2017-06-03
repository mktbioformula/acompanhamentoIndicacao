package controle;

import animais.Animal;
import animais.Cachorro;
import animais.Mamifero;
import animais.Peixe;
import animais.Tubarao;
import animais.Vaca;
import controle_empresarial.VendedorExterno;
import controle_empresarial.Funcionario;
import controle_empresarial.GeradorDeRelatorios;
import controle_empresarial.Gerente;
import controle_empresarial.GerenteCoordenador;
import controle_empresarial.Vendedor;

public class Start {

	public static void main(String[] args) {
		
		String s = "Bola";
		System.out.println(s.toUpperCase());
		
		
	}
	
	
	public static void verificaTrabalho(Funcionario g){
		g.trabalhar();
	}
	

	
	
	
	
	
	
	public static void veterinario(Animal c) {
		System.out.println("tratando cachorro");
	}

	
	public static void gravaNoBanco(Cachorro c) {

	}

	public static void exemploArray() {

		String[] textos = new String[5];

		textos[0] = "Fora Temer";
		textos[1] = "Palmeiras não tem Mundial";
		textos[2] = "Volta Dilma";
		textos[3] = "Volta Militares";
		textos[4] = "A culpa não é minha";

		for (int i = 0; i < textos.length; i++) {
			System.out.println(textos[i]);
		}

	}

	public static void escreveString(int i, String texto) {
		while (i > 0) {
			System.out.println(texto + " -" + i);
			// i = i-1;
			i--;
		}

	}

	public static void doisNumero(double n1, double n2) {
		if (n1 > n2) {
			System.out.println("Este é o maior");
			System.out.println(n1);
			System.out.println("Este é o menor");
			System.out.println(n2);
		} else if (n1 < n2) {
			System.out.println("Este é o maior");
			System.out.println(n2);
			System.out.println("Este é o menor");
			System.out.println(n1);
		} else {
			System.out.println("Os números são iguais");
			System.out.println(n1);
		}
	}

	public static void maiorNumero(double n1, double n2) {
		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}

	public static void area(double ladoA, double ladoB) {
		System.out.println((ladoA * ladoB) / 2);
	}

	public static void calc(double a, double b, char c) {
		if (c == '+') {
			System.out.println(a + b);
		} else if (c == '*') {
			System.out.println(a * b);
		} else if (c == '/') {
			System.out.println(a / b);
		} else if (c == '-') {
			System.out.println(a - b);
		}
	}
}
