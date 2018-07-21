///a)

public class Ejercicio3 {

	public static void rellenar(int[][] mat, int fila, int col, int color) {

		int i = fila;
		while (i <= mat.length) {
			if ((mat[fin - 1][col]) == (mat[fila][col])) {
				mat[fin - 1][col] = color;
				i = i + 1;
			}
			fila = fila - 1;
		}

		while (i <= mat.length) {
			if ((mat[fila + 1][col]) == (mat[fil][col])) {
				mat[fila + 1][col] = color;
				i = i + 1;
			}
			fila = fila + 1;
		}

		int j = col;
		while (j <= mat[0].length) {
			if ((mat[fila][col - 1]) == (mat[fila][col])) {
				matriz[fila][col - 1] = color;
				j+=1;

			}
			col = col - 1;
		}
		while (j <= matriz[0].length) {
			if ((matriz[fila][col + 1]) == (matriz[fila][col])) {
				matriz[fila][col + 1] = color;
				j = j + 1;

			}
			col = col + 1;
		}
	}

	public static void main(String[] args) {
		int [][] m=new int [8][7];

		}

	}

///b) Busqueda binaria

///c) En el peor de los casos será de N^2 por bucle, es decir, N^2
