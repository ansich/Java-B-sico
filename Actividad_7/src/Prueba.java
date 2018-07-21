
public class Prueba {
	public static void main(String[] args){
		DoblementeEnlazadaCircular<Integer> lista = new DoblementeEnlazadaCircular <Integer>();
		for (int i= 1; i <=10; i++)
			lista.insertarFinal(i);
		lista.insertarFinal(8);
		lista.insertarFinal(8);
		//veces que aparece el 8
		System.out.println(lista.contar(8));
		for (int i=1 ; i<=9;i++)
			lista.borrarPrincipio();
		//contar veces que aparece el 8
		System.out.println(lista.contar(8));
	}
}
