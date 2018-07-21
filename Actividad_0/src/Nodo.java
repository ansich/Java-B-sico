
public class Nodo<E> {
	private E elemento;
	private Nodo<E> siguiente;
	
	public Nodo(E elem, Nodo<E> sig){
		elemento = elem;
		siguiente = sig;
	}
	
	public E getElem(){ return elemento;}
	public Nodo<E> getSig(){ return siguiente;}
	
	public void setElem(E elem) { elemento = elem; }
	public void setSig(Nodo<E> sig) { siguiente = sig; }
	
}
