
public class Alumno {
	private String nombre;
	private int numMat;
	
	public Alumno(String nom, int nMat){
		nombre = nom;
		numMat = nMat;
	}
	
	public String getNombre(){
		return nombre;
	}
	public int getNumMat(){
		return numMat;
	}
	
	public void setNombre(nombre n){	
		nombre = n;
	}
	public void setNMat(numMat nMat){	
		numMat = nMat;
	}
}
