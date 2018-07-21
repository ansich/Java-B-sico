/*2. Implementa un método que reciba una nota en valor numérico y dependiendo de su
valor visualice por pantalla la nota en letras. */

public class Ejercicio2 {
	public static void main(String[] args) {
		int notin = 7;
		tipoNota(notin);
		

	}

	public static void tipoNota(int n) {
		switch (n) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("SUSPENSO");
			break;
		case 5:
		case 6:
			System.out.println("APROBADO");
			break;
		case 7:
		case 8:
			System.out.println("NOTABLE");
			break;
		case 9:
		case 10:
			System.out.println("SOBRESALIENTE");
		default:
			System.out.println("NOTA NO VALIDA");

		}
	}
}