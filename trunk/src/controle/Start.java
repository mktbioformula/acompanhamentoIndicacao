package controle;

public class Start {
	public static void main(String[] args) {
		//testando repositorio
		int a = 1;
		int b = 15;
		
		
		for(int i = 0; i < 100; i++){
			System.out.println(i);
		}
		
		
		while( a < b  ){
			System.out.println(b);
			a++;
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
