//5. Implementa un método que obtenga el factorial de un número.
public class Ejercicio5 {
	public static void main(String[] args){
		int h=5;
		System.out.println("EL FACTORIAL ES: " +factorial(h));
	}
	
	public static int factorial(int x) {
		int fact = 1;
		for (int i = 1; i <= x; i++) {
			fact = i * fact;
		}
		return fact;
		
	}

}
