package cn.edu360.javase35.day02;

public class ForTest2 {

	public static void main(String[] args) {
			int sum=0;
			for (int i=1;i<11;i++) {
				sum=sum+i;
	}
			System.out.println("1-10的和是"+sum);
	 sum =0;
	for (int i=1;i<101;i=i+2) {
		sum=sum+i;
	}
	System.out.println("1-100之间的奇数和是"+sum);
    	sum=0;
	for (int i=2;i<101;i=i+2) {
		sum=sum+i;
	}
	System.out.println("1-100之间的偶数的和是"+sum);
}
}