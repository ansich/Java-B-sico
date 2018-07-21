
public class EnlazadaSimple2Refer<E> {
	private Nodo<E> primero, ultimo;
	private int numElem;
	
	public EnlazadaSimple2Refer()
	{
		primero = ultimo = null;
		numElem = 0;
	}
	
	public int numElementos(){
		return numElem;
	}
	
	public int numVeces (E e){
		Nodo<E> actual = primero;
		int cont = 0;
		while (actual != null){
			if (actual.getElemento().equals(e)){
				cont++;
			}
			actual = actual.getSig();
		}
		return cont;
	}
	
	public boolean esta (E e){
		Nodo<E> actual = primero;
		boolean esta = false;
		while ( (actual != null) && (!esta) ){
			if (actual.getElemento().equals(e)){
				esta = true;
			}
			actual = actual.getSig();
		}
		return esta;
	}
	
	public void insertaPrimero (E e){
		Nodo<E> nuevo = new Nodo<E>(e, primero);
		primero = nuevo;
		if (numElem == 0){
			ultimo = nuevo;
		}
		numElem++;
		
	} public void insertaFinal (E e){
		Nodo<E> nuevo = new Nodo<E>(e, null);
		ultimo.setSig(nuevo);
		ultimo = nuevo;
		if (numElem == 0){
			primero = nuevo;
		}
		numElem++;
	}
	
	public void borrar (E e){
		if (numElem == 0){
			System.out.print("Estructura vacia");
		} else {
			if ( primero.getElemento().equals(e) ){ //El primero es el que hay que borrar
				if (numElem == 1){ // Solo hay uno
					primero = ultimo = null;
				} else { //Hay varios
					primero = primero.getSig();
				}
				numElem--;
			} else { //El primero no es el que hay que borrar
				Nodo<E> actual = primero;
				while ( (actual.getSig() != ultimo) && (!actual.getSig().getElemento().equals(e)) ){ //Buscamos EL ANTERIOR al que hay que borrar
					actual = actual.getSig();
				}
				if ( (actual.getSig() == ultimo) && (!actual.getSig().getElemento().equals(e)) ){ //No esta el elemento
					System.out.print("No se encuentra el elemento");
				} else { //Esta el elemento
					if (actual.getSig() == ultimo){ //Es el ultimo
						ultimo = actual;
						ultimo.setSig(null);
					} else { // No es el ultimo
						actual.setSig(actual.getSig().getSig());
					}
					numElem--;
				}
			}
		}
	}
}
