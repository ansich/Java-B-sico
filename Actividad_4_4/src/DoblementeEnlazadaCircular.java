
public class DoblementeEnlazadaCircular<E> {
	private DobleNodo<E> ultimo;
	private int numElem;
	
	public DoblementeEnlazadaCircular()
	{
		ultimo = null;
		numElem = 0;
	}
	
	public int numElementos(){
		return numElem;
	}
	
	public int numVeces (E e){
		int cont = 0;
		if (numElem != 0){
			DobleNodo<E> actual = ultimo.getSig();
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
	
	public DobleNodo<E> getPrimero(){
		if (numElem == 0){
			return null;
		} else {
			return ultimo.getSig();
		}
	}
	public void insertaPrimero (E e){
		DobleNodo<E> nuevo = new DobleNodo<E>(e, null, getPrimero());
		if (numElem == 0){
			ultimo = nuevo;
		} else {
			getPrimero().setAnt(nuevo);
		}
		ultimo.setSig(nuevo);
		numElem++;
		
	} public void insertaFinal (E e){
		DobleNodo<E> nuevo = new DobleNodo<E>(e, ultimo, getPrimero());
		if (numElem == 0){
			nuevo.setSig(nuevo);
		} else {
			ultimo.setSig(nuevo);
			getPrimero().setAnt(nuevo);
		}
		ultimo = nuevo;
		numElem++;
	}
	
	public void borrar (E e){
		if (numElem == 0){
			System.out.print("Estructura vacia");
		} else {
			DobleNodo<E> actual = getPrimero();
			while ( (actual.getSig() != ultimo) && (!actual.getElemento().equals(e)) ){ //Buscamos EL ELEMENTO que hay que borrar
				actual = actual.getSig();
			}
			if (actual.getElemento().equals(e)){
				actual.getAnt().setSig(actual.getSig());
				actual.getSig().setAnt(actual.getAnt());
				if (actual == ultimo){
					ultimo = actual.getAnt();
				}
				numElem--;
			} else {
				System.out.println("No se encuentra el elemento");
			}
		}
	}
}
