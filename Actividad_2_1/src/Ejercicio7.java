/*Implementa un m�todo que calcule la suma de todos los n�meros comprendidos entre
1 y 100 que cumplan la condici�n de ser m�ltiplos de 5 y 7. Para verificar si un
n�mero X es m�ltiplo de otro n�mero Y s�lo tienes que comprobar si el resto de la
divisi�n entera de X dividido por Y es cero. */

public class Ejercicio7 {
	public static void main(String[] args){
		int a=1,b=100;
		System.out.println("RESULTADO ES:" +sumaN(a,b));
		
	}
	public static int sumaN(int a, int b){
		int i=a,suma=0;
		while(i<=b){
			if ((i%5==0)&&(i%7==0))
					suma=suma+i;
			i++;
		}
		return suma;
	}

}
