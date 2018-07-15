package cn.edu360.javase35.day02;

public class WhileDemo {

	public static void main(String[] args) {
		int i =0;
		int sum =0;
		while(i<10) {
			i++;
			sum+=i;
			}
		System.out.println(sum);
		i=0;
		sum=0;
		while (i<11) {
			sum +=i;
			i++;
		}
		System.out.println(sum);
	}

}
