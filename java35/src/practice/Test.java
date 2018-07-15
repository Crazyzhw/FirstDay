package practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
		public static void main(String[] args) {
			Person p1 = new Person("zhang",12,80);
			Person p2 = new Person("li",12,90);
			Person p3 = new Person("wang",12,90);
			ArrayList<Person> l = new ArrayList<>();
			l.add(p1);
			l.add(p2);
			l.add(p3);
			Collections.sort(l);
			for (Person person : l) {
				System.out.println(person);
			}
			 String [][]  s = new String [10][20];
			 s[5][6]="5";
			 System.out.println(s[5][6]);
			int [] arr = {1,2,3,4,5,7,8,9};
				
			for (int i=0;i<arr.length/2;i++) {
					int temp =arr[i];
					arr[i]=arr[arr.length-1-i];
					arr[arr.length-1-i]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	
	 }

	

