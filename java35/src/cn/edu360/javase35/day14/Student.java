package cn.edu360.javase35.day14;

public class Student implements Comparable<Student>{
		private String name;
		private int age;
		public static  boolean l=true;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
					}
		public Student() {
			super();
		}
		@Override
		public int compareTo(Student o) {
			int temp;
			if ( l==true) {
				if (o.age-this.age>0) {
					temp= 1;
				}else if (o.age-this.age<0) {
					temp= -1;
				}else {
					temp= 0;
				}
			}else {
				if (o.age-this.age>0) {
					temp= -1;
				}else if (o.age-this.age<0) {
					temp= 1;
				}else {
					temp= 0;
				}
			}
			return temp==0?o.name.compareTo(this.name):temp;
		}
		
}
