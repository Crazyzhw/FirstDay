package cn.edu360.javase35.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List  l = new ArrayList();
		l.add(0, "哈哈");
		l.add(1, "嘻嘻");
		l.add(2, "嘿嘿");
		l.add(3, "呵呵");
		
		ListIterator it = l.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		System.out.println(l.remove(1));
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.set(2, "哟哟"));
		System.out.println(l);
		
	}
}
