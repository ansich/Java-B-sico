
public class NodoMultiple<E> {
	private E elemento;
	private NodoMultiple <E> sigCr1, sigCr2;
	
	public NodoMultiple (E e, NodoMultiple<E> sig1, NodoMultiple<E> sig2){
		elemento = e;
		sigCr1 = sig1;
		sigCr2 = sig2;
	}
	
	public E getElemento(){
		return elemento;
	}
	public NodoMultiple<E> getSig1(){
		return sigCr1;
	}
	public NodoMultiple<E> getSig2(){
		return sigCr2;
	}
	
	public void setElemento(E elem){
		elemento = elem;
	}
	public void setSig1(NodoMultiple<E> sig1){
		sigCr1 = sig1;
	}
	public void setSig2(NodoMultiple<E> sig2){
		sigCr2 = sig2;
	}
}
