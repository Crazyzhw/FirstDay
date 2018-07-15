package cn.edu360.javase35.day12;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("a");
		l.add("b");
		l.add("a");
		l.add("a");
		l.add("d");
		l.add("d");
		for(int i =0,z=l.size();i<z;i++) {
			for(int j=i+1;j<z;j++) {
				if(l.get(i).equals(l.get(j))) {
					l.set(j, "");
				}
			}
		}
		System.out.println(l.size());
		List  c = new ArrayList();
		c.add("");
		l.removeAll(c);
		System.out.println(l.size());
		Iterator it = l.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
		
		}

}
