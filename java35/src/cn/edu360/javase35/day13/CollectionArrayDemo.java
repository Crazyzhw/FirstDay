package cn.edu360.javase35.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionArrayDemo {
	public static void main(String[] args) {
//		集合转数组
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(12);
		l.add(12);
		l.add(12);
		Object [] s = l.toArray();
		System.out.println(Arrays.toString(s));
//		数组转集合
		Integer [] arr = {1,3,2,5,8,4,1};
		List<Integer> a = Arrays.asList(arr);
		System.out.println(a);
		try {
			a.add(1);
		} catch (UnsupportedOperationException e) {
			System.out.println("通过asList转过来的数组不能加减");
		}
		
	}
}
