
public class Pair<K, V> {
	
	private K clave;
	private V valor;
	
	public Pair (K c, V v)
	{
		c = clave;
		v = valor;
	}
	
	public K getClave()
	{
		return clave;
	}
	
	public V getValor()
	{
		return valor;
	}
	public String toString()
	{
		return "["+ getClave()+ ","+ getValor() +"]";
	}
	
	public static void main( String [] args){
		Pair <String,Integer> par1 = new Pair <String,Integer> (new String ("Pedro"), 33);
		System.out.println(par1.getClave().charAt(0));
		System.out.println(par1);
	}
}
