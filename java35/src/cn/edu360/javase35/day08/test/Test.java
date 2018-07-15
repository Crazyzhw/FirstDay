package cn.edu360.javase35.day08.test;

public class Test {

	public static void main(String[] args) {
		
		Lady l = 	new Lady("小乔",new Cat("小花","红"));
		l.myPetEnjoy();
		Lady l1 = new Lady ("大乔",new Dog("李富贵","白色"));
		l1.myPetEnjoy();
	}

}
