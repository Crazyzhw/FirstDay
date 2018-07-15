package cn.edu360.javase35.day06.Test;

public class MemberTest {
	 public static void main(String[] args) {
		 Member m = new Member();
		 m.setAge(20);
		 m.setName("赵某");
		 m.setSex('男');
		 System.out.println(m.getAge());
		 System.out.println(m.getName());
		 System.out.println(m.getSex());
		 m.show();;
	}
}
