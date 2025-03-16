package RevisionSecond;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class FindArrayListCursors {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		System.out.println("Using Iterator :");
		Iterator i = al.iterator();
		while (i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}
		System.out.println("==============================================\n");
		System.out.println("Using List Iterator :");
		Iterator i1 = al.listIterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println("==============================================\n");
		System.out.println("Using List Iterator Reverse  :");
		ListIterator li=al.listIterator(al.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		System.out.println("=============================================\n");
		System.out.println("Using Enumeration :");
		Enumeration<Integer> e=vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
