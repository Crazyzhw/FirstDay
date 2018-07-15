package cn.edu360.javase35.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntegerSortDemo {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		System.out.println(l);
		Collections.sort(l, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(l);
	}
}
