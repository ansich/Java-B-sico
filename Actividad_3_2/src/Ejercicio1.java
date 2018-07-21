public class Ejercicio1 {

	public static void ordenarConteo(int[] A) {
		int N = A.length;
		int x = 0;
		int cont[] = new int[N];
		int B[] = new int[N]; // /{,3 , , , , 7, }

		for (int i = 0; i < N; i++) {
			int elementoA = A[i];
			x = 0;
			for (int j = 0; j < N; j++) {
				if (A[j] < elementoA) {
					x = x + 1;
				}

			}
			cont[i] = x; // / {5, 1, 6, 0, 2, 4, 3}

		}
		// /duplicacion del vector para no machacar A
		for (int i = 0; i < N; i++) {
			B[cont[i]] = A[i];
		}

		// / ahora * apunta a "B = vector odenado "

		for (int i = 0; i < N; i++) {
			A[i] = B[i];

		}
	}

	public static void main(String[] args) {

		int vector[] = { 7, 3, 8, 1, 4, 6, 5 };
		ordenarConteo(vector);

		for (int i = 0; i <= vector.length - 1; i++) {
			System.out.println(vector[i]);
		}
	}
}