
public class EnlazadaCircular<E> {
	private Nodo<E> ultimo;
	private int numElem;
	
	public EnlazadaCircular()
	{
		ultimo = null;
		numElem = 0;
	}
	
	public int numElementos(){
		return numElem;
	}
	
	public int numVeces (E e){
		Nodo<E> actual = ultimo.getSig();
		int cont = 0;
		while (actual != ultimo){
			if (actual.getElemento().equals(e)){
				cont++;
			}
			actual = actual.getSig();
		}
		if (actual.getElemento().equals(e)){
			cont++;
		}
		return cont;
	}
	
	public Nodo<E> getPrimero(){
		if (numElem == 0){
			return null;
		} else {
			return ultimo.getSig();
		}
	}
	public void insertaPrimero (E e){
		Nodo<E> nuevo = new Nodo<E>(e, getPrimero());
		if (numElem == 0){
			ultimo = nuevo;
		}
		ultimo.setSig(nuevo);
		numElem++;
		
	} public void insertaFinal (E e){
		Nodo<E> nuevo = new Nodo<E>(e, getPrimero());
		if (numElem == 0){
			ultimo = nuevo;
			ultimo.setSig(nuevo);
		} else {
			ultimo.setSig(nuevo);
			ultimo = nuevo;
		ultimo = nuevo;
		numElem++;
		}
	}
	
	public void borrar (E e){
		if (numElem == 0){
			System.out.print("Estructura vacia");
		} else {
			if ( getPrimero().getElemento().equals(e) ){ //El primero es el que hay que borrar
				if (numElem == 1){ // Solo hay uno
					ultimo.setSig(null); //ES NECESARIO?
					ultimo = null;
				} else { //Hay varios
					ultimo.setSig(getPrimero().getSig());
				}
				numElem--;
			} else { //El primero no es el que hay que borrar
				Nodo<E> actual = getPrimero();
				while ( (actual.getSig() != ultimo) && (!actual.getSig().getElemento().equals(e)) ){ //Buscamos EL ANTERIOR al que hay que borrar
					actual = actual.getSig();
				}
				if ( (actual.getSig() == ultimo) && (!actual.getSig().getElemento().equals(e)) ){ //No esta el elemento
					System.out.print("No se encuentra el elemento");
				} else { //Esta el elemento
					if (actual.getSig() == ultimo){ //Es el ultimo
						actual.setSig(getPrimero());
						ultimo = actual;
					} else { // No es el ultimo
						actual.setSig(actual.getSig().getSig());
					}
					numElem--;
				}
			}
		}
	}
}
