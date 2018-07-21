public class Ejercicio2 {
	public static int busquedaInsercion(int[] A, int elem, int numEls) {
		int inicio = 0, fin = A.length - 1, medio;
		int B[] = new int[A.length];

		while (inicio <= fin) {
			medio = (inicio + fin) / 2;
			if (A[medio] < elem)
				inicio = medio + 1;
			else if (A[medio] > elem)
				fin = medio - 1;
			else

				return medio;// SI encontró el elemento y devuelve su posicion

		}

		// NO encontró el elemento y busca la posicion para insertarlo y la
		// devuelve
		while (inicio <= fin) {
			medio = (inicio + fin) / 2;
			if (A[medio] < elem)
				inicio = medio + 1;
			else if (A[medio] > elem)
				fin = medio - 1;
		}
		// / duplicamos el vector para mover los elementos y no machacar
		for (int i = inicio; i < numEls + 1; i++) {

			B[i] = A[i];
		}
		A[fin + 1] = elem;

		for (int i = inicio + 1; i < numEls + 1; i++) {

			A[i] = B[i];
		}
		return fin + 1;

	}

	public static void main(String[] args) {
		int SIZE = 20;
		int numEls = 10;
		int elemento = 17;
		int array[] = new int[SIZE];

		for (int i = 0; i < 10; i++) {
			array[i] = i * 2;
		}

		int pos = busquedaInsercion(array, elemento, numEls);

		System.out.println("La posicion asignada es: " + pos);
		for (int i = 0; i < SIZE; i++) {
			System.out.println(array[i]);
		}

	}

}
