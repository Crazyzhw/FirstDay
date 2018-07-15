package cn.edu360.javase35.day02;

public class Test {

	public static void main(String[] args) {
			int x =0;
			int sum=0 ;
			/*for (int i=0;i<=1000;i++) {
				if (sum<1024) {
					x++;
					sum=5*x;
					
				}else {
					break;
				}
				}
			System.out.println(x);*/
			int money = 0;
			int count = 0;
			while (money <1024) {
				money+=5;
				count++;
			}
			System.out.println(count);
	}

}
