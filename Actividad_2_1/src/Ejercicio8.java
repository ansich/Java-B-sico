/*Un negocio vende distintos artículos identificados por un código:
- código 1: 10 € la unidad.
- código 2: 7 € la unidad. La caja de 10 unidades vale 65 €.
- código 3: 3 € la unidad. Si la compra es por más de 10 unidades, se
hace un descuento del 10% sobre el total de la compra.
- código 4: 1 € la unidad.
Escribir una función que acepte como datos de entrada el código de un único artículo y
la cantidad a comprar y genere, como datos de salida, el importe de la compra.*/
public class Ejercicio8 {
	public static void main(String[] args) {
		int codigo=2,cantidad=10;
		System.out.println(importeCompra(codigo,cantidad));

	}

	public static double importeCompra(int cod, int cant){
		double resultado=0;
		switch(cod){
		case 1:
			resultado=cant*10;
			System.out.println("El importe de la compra es: "+resultado+"€" );
			break;
		case 2:
			if (cant==10){
				resultado=65;
				System.out.println("El importe de la compra es: "+resultado+"€" );}
			else {
				resultado=cant*7;
				System.out.println("El importe de la compra es: "+resultado+"€" );}
			break;
		case 3:
			if(cant>10){
				resultado= (cant*3*0.1);
				System.out.println("El importe de la compra es: "+resultado+"€" );}
			else{
				resultado= cant*3;
				System.out.println("El importe de la compra es: "+resultado+"€" );
			}
			break;
		case 4:
			resultado=cant;
			System.out.println("El importe de la compra es: "+resultado+"€" );
			break;
			}
		return resultado;}
		
		}
		
		
					
				
		
	

