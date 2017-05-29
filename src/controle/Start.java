package controle;

public class Start {
	
	public static void main(String[] args) {
		escreveString(5, "Palmeiras não tem mundial");
		escreveString(2, "Fora Temer");
		escreveString(4, "Reformas Já");
		
		
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
