//Se pide escribir un proyecto en java que implemente:
//a.- La clase DobleNodo<E>, con sus atributos y métodos observadores y modificadores.

public class DobleNodo<E> {
	private E elemento;
	private DobleNodo<E> siguiente, anterior;
	
	public DobleNodo(E elem, DobleNodo<E> sig, DobleNodo<E> ant){
			elemento = elem;
			siguiente = sig;
			anterior = ant;
		
	}

public DobleNodo<E> getSig(){
	return siguiente;
}

public DobleNodo <E> getAnt(){
	return anterior;
}

public E getElemento(){
	return elemento;
}

public void setElemento( E elem){
	elemento = elem;
}

public void setAnt (DobleNodo<E> ant ){
	anterior = ant;
}

public void setSig( DobleNodo<E> sig){
	siguiente = sig;
}


}

//b.- La clase DoblementeEnlazada<E>, con sus atributos y los métodos siguientes:

public class DoblementeEnlazada <E>{
	private DobleNodo<E> primero, ultimo;
	private int numElem;
	
	//Crear la lista vacía, es decir, sin nodos (método constructor)
	
	DoblementeEnlazada(){
		primero = null;
		ultimo = null;
		numElem = 0;	
	}
	public int numeroElementos(){
		return numElem;
	}
	
	//Contar el número de veces que aparece un elemento en la lista
	
	public int numVeces (E elem){
		int contador = 0;
		DobleNodo<E> actual = primero;
		while (actual != null){
			if (actual.getElemento().equals(elem)) contador ++;
			actual = actual.getSig();
		}
		return contador;
	}	
	
	//Insertar un elemento al principio de la lista
	
	public void insertarPrincipio (E elem){
		if (ultimo !=null){
			primero = new DobleNodo<E>(elem, primero, null);
			primero.getSig().setAnt(primero);
		}else{
			primero = new DobleNodo<E>(elem, null, null);
			ultimo = primero;
			}
		numElem++;
		}

	public void insertarPrincipio2 (E elem){
		DobleNodo<E> nuevo = new DobleNodo<E> (elem, primero, null);
		if (numElem==0){
			ultimo = nuevo;
		}else{
			primero.setAnt(nuevo);
		}
		primero = nuevo;
		numElem++;
		
	}

	//Insertar un elemento al final de la lista
	
	public void insertarFinal (E elem){
		DobleNodo <E> nuevo = new DobleNodo <E> (elem, null, ultimo);
		if (numElem==0){
			primero = nuevo;
		}else{
			ultimo.setSig(nuevo);	
		}
		ultimo = nuevo;
		numElem++;
		
	}
	
	public void borrar(E elem){
		if (numElem==0){ System.out.println("Lista vacía");
		}else{
			if (numElem==1 && primero.getElemento().equals(elem)){
				primero = null;
				ultimo = null;
				numElem--;
			}
			else{
			 //buscar el elemento en la estructura enlazada
			DobleNodo<E> actual = primero;
			while (actual !=null && !actual.getElemento().equals(elem))
				actual = actual.getSig();
			if (actual==null) System.out.println("Elemento no está");
			else if (actual==primero){
					actual.getSig().setAnt(null);
					primero=actual.getSig();
					numElem--;
			}
			else if (actual == ultimo){
					ultimo.getAnt().setSig(null);
					ultimo = ultimo.getAnt();
					numElem--;
				}else{
					actual.getAnt().setSig(actual.getSig());
					actual.getSig().setAnt(actual.getAnt());
					numElem--;
				}
				
			}
		
		}
	}
	
	
	
	
	
}