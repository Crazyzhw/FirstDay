package cn.edu360.javase35.day06.Test;

public class Member {
		private String name ;
		private int age ;
		private char sex ;
		public Member () {
			
		}
		public void setName (String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setAge (int age ) {
			this.age = age;
		}
		public int getAge () {
			return age;
		}
		public void setSex (char sex) {
			this.sex =sex ;
		}
		public char getSex () {
			return sex ;
		}
		public void show () {
			System.out.println("name:"+name+",age:"+age+",sex:"+sex);
		}
		
}
