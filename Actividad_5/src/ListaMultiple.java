
public class ListaMultiple {
	private NodoMultiple <Alumno> primero;
	private int numElem;
	
	public ListaMultiple(){
		primero = new NodoMultiple <Alumno> (null, null, null);;
		numElem = 0;
		
	}
	public void insertar(Alumno a){
		NodoMultiple <Alumno> nuevo = new NodoMultiple <Alumno> (a, null, null);
		//ordenar ascendentemente por nombre
		NodoMultiple <Alumno> actual = primero;
		while (actual.getSig1()!=null && (actual.getSig1().getElemento().getNombre().compareTo(a.getNombre())<0)
			
			actual=actual.setSig1());
		
		nuevo.setSig1(actual.getSig1(nuevo));
		actual.getSig1(nuevo);
		
		//ordenarlo descentente por matricula
		actual = primero;
		while (actual.getSig1()!=null && actual.getSig2().getElemento().getMat()>a.getMat())
				
			nuevo.getSig2(actual.getSig2());
			actual.setSig2(nuevo);
			
		}
	public void visualizarNombre(){
		
	}
	public void visualizarMatricula(){
		
	}
}
