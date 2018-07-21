public class DoblementeEnlazadaCircular<E> {
	//atributos
	private DobleNodo<E> ultimo;
	private int numElem;
	
	public DoblementeEnlazadaCircular(){
		ultimo = null;
		numElem = 0;
	}
	
	//Contar el número de veces que aparece un elemento en la lista
	
	public int contar (E elem){
		if (numElem==0) return 0;
		int contador = 0;
		DobleNodo<E> actual = ultimo;
		do {
			if (actual.getElemento().equals(elem)) contador ++;
			actual = actual.getSig();
		}while (actual != ultimo);
		return contador;
	}	

		//Devolver el elemento que está de primero en la lista; si la estructura está vacía, devuelve null
	public E primero (E elem){
			if (ultimo==null) return null;
			DobleNodo<E> actual = ultimo;
			if (numElem==1)
				return actual.getElemento();
			else 
				return actual.getSig().getElemento();	
		}


		//Insertar un elemento al final de la lista

	public void insertarFinal (E elem){
		DobleNodo <E> nuevo = new DobleNodo <E> (elem, null, null);
		if (numElem==0){
			ultimo = nuevo;
			nuevo.setSig(nuevo);
			nuevo.setAnt(nuevo);
		}else{
			nuevo.setSig(ultimo.getSig());
			nuevo.setAnt(ultimo);
			ultimo.setSig(nuevo);
			ultimo.getSig().setAnt(nuevo);
			ultimo = nuevo;	
		}
		numElem++;
	}
	
		//Borrar un elemento al principio de la lista
	
	public void borrarPrincipio (){
		if (ultimo==null) System.out.println("No hay elementos que borrar");
		if (numElem == 1){
			ultimo = null;			
		}else{
			//uso de una variable local
			DobleNodo<E> aux = ultimo.getSig();
			aux.getSig().setAnt(ultimo);
			ultimo.setSig(aux.getSig());
			
			//sin variable local
			//ultimo.getSig().getSig().setAnt(ultimo);
			//ultimo.getSig().ultimo.getSig().getSig());
		}
		numElem--;
	}
	
}	//cierra la clase
