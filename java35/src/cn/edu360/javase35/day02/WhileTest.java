package cn.edu360.javase35.day02;

public class WhileTest {

	public static void main(String[] args) {
			int  h =12;
			int count =0;
			while (h<4800) {
				h=h<<1;
				System.out.println(h);
				count++;
			}
			System.out.println(count);
	}

}
