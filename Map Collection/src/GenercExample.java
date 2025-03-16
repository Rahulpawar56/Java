
class Generics<E>
{
	void show(E e)
	{
		System.out.println("Value is "+e);
	}
}
public class GenercExample {

	public static void main(String[] args) {
		Generics<Integer> t=new Generics<Integer>();
		t.show(100);
		t.show(200);
		t.show(300);
	}

}
