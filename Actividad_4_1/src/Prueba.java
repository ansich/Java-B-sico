
public class Prueba {
	public static void main(String[] args) {
		EnlazadaSimple2Refer<Integer> listaInt = new EnlazadaSimple2Refer<Integer>();
		listaInt.insertaPrimero(0);
		for (int i = 1; i <= 9; i++){
			listaInt.insertaFinal(i);
		}
		System.out.println("Numero de elementos:");
		System.out.println(listaInt.numElementos());
		System.out.println("Esta el elemento elemento 2?");
		System.out.println(listaInt.esta(2));
		System.out.println("Numero de veces que aparece el elemento 2:");
		System.out.println(listaInt.numVeces(2));
		System.out.println("Borrado del elemento 2");
		listaInt.borrar(2);
		System.out.println("Numero de elementos:");
		System.out.println(listaInt.numElementos());
	}
}
