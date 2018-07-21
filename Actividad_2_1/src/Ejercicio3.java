//3. Implementa un método que obtenga el promedio de tres números con decimales.

public class Ejercicio3 {
	public static void main(String[] args){
		double a=7.5, b=4.5, c=3.1;
		System.out.println(" EL PROMEDIO ES: "+ promedio(a,b,c));
	}
	public static double promedio ( double x, double y, double z) {
		double resultado = 0;
		resultado = (x+y+z)/3;
		return resultado;
		
	}

}
