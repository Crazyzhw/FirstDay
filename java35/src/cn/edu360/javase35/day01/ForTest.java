package cn.edu360.javase35.day01;

public class ForTest {

	public static void main(String[] args) {
//		获取1-100中6的倍数的个数
		int x,sum=0;
		for (x=1;x<=100;x++)
		{
			if (x%6==0) {
				sum++;
			}
	}
		System.out.println("1-100中6的倍数的个数是"+sum);
	}
}
