/*Implementa un método que calcule la suma de todos los números comprendidos entre
1 y 100 que cumplan la condición de ser múltiplos de 5 y 7. Para verificar si un
número X es múltiplo de otro número Y sólo tienes que comprobar si el resto de la
división entera de X dividido por Y es cero. */

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
