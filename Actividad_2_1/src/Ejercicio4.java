/*4. Construye una minicalculadora. Dise�ar un algoritmo que lea del teclado dos n�meros
y un car�cter. El car�cter s�lo puede ser uno de los signos de operaci�n aritm�tica: '+',
'-', 'x' y '/'. Se trata de visualizar en pantalla el resultado de realizar la operaci�n
aritm�tica correspondiente con los dos n�meros introducidos. */

public class Ejercicio4 {
	public static void main(String[] args){
		int x=3, y=4;
		char c='+';
		miniCalc(x,y,c);
		
	}
	public static void miniCalc (int x, int y, char c){
		switch (c){
		case '+': 
			System.out.println("El resultado de la suma es: "+ (x+y));
			break;
		case '-': 
			System.out.println("El resultado de la resta es: "+ (x-y));
			break;
		case '*': 
			System.out.println("El resultado del producto es: "+ (x*y));
			break;
		case '/': 
			System.out.println("El resultado de la division es: "+ (x/y));
			break;
		default:
			System.out.println("Operacion no valida");
		}
		
	}

}
