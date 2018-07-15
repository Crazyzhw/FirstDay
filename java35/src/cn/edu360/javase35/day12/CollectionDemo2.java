package cn.edu360.javase35.day12;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		c1.add(13);
		c1.add(14);
		c1.add(12);
		c1.add(11);
		c2.add(12);
		c2.add("13");
		c2.add(14);
		c2.add(15);
		System.out.println(c1.addAll(c2));
		System.out.println(c1);
		System.out.println(c1.containsAll(c2));
		c1.retainAll(c2);
		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c1.removeAll(c2));
	}
}
