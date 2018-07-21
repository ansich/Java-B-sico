//Escribir una función que tenga como entrada tres números enteros y nos devuelva el mayor de los tres.

public class Ejercicio9 {
	public static void main(String[] args){
		int num1=2,num2=7,num3=16;
		System.out.println("EL NUMERO MAYOR ES: "+mayorNum(num1,num2,num3));
	}

	public static int mayorNum(int a, int b, int c) {
		int mayor;
		if ((a > b) && (a > c))
			mayor = a;
		else if ((b > a) && (b > c))
			mayor = b;
		else
			mayor = c;
		return mayor;
	}

}
