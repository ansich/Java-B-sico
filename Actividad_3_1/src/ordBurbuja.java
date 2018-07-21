
public class ordBurbuja {
	
	public static void main( String[] args){
		
		int [] A={2, 5, 7, 3, 1, 9};
		
		System.out.print("El vector ordenado será: ");
		
		ordBurbuja(A);
		
		for(int i=0; i < A.length ; i++)
			System.out.print(A[i] +", ");
	}

	private static void intercambiar (int[] A, int i, int j ){
		
		int elem;
		elem = A[i];
		A[i] = A[j];
		A[j] = elem;		
	}
	
	public static void ordBurbuja (int[] A) {
		
		for (int pasada = 0; pasada < A.length - 1; pasada++)
			for (int j = 0; j < A.length - pasada - 1; j++)
				if (A[j]>A[j+1]) intercambiar (A, j, j+1);
			}
	
}