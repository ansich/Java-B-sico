//5. Implementa un m�todo que obtenga el factorial de un n�mero.
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
