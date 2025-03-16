import java.util.*;
class A
{
	void show() {
		System.out.println("I amA method");
	}
}
class B extends A{
	void display() {
		System.out.println("I am B method");
	}
}
class C extends B{
	void test() {
		System.out.println("I am C method");
	}
}
class Test{
	void testGen(List < ? super C>list) {
		B b1=(B)list.get(0);
		b1.display();
		b1.show();
	}
}
public class LowerBoundExample {

	public static void main(String[] args) {
		Test t=new Test();
		List<B>list=new ArrayList<B>();
		list.add(new B());
		list.add(new B());
		t.testGen(list);
	}

}
