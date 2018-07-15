package cn.edu360.javase35.day02;

public class WhileTest2 {

	public static void main(String[] args) {
/*	需求：3. 求1~100之间不能被3整除的数之和
	4. 2006年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人？*/
	/*	int sum =0;
		int sum1=0;
		int sum2=0; 
		for (int x =1;x<=100;x++){
			sum2+=x;
			if (x%3!=0) {
				sum+=x;
			}else {
				sum1+=x;
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		if (sum==sum2-sum1) {
			System.out.println("bingo");*/
//	}
		double x =8;
		int count=0;
		while (x<20) {
			x=x*1.25;
			System.out.println(x);
			count++;
		}
		System.out.println("到"+(count+2006)+"年人数超过20万");
	}
}
