
public class Main {
	
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		double delta;
		double x1;
		double x2;
		double result;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
	 	
		System.out.println("A Raiz quadrada de "+ x + "é: " + A);
		System.out.println("A Raiz quadrada de "+ y + "é: " + B);
		System.out.println("A Raiz quadrada de 25 é: " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x +" elevado a " + y +"é igual a " + A);
		System.out.println(x +" elevado ao quadrado é igual a " + B);
		System.out.println("5 elevado ao quadrado é igual a " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " é igual a " + A);
		System.out.println("Valor absoluto de " + z + " é igual a " + B);
		
		A = 1;
		B = -5;
		C = 6;
		
		delta = Math.pow(B, 2.0) - 4*A*C;
		x1 = (-B - Math.sqrt(delta))/2*A;
		x2 = (-B + Math.sqrt(delta))/2*A; 	
		
		System.out.println("Delta é igual a: " + delta);
		System.out.println("X1 é igual a: " + x1);
		System.out.println("X2 é igual a: " + x2);
		
	}
	
}
