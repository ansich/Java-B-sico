/*4. Construye una minicalculadora. Diseñar un algoritmo que lea del teclado dos números
y un carácter. El carácter sólo puede ser uno de los signos de operación aritmética: '+',
'-', 'x' y '/'. Se trata de visualizar en pantalla el resultado de realizar la operación
aritmética correspondiente con los dos números introducidos. */

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
