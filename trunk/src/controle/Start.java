package controle;

public class Start {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "João";
		p.idade = 28;
		p.sexo = 'M';
		p.endereco = "Rua tal casa 9";
		
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		p2.idade = 19;
		p2.sexo = 'F';
		p2.endereco = "Rua 3 casa 4";
		
		p.andar();
		p2.andar();
		
	}
	
	public static void exemploArray(){

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
	
	public static void escreveString(int i, String texto){
		while ( i > 0) {
			System.out.println(texto+" -"+i);
			//i = i-1;
			i--;
		}
		
	}
	
	
	public static void doisNumero(double n1, double n2) {
		if(n1 > n2){
			System.out.println("Este é o maior");
			System.out.println(n1);
			System.out.println("Este é o menor");
			System.out.println(n2);
		}else if(n1 < n2){
			System.out.println("Este é o maior");
			System.out.println(n2);
			System.out.println("Este é o menor");
			System.out.println(n1);
		}else{
			System.out.println("Os números são iguais");
			System.out.println(n1);
		}
	}
	
	public static void maiorNumero(double n1, double n2) {
		if(n1 > n2){
			System.out.println(n1);
		}else{
			System.out.println(n2);
		}
	}
	
	public static void area(double ladoA, double ladoB) {
		System.out.println((ladoA*ladoB)/2);
	}
	
	public static void calc(double a, double b, char c) {
		if(c == '+'){
			System.out.println(a+b);
		}else if(c == '*'){
			System.out.println(a*b);
		}else if(c == '/'){
			System.out.println(a/b);
		}else if(c == '-'){
			System.out.println(a-b);
		}
	}
}
