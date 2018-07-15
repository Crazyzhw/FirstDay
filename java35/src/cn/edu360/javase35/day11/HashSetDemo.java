package cn.edu360.javase35.day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Random r = new Random();
		Set s = new HashSet();
		while (s.size()!= 10) {
			int num=r.nextInt(20)+1;
			s.add(num);
		}
		System.out.println(s);
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
