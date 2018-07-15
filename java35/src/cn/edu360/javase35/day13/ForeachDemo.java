package cn.edu360.javase35.day13;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachDemo {
	public static void main(String[] args) {
		int [] arr = {3,4,4,6,8,6};
		for (int i :arr) {
			System.out.println(i);
		}
		Collection<String> c = new ArrayList<String>();
		c.add("12");
		c.add("14");
		c.add("13");
		c.add("14");
		c.add("13");
		for(String s :c) {
			System.out.println(s);
		}
		Collection<Person> c1 =new ArrayList<Person>();
		c1.add(new Person("李四",20,'男'));
		c1.add(new Person("李武",20,'男'));
		c1.add(new Person("赵丽",20,'女'));
		c1.add(new Person("李四",20,'男'));
		c1.add(new Person("李四",20,'男'));
		if(c1!=null&&c1.size()>0) {
			for(Person p:c1) {
				System.out.println(p.toString());
			}
		}
	}
}
