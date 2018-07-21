//Nombre Urna
//Tipos Entero
//Caracteristicas: El valor de la papeleta será un numero entero. Los objetos no son modificables.


/*Definicion de las operaciones:
    . Crear una urna vacía (sin elementos):
	Constructor crearUrna() devuelve null y numElem=0
		{ Produce: crea una Urna Vacia }		}
	
	. Añadir un elemento a la urna:
	Funcion nuevoElemento(E elem: Entero) devuelve Entero
		{ Produce: añade un nuevo elemento a la lista}		}
	
	. Añadir el contenido de una urna e otra urna:
	Funcion addcont (Urna<E> b)
		{ Produce: Suma el contenido de la urna en otra urna b }		}
	
	. Eliminar un elemento de la urna:
	Funcion EliminarUrna (E elem) Decuelve Entero lanza ExcepcionUrnaVacia
		{ Produce: Si la urna no tiene elementos lanza ExcepcionUrnaVacia 
			sino elimina un elemento de la lista. }		}
	
	. Recuperar un elemento cualquiera de la urna
	Funcion recuperarElemento(E elem): Devuelve Entero lanza ExcepcionUrnaVacia
		{ Produce: Si el elemento no esta lanza ExcepcionUrnaVacia
			 sino, devuelve un elemento cualquiera de la urna con la función 'randomize'}		}
			 
	. Saber cuántos elementos hay en la urna
	Funcion numElementos() Devuelve Entero lanza ExcepcionUrnaVacia
		{ Produce: Si la urna no tiene elementos lanza ExcepcionUrnaVacia
			sino devuelve el numero de elementos que tiene la urna}		}
*/

//Programa que usa el TAD

/*public class Prueba {
	public static void main(String[] args) {
		Urna<Integer> implements Urna<Integer> = new Urna<Integer>();
		
		System.out.println("Numero de elementos:");
		System.out.println(Urna.numElementos());
		System.out.println("Crear nuevo elemento:");
		System.out.println(Urna.nuevoElemento(5));
		System.out.println("Borrado del elemento 5:");
		Urna.EliminarUrna(5);
		System.out.println("Recuperar elemento 5:");
		System.out.println(Urna.recuperarElemento(5));
	}
}*/

// 2.- Implementar el TAD Urna<E> especificado en el ejercicio anterior. Para ello escribe la interfaz y la
// clase que implementa dicha interfaz haciendo uso de una estructura enlazada de modo simple con nodo
// centinela y referencia a dicho nodo.



public class Urna<E>
{
    private Nodo<E> centinela;
    private int numElem;
    
    public crearUrna() {
        centinela = new Nodo<E> (null, null);
        numElem = 0;
    }  
    
    public void nuevoElemento( E elem ){ 
        Nodo<E> nuevo = new Nodo(elem, null);
        nuevo.setSiguiente(centinela);
        centinela.setSiguiente(nuevo);
        numElem++;
    }
    
    public void addcont( Urna<E> b ){
        Nodo<E> actual = ((Urna<E>)b).centinela.getSiguiente();
        while (actual != null){
            addcont(actual.getElemento());
            actual = actual.getSiguiente();
        }
        
    }
    
    public void eliminarUrna ( E elem ) throws ExcepcionUrnaVacia{
        if (centinela.getSiguiente() == null)
                throw new ExcepcionUrnaVacia();
        else {
            Nodo <E> actual = centinela.getSiguiente();
            while ( actual != null && !actual.getSiguiente().equals(elem) )
                actual = actual.getSiguiente();
            if ( actual != null ) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
            }else{
                throw new ExcepcionUrnaVacia("\nEl elemento no está en la Urna");
            }
            
        }
    }
    
    public E recuperarElemento() throws ExcepcionUrnaVacia(){
        if ( centinela.getSiguiente() == null )
            throw new ExcepcionUrnaVacia();
        else{
           int randomize = (int)Math.random() *numElem; 
           Nodo <E> actual = centinela;
           
           while ( !actual.equals(randomize) ) 
                actual = actual.getSiguiente();
                
           return actual.getElemento();
        }
    }
}
    
    public int numElementos(){
    
        return numElem;
    }
    
}

