///1. Implementa un algoritmo que determine si una frase es Palíndromo o no.

	public class Actividad1 {
		public static boolean esPalindromo(String s) {
			int inicio = 0;
			int fin = s.length() - 1;
			int medio = (inicio + fin) / 2;

			while (inicio < medio && fin > medio && (s.charAt(inicio) != ' ' && s.charAt(fin) != ' ')) {

				if (s.charAt(inicio) != s.charAt(fin)) {
					return false;
				} else {
					inicio = inicio + 1;
					fin  = fin - 1;
				}

			}

			return true;

		}

		public static void main(String[] args) {
			String ss = new String("le saco sus ocas el");
			System.out.println("Si es palíndromo devolverá [true], si no [false]: ");
			System.out.println("El resultado es: " + esPalindromo(ss));
		}
	}
