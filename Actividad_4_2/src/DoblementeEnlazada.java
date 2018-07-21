
public class DoblementeEnlazada<E> {
	private DobleNodo<E> primero, ultimo;
	private int numElem;
	
	public DoblementeEnlazada()
	{
		primero = ultimo = null;
		numElem = 0;
	}
	
	public int numElementos(){
		return numElem;
	}
	
	public int numVeces (E e){
		int cont = 0;
		if (numElem != 0){
			DobleNodo<E> actual = primero;
			while (actual != ultimo){
				if (actual.getElemento().equals(e)){
					cont++;
				}
				actual = actual.getSig();
			}
			if (actual.getElemento().equals(e)){
				cont++;
			}
		}
		return cont;
	}
	
	public void insertaPrimero (E e){
		DobleNodo<E> nuevo = new DobleNodo<E>(e, null, primero);
		if (numElem == 0){
			ultimo = nuevo;
		} else {
			primero.setAnt(nuevo);
		}
		primero = nuevo;
		numElem++;
	} 
	
	public void insertaFinal (E e){
		DobleNodo<E> nuevo = new DobleNodo<E>(e, ultimo, null);
		if (numElem == 0){
			primero = nuevo;
		} else {
			ultimo.setSig(nuevo);
		}
		ultimo = nuevo;
		numElem++;
	}
	
	public void borrar (E e){
		if (numElem == 0){
			System.out.print("Estructura vacia");
		} else {
			DobleNodo<E> actual = primero;
			while ( (actual != ultimo) && (!actual.getElemento().equals(e)) ){ //Buscamos EL ELEMENTO que hay que borrar
				actual = actual.getSig();
			}
			if ( actual.getElemento().equals(e) ){ //Encontramos el elemento
				if (actual == primero){ //El elemento es el primero
					actual.getSig().setAnt(null);
					primero = actual.getSig();
					numElem--;
				} else { //No es el primero
					if (actual == ultimo){ //Es el ultimo
						actual.getAnt().setSig(null);
						ultimo = actual.getAnt();
						numElem--;
					} else { //No es primero ni ultimo
						actual.getAnt().setSig(actual.getSig());
						actual.getSig().setAnt(actual.getAnt());
						numElem--;
					}
				}
			} else {
				System.out.println("No se encuentra el elemento");
			}
			
			/**if ( primero.getElemento().equals(e) ){ //El primero es el que hay que borrar
				if (numElem == 1){ // Solo hay uno
					primero = ultimo = null;
				} else { //Hay varios
					primero = primero.getSig();
				}
				numElem--;
			} else { //El primero no es el que hay que borrar
				DobleNodo<E> actual = primero;
				while ( (actual.getSig() != ultimo) && (actual.getSig().getElemento() != e) ){ //Buscamos el anterior al que hay que borrar
					actual = actual.getSig();
				}
				if ( (actual.getSig() == ultimo) && (!actual.getSig().getElemento().equals(e)) ){ //No esta el elemento
					System.out.print("No se encuentra el elemento");
				} else {
					if (actual.getSig() == ultimo){ //Esta el elemento y es el ultimo
						ultimo = actual;
						ultimo.setSig(null);
					} else { // Esta el elemento y no es el ultimo
						actual.setSig(actual.getSig().getSig());
					}
					numElem--;
				}
			}*/
		}
	}
}
