//a.- La clase DobleNodo<E>, con sus atributos y métodos observadores y modificadores.


public class DobleNodo<E>{
	//atrib
	private E elemento;
	private DobleNodo<E> anterior, siguiente;
	//constructor
	public DobleNodo(E elem, DobleNodo<E> ant, DobleNodo<E> sig){
		siguiente = sig;
		anterior = ant;
		elemento = elem;
	}
	//get
	public DobleNodo<E> getSig(){
		return siguiente;
	}
	public DobleNodo<E> getAnt(){
		return anterior;
	}
	public E getElemento(){
		return elemento;
	}
	//set
	public void setSig(DobleNodo<E> sig){
		siguiente = sig;
	}
	public void setAnt(DobleNodo<E> ant){
		anterior = ant;
	}
	public void setElem(E elem){
		elemento = elem;
	}
	
}