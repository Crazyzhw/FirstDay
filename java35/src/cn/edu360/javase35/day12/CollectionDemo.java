package cn.edu360.javase35.day12;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection  c = new ArrayList();
		c.add("你好");
		c.add("好");
		c.add("很好");
		System.out.println(c);
		c.remove("好");
		System.out.println(c);
		c.contains("很好");
		System.out.println(c);
		c.clear();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
	}
}
