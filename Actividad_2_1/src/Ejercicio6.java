// Implementa un método que calcule la suma de los n primeros enteros impares.

public class Ejercicio6 {
	public static void main(String[] args) {
		int n =6;
		System.out.println("LA SUMA ES :" +sumaImp(n));

	}

	public static int sumaImp (int n){
		int suma=0;
		for(int i=1; i<=n;i++){
			if (i%2 !=0){
				suma=suma+i;
			}
		} return suma;
	}
}
