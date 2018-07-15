package cn.edu360.javase35.day04;

public class Test {

	public static void main(String[] args) {
		int money =0;
		int day=0;
		while (money<100
				) {
		   money +=3;
		   day++;
		   if (day%6==0) {
			   money-=5;
		   }
				}
		System.out.println(day);
	}

}
