package cn.edu360.javase35.day02;

public class WhileDemo1 {

	public static void main(String[] args) {
		int i =0;
		int sum1=0;
		int sum2=0;
		while (i<=100){
			
			if(i%2==0) {
				sum1+=i;
			}else
			{
			sum2+=i;
		}i++;
	}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
