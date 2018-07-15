package cn.edu360.javase35.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student ("lili",12));
		list.add(new Student ("haha",20));
		list.add(new Student ("xixi",30));
		list.add(new Student ("yuyu",10));
		list.add(new Student ("lili",40));
		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("----------------------");
		Student.l=false;
		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student);
		}
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getName().compareTo(o2.getName())==0){
					if(o1.getAge()>o2.getAge()) {
						return  1;
					}else if (o1.getAge()<o2.getAge()) {
						return -1;
					}else {
						return 0;
					}
				}
				return o1.getName().compareTo(o2.getName())>0?1:-1;
			}
		});
		System.out.println("----------------------");
		for (Student student : list) {
			System.out.println(student);
		}
		
	}
}
