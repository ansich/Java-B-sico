
public class Prueba {
	public static void main(String[] args) {
		DoblementeEnlazada<Integer> listaInt = new DoblementeEnlazada<Integer>();
		listaInt.insertaPrimero(0);
		for (int i = 1; i <= 9; i++){
			listaInt.insertaFinal(i);
		}
		System.out.println("Numero de elementos:");
		System.out.println(listaInt.numElementos());
		System.out.println("Numero de veces que aparece el elemento 2:");
		System.out.println(listaInt.numVeces(2));
		System.out.println("Borrado del elemento 2");
		listaInt.borrar(2);
		System.out.println("Numero de elementos:");
		System.out.println(listaInt.numElementos());
	}
}
