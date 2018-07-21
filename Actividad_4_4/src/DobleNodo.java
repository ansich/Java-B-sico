
public class DobleNodo<E> {
	private E elemento;
	private DobleNodo<E> anterior, siguiente;
	
	public DobleNodo (E elem, DobleNodo<E> ant, DobleNodo<E> sig){
		elemento = elem;
		anterior = ant;
		siguiente = sig;
	}
	
	public E getElemento(){
		return elemento;
	}
	
	public DobleNodo<E> getAnt(){
		return anterior;
	}
	
	public DobleNodo<E> getSig(){
		return siguiente;
	}
	
	public void setElemento (E elem){
		elemento = elem;
	}
	
	public void setAnt(DobleNodo<E> ant){
		anterior = ant;
	}

	public void setSig(DobleNodo<E> sig){
		siguiente = sig;
	}
}
