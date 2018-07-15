package cn.edu360.javase35.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Object());
		c.add(new Object());
		c.add(new Object());
		c.add(new Object());
		c.add(new Object());
		c.add(new Object());
//		集合
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------");
//		迭代器
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
