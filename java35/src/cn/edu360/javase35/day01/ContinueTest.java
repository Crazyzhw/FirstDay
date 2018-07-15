package cn.edu360.javase35.day01;

public class ContinueTest {
public static void main(String[] args) {
	int sum =0;
	for  (int x = 1;x<=100;x++) {
		if (x % 6==0) {
			System.out.println("X="+x);
			sum++;
		}
			else {
		   continue;
	}
}
	System.out.println(sum);
}
}