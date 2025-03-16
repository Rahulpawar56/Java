interface Value<E>
{
	void show(E e);
}
class MNO implements ABC<Integer>{
	public void show(Integer e)
	{
		System.out.println("Value of Integer "+e);
	}
}
class PQR implements ABC<Float>
{
	public void show(Float e)
	{
		System.out.println("Value of Float "+e);
	}	
}

public class InterfaceWithGenerics {

	public static void main(String[] args) {
		MNO m=new MNO();
		m.show(100);
		PQR p=new  PQR();
		p.show(5.4f);

	}

}
