///METODOS CLASIFICACION ELEMENTOS DE UN VECTOR

public class Actividad2 {

public static int menoresQue30 (int[] A){
		
		int cont_men30 = 0 ,inicio=0, fin=A.length-1;
		
		for (int i=inicio; i<=fin; i++){
			
			if (A[i] < 30);
				cont_men30 = cont_men30 + 1;
				
			}
		
			return (cont_men30);
			
		}

public static int mayoresQue70 (int[] A){
	
	int cont_may70 = 0 ,inicio=0, fin = A.length-1;
	
	for (int i=inicio; i<=fin; i++){
		
		if (A[i] < 30);
			cont_may70 = cont_may70 + 1;
			
		}
	
		return (cont_may70);
		
	}
		
public static int entreValores (int[] A){
		
		int cont_entre = 0 ,inicio=0, fin=A.length-1;
		
		for (int i = inicio; i <= fin; i++){
			
			if ((A[i] > 30) && (A[i] < 70));
				cont_entre = cont_entre + 1;
				
			}
		
			return (cont_entre);
			
		}
