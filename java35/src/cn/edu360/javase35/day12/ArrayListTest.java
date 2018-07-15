package cn.edu360.javase35.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("a");
		l.add("a");
		List t = new ArrayList();
		ListIterator it = l.listIterator();
		while(it.hasNext()) {
			String s =it.next()+"";
			if(!t.contains(s))
			{	
				t.add(s);
			}
		}
		Iterator it2 = t.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
