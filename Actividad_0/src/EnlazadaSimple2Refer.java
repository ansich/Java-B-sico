
public class EnlazadaSimple2Refer<E> {
	private int numElem;
	private Nodo<E> primero;
	private Nodo<E> ultimo;
	
	public EnlazadaSimple2Refer(){
			numElem = 0;
			primero = null;
			ultimo = null;		
	}
	
	public int numElementos(){
		return numElem;
	}
	
	public int numVeces(E elem){
		int contador = 0;
		Nodo<E> actual = primero;
		while (actual != null){
			if (actual.getElem().equals(elem)) contador++;
			actual = actual.getSig();
		}
			return contador;	
	}
	
	public boolean esta(E elem){
		Nodo<E> actual = primero;
		while (actual != null){
			if (actual.getElem().equals(elem))
				return true;
			else
				return false;
		}
	}

	public void insertarPrincipio(E elem){
		Nodo <E> nuevo = new Nodo<E>(elem, primero);
		primero = nuevo;
		if (numElem == 0){
			ultimo = nuevo;
			} numElem++;
		}
		
	public void insertarFinal(E elem){
		Nodo<E> nuevo = new Nodo<E>(elem, null);
		ultimo.setSig(nuevo);
		ultimo = nuevo;
		if (numElem == 0){
			primero = nuevo;
		} numElem++;
			
	}

	public void borrar(e Elem){
		if (numElem == 0){
			System.out.print("Estructura vacia");
		}else{
			if (primero.getElem().equals(elem)){
				if (numElem == 1)
					primero = ultimo = null;
				else{
					primero = primero.getSig();
				} numElem--;
			}else{
				Nodo<E> actual = primero;
				while ((actual.getSig() != actual.getElem().equals(elem)) && (actual.getSig() != ultimo))
					actual = actual.getSig();
				if ((actual.getSig() == ultimo) && (!actual.getSig().equals(elem)))
					System.out.println("No se encuentra");
				else{
					if (actual.getSig() != ultimo)
						actual.setSig(actual.getSig().getSig());
					else
						ultimo = actual;
						actual.setSig(null);			
				}numElem--;
			}
		
		}
	}
	
}//fin clase

	