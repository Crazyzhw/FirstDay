package cn.edu360.javase35.day04;

public class WhileTest {
	public static void main(String[] args) {
		int x=1;
		int y ;
		while (x<=9) {
			y=1;
			while (y<=x) {
				System.out.print(x+"*"+y+"="+x*y+("\t"));
				y++;
			}
			x++;
			System.out.println();
		}
		
	}
}
